package RebuildBinaryTree;



class Node{
	int value;
	Node leftChild;
	Node rightChild;
	public Node(int value){
		this.value = value;
	}
}


public class test {
	
	public void preOrder(Node node){
		if(node != null){
			System.out.print(node.value);
			preOrder(node.leftChild);
			preOrder(node.rightChild);
		}
	}
	
	
	public Node rebuild(int[] preOrder,int[] inOrder){
		Node root = new Node(preOrder[0]);
		
		int leftNum = 0;
		int rightNum = 0;
		
		for(int i = 0;i<inOrder.length;i++){
			if(inOrder[i] == preOrder[0]){
				break;
			}else{
				leftNum++;
			}
		}
		rightNum = preOrder.length - leftNum - 1;
		
//		System.out.print("left child :"+leftNum);
//		System.out.println("");
//		System.out.print("right child :"+rightNum);
//		System.out.println("");
		
		if(leftNum > 0){
			int[] leftPreOrder = new int[leftNum];
			int[] leftInOrder = new int[leftNum];
			for(int i = 0;i<leftNum;i++){
				leftPreOrder[i] = preOrder[i+1];
				leftInOrder[i] = inOrder[i];
			}
			Node left = rebuild(leftPreOrder,leftInOrder);
			root.leftChild = left;	
		}
		
		if(rightNum > 0){
			int[] rightPreOrder = new int[rightNum];
			int[] rightInOrder = new int[rightNum];
			for(int i = 0;i<rightNum;i++){
				rightPreOrder[i] = preOrder[leftNum+i+1];
				rightInOrder[i] = inOrder[leftNum+i+1];
			}
			Node right = rebuild(rightPreOrder,rightInOrder);
			root.rightChild = right;	
		}
		
		return root;
	}
	
	public static void main(String[] args){
		int[] preOrder = {1,2,4,7,3,5,6,8};
		int[] inOrder = {4,7,2,1,5,3,8,6};
		test t = new test();
		Node rebuildNode = t.rebuild(preOrder,inOrder);
		t.preOrder(rebuildNode);
	}
}
