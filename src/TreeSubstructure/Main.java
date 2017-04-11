package TreeSubstructure;

//�������ö�����A��B���ж�B�ǲ���A���ӽṹ����ps������Լ��������������һ�������ӽṹ��

//��������˼�ǰ�����һ���ڵ㣬�͵ð�������ڵ��µ����нڵ㡣
//�ӽṹ����˼�ǰ�����һ���ڵ㣬����ֻȡ���������������������߶���ȡ��

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
