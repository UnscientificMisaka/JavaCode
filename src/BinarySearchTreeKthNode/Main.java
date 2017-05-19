package BinarySearchTreeKthNode;
//给定一颗二叉搜索树，请找出其中的第k大的结点。
//例如， 5 / \ 3 7 /\ /\ 2 4 6 8 中，按结点数值大小顺序第三个结点的值为4。

class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}
public class Main {
	int count = 0;
	TreeNode res;
	public TreeNode KthNode(TreeNode root, int k){
		this.count = k;
		InOrder(root);
		return res;
	}
	
	public void InOrder(TreeNode root){
		if(root != null){
			InOrder(root.left);
			count--;
			System.out.println(root.val +": "+count);
			if(count == 0){
				res = root;
			}
			InOrder(root.right);
		}
		
	}
	
	
	public static void main(String[] args){
		Main m = new Main();
		TreeNode first = new TreeNode(5);
		TreeNode second = new TreeNode(3);
		TreeNode third = new TreeNode(7);
		TreeNode forth = new TreeNode(2);
		TreeNode fifth = new TreeNode(4);
		TreeNode sixth = new TreeNode(6);
		TreeNode seventh = new TreeNode(8);
		
		first.left = second;
		first.right = third;
		second.left = forth;
		second.right = fifth;
		third.left = sixth;
		third.right = seventh;
		
		System.out.println(m.KthNode(first, 3).val);
		
	}
}
