package IsMirrorBinaryTree;

//��Ŀ����
//��ʵ��һ�������������ж�һ�Ŷ������ǲ��ǶԳƵġ�
//ע�⣬���һ��������ͬ�˶������ľ�����ͬ���ģ�������Ϊ�ԳƵġ�

class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}

public class Main {
	
	public boolean isSymmetrical(TreeNode pRoot){
		if(pRoot == null){
			return true;
		}
		return traversal(pRoot.left, pRoot.right);
	}
	
	public boolean traversal(TreeNode left, TreeNode right){
		if(left == null && right == null){
			return true;
		}
		
		if(left == null || right == null){
			return false;
		}
		
		if(left.val != right.val){
			return false;
		}
		return traversal(left.right,right.left) && traversal(left.left,right.right);
	}
	
	
	
	public static void main(String[] args){
		
	}
}
