package BinarySearchTreeToLinkedList;


class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}


public class Main {
	TreeNode head = null;
	TreeNode res = null;
	
	public TreeNode Convert(TreeNode root){
		recursion(root);
		return res;
	}
	
	public void recursion(TreeNode root){
		if(root == null){
			return;
		}
		recursion(root.left);
		if(head == null){
			head = root;
			res = head;
		}else{
			head.right = root;
			root.left = head;
			head = root;
		}
		recursion(root.right);
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
		m.Convert(a);
		while(m.res!=null){
			System.out.println(m.res.val);
			m.res = m.res.right;
		}
	}
}
