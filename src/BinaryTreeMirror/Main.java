package BinaryTreeMirror;

import java.util.Stack;

//操作给定的二叉树，将其变换为源二叉树的镜像。 
//输入描述:
//二叉树的镜像定义：源二叉树 
//    	    8
//    	   /  \
//    	  6   10
//    	 / \  / \
//    	5  7 9 11
//    	镜像二叉树
//    	    8
//    	   /  \
//    	  10   6
//    	 / \  / \
//    	11 9 7  5

class TreeNode{
	int val = 0;
	TreeNode left = null;
	TreeNode right = null;
	
	public TreeNode(int val){
		this.val = val;
	}
}


public class Main {
	
	public void preOrder(TreeNode root){
		if(root != null){
			System.out.println(root.val);
			preOrder(root.left);
			preOrder(root.right);
		}
	}
	
	public void Mirror(TreeNode root){
		if(root == null){
			return;
		}
		
		if(root.left == null && root.right == null){
			return;
		}
		
		TreeNode tmp = null;
		tmp = root.left;
		root.left = root.right;
		root.right = tmp;
		if(root.left != null){
			Mirror(root.left);
		}
		if(root.right != null){
			Mirror(root.right);
		}
	}
	
	public void useStackMirror(TreeNode root){
		Stack<Integer> stack = new Stack<Integer>();
		
	}
	
	public static void main(String[] args){
		Main m = new Main();
		TreeNode a = new TreeNode(8);
		TreeNode b = new TreeNode(6);
		TreeNode c = new TreeNode(10);
		TreeNode d = new TreeNode(5);
		TreeNode e = new TreeNode(7);
		TreeNode f = new TreeNode(9);
		TreeNode g = new TreeNode(11);
		
		a.left = b;
		a.right = c;
		b.left = d;
		b.right = e;
		c.left = f;
		c.right = g;
		
		m.Mirror(a);
		m.preOrder(a);
	}
	
	
}
