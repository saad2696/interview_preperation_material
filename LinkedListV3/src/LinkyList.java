public class LinkyList {
	Node head;
	public void insert(int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;

        if (head == null) {
            head = node;
        } else {
            Node n = head;
            while (n.next != null) {
                n = n.next;
            }
            n.next = node;
        }
    }
	
	
	public void insertAtStart(int data) {
		Node node = new Node();
		node.data = data;
		node.next = head;
		head = node;
	}
	
	
	public void insertAtEnd(int data) {
		Node node = new Node();
		node.data = data;
		Node traverse = head;
		while(traverse.next!=null) {		
			traverse = traverse.next;	
			
		}

		traverse.next = node;
		node.next = null;
	}
	
	
	public void insertAt(int data, int index) {
		Node node = new Node();
		node.data=data;
		 if (index==0 || index==1) {
			 insertAtStart(data);
		}else {
			Node temp;
			Node n  = head;
			for( int i=0;i<index-2;i++) {
				n = n.next;
			}
			temp  =  n.next;
			n.next = node;
			node.next = temp;
			
		}
		
		
		
		
	}
	
	
	public void deleteAt(int index) {
		if (index==0) {
			head = head.next;
		}else {
			
			Node n  = head;
			for( int i=0;i<index-2;i++) {
				n = n.next;
			}
			
			n.next = n.next.next;
			
			
		}
		
	}
	
	
	public void deleteatEnd() {
		Node n = head;
		Node prev;
		while(n.next!=null) {
			prev = n;
			n=n.next;
			if(n.next==null) {
				prev.next = null;
				
			}
		}
		
		 
	}
	
	public void ReverseLinkList() {
		System.out.println("------------");
		Node current = head;
		Node previous = null;
		Node next = null;
		while(current!=null) {
			next = current.next;
			current.next = previous;
			previous = current;
			current = next;
			
			
		}
		 while (previous.next != null) {
	            System.out.println(current.data);
	           
	           previous = previous.next;

	          
	      
	        }
	        System.out.println(previous.data);

	}

    public void show() {
        Node node = head;
        while (node.next != null) {
            System.out.println(node.data);
           
            node = node.next;

          
      
        }
        System.out.println(node.data);

    }
}
