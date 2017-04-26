package BinaryTreeDepth;

//����һ�ö����������������ȡ�
//�Ӹ���㵽Ҷ������ξ����Ľ�㣨������Ҷ��㣩�γ�����һ��·�����·���ĳ���Ϊ������ȡ�

class Node{
	int val;
	Node left = null;
	Node right = null;
	
	public Node(int val){
		this.val = val;
	}
}


public class Main {
	
	public int Depth(Node root){
		if(root == null){
			return 0;
		}
		int left = Depth(root.left) + 1;
		int right = Depth(root.right) + 1;
		return (left > right) ? left : right;
	}
	
	public static void main(String[] args){
		Node root = new Node(10);
		Node a = new Node(9);
		Node b = new Node(8);
		Node c = new Node(7);
		Node d = new Node(6);
		Node e = new Node(5);
		Node f = new Node(4);
		Node g = new Node(3);
		
		root.left = a;
		root.right = b;
		a.left = c;
		a.right = d;
		c.left = e;
		e.left = f;
		f.right = g;
		
		System.out.println(new Main().Depth(root));
	}
}
