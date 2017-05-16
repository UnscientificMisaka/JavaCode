package SerializeBinaryTree;

// 序列化与反序列化二叉树
class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}

public class Main {
	String res = "";
	int index;
	public String Serialize(TreeNode root){
		if(root == null){
			return res;
		}
		preOrder(root);
		String tmp = "";
		char[] arr = res.toCharArray();
		for(int i = 0;i<arr.length;i++){
			if(arr[i] == '#'){
				continue;
			}else{
				tmp += String.valueOf(arr[i]);
			}
		}
		return tmp;
	}
	
	public void preOrder(TreeNode cur){
		if(cur != null){
			res += cur.val;
			preOrder(cur.left);
			preOrder(cur.right);
		}else{
			res += '#';
		}
	}
	
	public TreeNode Deserialize(String str){
		TreeNode res = null;
		if(str == null){
			return res;
		}
		index = -1;
		char[] arr = str.toCharArray();
		res = DePreOrder(arr);
		return res;
	}
	
	public TreeNode DePreOrder(char[] arr){
			index++;
			if(index >= arr.length){
				return null;
			}
			if(arr[index] == '#'){
				return null;
			}
			else{			
				TreeNode root = new TreeNode(Integer.parseInt(String.valueOf(arr[index])));
				root.left = DePreOrder(arr);
				root.right = DePreOrder(arr);
				return root;
			}
	}
	
	
	public static void main(String[] args){
		TreeNode first = new TreeNode(1);
		TreeNode second = new TreeNode(2);
		TreeNode third = new TreeNode(3);
		TreeNode forth = new TreeNode(4);
		TreeNode fifth = new TreeNode(5);
		TreeNode sixth = new TreeNode(6);
		
		first.left = second;
		first.right = third;
		second.left = forth;
		third.left = fifth;
		third.right = sixth;
		Main m = new Main();
		System.out.println(m.Serialize(first));
	
		System.out.println(m.Deserialize(m.res).right.val);

	}
}

