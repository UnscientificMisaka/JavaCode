package IsBalanceBinaryTree;



//输入一棵二叉树，判断该二叉树是否是平衡二叉树。
class TreeNode{
	int val;
	TreeNode left = null;
	TreeNode right = null;
	
	public TreeNode(int val){
		this.val = val;
	}
}

public class Main {
	
	public boolean isBalanced(TreeNode root){
		int depth = 0;
		if(root == null){
			return true;
		}
		int left = getDepth(root.left);
		int right = getDepth(root.right);
		if(Math.abs(left-right) > 1){
			return false;
		}else{
			return (isBalanced(root.left) && isBalanced(root.right));
		}
	}
	
	public int getDepth(TreeNode root){
		if(root == null){
			return 0;
		}
		int left = getDepth(root.left); 
		int right = getDepth(root.right);
		return left > right ? left+1 : right+1;
	}
	
	public static void main(String[] args){
		TreeNode a = new TreeNode(10);
		TreeNode b = new TreeNode(4);
		TreeNode c = new TreeNode(2);
		TreeNode d = new TreeNode(6);
		TreeNode e = new TreeNode(5);
		TreeNode f = new TreeNode(8);
		TreeNode g = new TreeNode(12);
		TreeNode h = new TreeNode(11);
		TreeNode i = new TreeNode(13);
		
		a.left = b;
		a.right = g;
		b.left = c;
		b.right = d;
		d.left = e;
		d.right = f;
		g.left = h;
		g.right = i;
		
		Main m = new Main();
		System.out.println(m.getDepth(a));
	}
}
