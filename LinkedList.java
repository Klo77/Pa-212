
public class LinkedList<T> implements List<T> {
	
	private ListNode<T> current,head;

	
	public LinkedList() {
		head = current = null;
	}
	
	
	@Override
	public boolean empty() {
		// TODO Auto-generated method stub
		
		return head == null ;
	}

	@Override
	public boolean full() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void findFirst() {
		// TODO Auto-generated method stub
		current = head;

	}

	@Override
	public void findNext() {
		// TODO Auto-generated method stub
		current = current.next;

	}

	@Override
	public boolean last() {
		// TODO Auto-generated method stub
		return current.next == null;
	}

	@Override
	public T retrieve() {
		// TODO Auto-generated method stub
		return current.data;
	}

	@Override
	public void update(T e) {
		// TODO Auto-generated method stub
		current.data = e;

	}

	@Override
	public void insert(T e) {
		// TODO Auto-generated method stub
		ListNode<T> tmp;
		if(head == null)
			head = current = new ListNode<T>(e);
		else {
			tmp = current.next;
			current.next = new ListNode<T> (e);
			current = current.next;
			current.next = tmp;
		}

	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub
		if(current == head)
			head = head.next ;
		else {
			ListNode<T> p = head;
			while(p.next  != current)
				p = p.next;
			p.next = current.next;
			
		}
		
			if(current.next == null)
				current = head;
			else
				current = current.next;
		

	}

}
