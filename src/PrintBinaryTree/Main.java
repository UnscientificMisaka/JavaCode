package PrintBinaryTree;
//z形打印二叉树
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Stack;

class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}

public class Main {
	public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
		ArrayList <ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
		if(pRoot == null){
			return res;
		}
		
		Stack<TreeNode> s1 = new Stack<TreeNode>();// 奇数层
		Stack<TreeNode> s2 = new Stack<TreeNode>();// 偶数层
		
		boolean flag = true;
		s1.add(pRoot);
		
		while(!(s1.isEmpty() && s2.isEmpty())){
			ArrayList<Integer> tmp = new ArrayList<Integer>();
			if(flag == true){
				while(!s1.isEmpty()){
					TreeNode cur = s1.pop();
					tmp.add(cur.val);
					if(cur.left != null){
						s2.push(cur.left);
					}
					if(cur.right != null){
						s2.push(cur.right);
					}
				}
				res.add(tmp);
				flag = false;
			}else{
				while(!s2.isEmpty()){
					TreeNode cur = s2.pop();
					tmp.add(cur.val);
					if(cur.right != null){
						s1.push(cur.right);
					}
					if(cur.left != null){
						s1.push(cur.left);
					}
				}
				res.add(tmp);
				flag = true;
			}	
		}
		return res;
    }
	// 换行打印二叉树
	public ArrayList<ArrayList<Integer>> Print2(TreeNode root) {
		ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
		ArrayDeque<TreeNode> q = new ArrayDeque<TreeNode>();
		if(root == null){
			return res;
		}
		
		q.add(root);
		TreeNode last = root;
		TreeNode nlast = null;
		ArrayList<Integer> tmp = new ArrayList<Integer>();
		while(!q.isEmpty()){
			TreeNode cur = q.remove();
			tmp.add(cur.val);
			if(cur.left != null){
				q.add(cur.left);
				nlast = cur.left;
			}
			if(cur.right != null){
				q.add(cur.right);
				nlast = cur.right;
			}
			if(cur == last){
				res.add(tmp);
				last = nlast;
				tmp = new ArrayList<Integer>();
			}
		}
		return res;
	}
	
	public static void main(String[] args){
		TreeNode first = new TreeNode(1);
		TreeNode second = new TreeNode(2);
		TreeNode third = new TreeNode(3);
		TreeNode forth = new TreeNode(4);
		TreeNode fifth = new TreeNode(5);
		TreeNode sixth = new TreeNode(6);
		
		first.left = second;
		first.right = third;
		second.left = forth;
		third.left = fifth;
		third.right = sixth;
	
		ArrayList<ArrayList<Integer>> res = new Main().Print(first);
		for(ArrayList<Integer> tmp : res){
			for(int i : tmp){
				System.out.print(i+" ");
			}
			System.out.println("");
		}
	}
	
	
}
