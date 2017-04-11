package TreeSubstructure;

//输入两棵二叉树A，B，判断B是不是A的子结构。（ps：我们约定空树不是任意一个树的子结构）

//子树的意思是包含了一个节点，就得包含这个节点下的所有节点。
//子结构的意思是包含了一个节点，可以只取左子树或者右子树，或者都不取。

class TreeNode{
	int val = 0;
	TreeNode left = null;
	TreeNode right = null;
	
	public TreeNode(int val){
		this.val = val;
	}
}


public class Main {
	
	public boolean preOrder(TreeNode root1,TreeNode root2){
		boolean result = false;
		if(root1 != null && root2 !=null){	
			if(root1.val == root2.val){
				result = HasSubtree(root1,root2);
			}
//			else{
				if(!result){
					result = preOrder(root1.left,root2);
				}
				if(!result){
					result =  preOrder(root1.right,root2);
				}
//			}
		}
		return result;
	}
	
	
	public boolean HasSubtree(TreeNode root1,TreeNode root2){
		if(root1 == null && root2 !=null){
			return false;
		}
		if(root2 == null){
			return true;
		}
		if(root1.val != root2.val){
			return false;
		}
		return HasSubtree(root1.left,root2.left) && HasSubtree(root1.right,root2.right);
	}
	
	public static void main(String[] args){
		Main m = new Main();
		TreeNode a = new TreeNode(8);
		TreeNode b = new TreeNode(8);
		TreeNode c = new TreeNode(7);
		TreeNode d = new TreeNode(9);
		TreeNode e = new TreeNode(2);
		TreeNode f = new TreeNode(4);
		TreeNode g = new TreeNode(7);
		
		TreeNode h = new TreeNode(8);
		TreeNode i = new TreeNode(9);
		TreeNode j = new TreeNode(2);
		
		a.left = b;
		a.right = c;
		b.left = d;
		b.right = e;
		e.left = f;
		e.right = g;
		
		h.left = i;
		h.right = j;
		
		System.out.println(m.preOrder(a, h));
	}
}
