package FirstPublicNode;

class Node{
	int val;
	Node next = null;
	
	public Node(int val){
		this.val = val;
	}
}

public class Main {
	// O(mn)
	public Node FindFirstCommonNode(Node pHead1,Node pHead2){
		while(pHead1!=null&&pHead2!=null){
			if(pHead1.val == pHead2.val){
				return pHead1;
			}else{
				if(pHead2.next == null){
					pHead1 = pHead1.next;
				}else{
					pHead2 = pHead2.next;
				}
			}
		}
		return null;
	}
	
	// O(m+n)
	public Node FindFirstCommonNode2(Node pHead1,Node pHead2){
		int count1 = 0;
		int count2 = 0;
		Node tmp1 = pHead1;
		Node tmp2 = pHead2;
		while(tmp1!=null){
			count1++;
			tmp1 = tmp1.next;
		}
		while(tmp2!=null){
			count2++;
			tmp2 = tmp2.next;
		}
		int dis = count1 - count2;
		if(dis > 0){
			for(int i = 0;i<dis;i++){
				pHead1 = pHead1.next;
			}
		}else{
			for(int i = 0;i<-dis;i++){
				pHead2 = pHead2.next;
			}
		}
		while(pHead1!=null && pHead2!=null){
			if(pHead1 != pHead2){
				pHead1 = pHead1.next;
				pHead2 = pHead2.next;
			}else{
				return pHead1;
			}
		}
		return null;	
	}
	
	public static void main(String[] args){
		Node first = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		Node forth = new Node(4);
		
		first.next = second;
		second.next = third;
		third.next = forth;
		
		Node fifth = new Node(5);
		Node sixth = new Node(6);

		
		fifth.next = sixth;
		sixth.next = forth;
		
		Main m = new Main();
		Node res = m.FindFirstCommonNode(first, fifth);
		res = m.FindFirstCommonNode2(first, fifth);
		
		System.out.println(res.val);
	}
}
