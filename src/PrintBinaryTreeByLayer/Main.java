package PrintBinaryTreeByLayer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class TreeNode{
	int val;
	TreeNode left = null;
	TreeNode right = null;
	
	public TreeNode(int val){
		this.val = val;
	}
}


public class Main {
	public ArrayList<Integer> PrintFromTopToBottom(TreeNode root){
		ArrayList<Integer> res = new ArrayList<Integer>();
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		if(root == null){
			return res;
		}
		q.offer(root);
		while(!q.isEmpty()){
			TreeNode tmp = q.poll();
			if(tmp.left != null){
				q.offer(tmp.left);
			}
			if(tmp.right != null){
				q.offer(tmp.right);
			}
			res.add(tmp.val);
		}	
		return res;
	}
	
	public static void main(String[] args){
		TreeNode a = new TreeNode(1);
		TreeNode b = new TreeNode(2);
		TreeNode c = new TreeNode(3);
		TreeNode d = new TreeNode(4);
		TreeNode e = new TreeNode(5);
		
		a.left = b;
		a.right = c;
		b.left = d;
		c.right = e;
		
		Main m = new Main();
		ArrayList<Integer> res = new ArrayList<Integer>();
		res = m.PrintFromTopToBottom(a);
		for(int i = 0;i<res.size();i++){
			System.out.print(res.get(i)+"");
		}
	}
}
