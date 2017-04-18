package BinaryTreePath;

import java.util.ArrayList;

import BinaryTreeMirror.Main;
import BinaryTreeMirror.TreeNode;

//����һ�Ŷ�������һ����������ӡ���������н��ֵ�ĺ�Ϊ��������������·����
//·������Ϊ�����ĸ���㿪ʼ����һֱ��Ҷ����������Ľ���γ�һ��·����

class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;
    }

}


public class Main {

	ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
	ArrayList<Integer> path = new ArrayList<Integer>();

	public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target){
		if(root == null){
			return res;
		}
		path.add(root.val);
		target = target - root.val;
		if(target == 0 && root.left == null && root.right == null){
			res.add(new ArrayList<Integer>(path));
		}
		FindPath(root.left,target);
		FindPath(root.right,target);
		path.remove(path.size() - 1);
		return res;
	}
	
}
