package MinimumDepthOfBinaryTree;
//Given a binary tree, find its minimum depth.The minimum depth is the number of nodes 
//along the shortest path from the root node down to the nearest leaf node

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int x){
		this.val = x;
	}
}

public class Main {
	
	public int depth(TreeNode root){
		if(root == null){
			return 0;
		}
		
		if(root.left == null && root.right == null){
			return 1;
		}
		
		if(root.left == null){
			return depth(root.right) + 1;
		}
		
		if(root.right == null){
			return depth(root.left) + 1;
		}
		int left = depth(root.left) + 1;
		int right = depth(root.right) + 1;
		return left < right ? left : right;
	}
	
	public static void main(String[] args){
		TreeNode first = new TreeNode(1);
		TreeNode second = new TreeNode(2);
		TreeNode third = new TreeNode(3);
		TreeNode forth = new TreeNode(4);
		TreeNode fifth = new TreeNode(5);
		
		first.left = second;
//		first.right = third;
//		second.right = forth;
//		forth.left = fifth;
		
		System.out.println(new Main().depth(first));
	}
}
