
public class BST<K extends Comparable<K>, T> implements Map<K, T> {

	private BSTNode< K, T> root, current;
	
	public BST() {
		root = current = null;
	}
	
	@Override
	public boolean empty() {
		// TODO Auto-generated method stub
		return root == null;
	}

	@Override
	public boolean full() {
		// TODO Auto-generated method stub
		return false;
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
	public Pair<Boolean, Integer> find(K key) {
		// TODO Auto-generated method stub
		Integer count = 0;
		
		if(empty())
			return new Pair<Boolean,Integer>(false , count);
		
		BSTNode<K , T> p = root;

		
			while( p != null) {
				
				if(p.key.compareTo(key) > 0) { 
					count++;
					p = p.left;
				}
				
				else if(p.key.compareTo(key) < 0 ) {
					count++;
					p = p.right;
				}
				else if(p.key.compareTo(key) == 0){
					count++;
					current = p;
					return new Pair<Boolean,Integer>(true,count);
				}
							
			}
			
			return new Pair<Boolean,Integer>(false,count);
		
}

	@Override
	public Pair<Boolean, Integer> insert(K key, T data) {
		// TODO Auto-generated method stub
		BSTNode<K,T> p ;
		
		Integer count = 0;
		p = new BSTNode<K,T> (key,data);
		if(empty()) {
			root = current = p;
			return new Pair<Boolean,Integer>(true,0);	
		}
		BSTNode<K , T> q = root, s = root;
                while( q != null) {
                	s = q;
				if(q.key.compareTo(key) > 0) { 
					count++;
					q = q.left;
				}
				
				else if(q.key.compareTo(key) < 0 ) {
					count++;
					q = q.right;
				}
				else if(q.key.compareTo(key) == 0){
					count++;
					return new Pair<Boolean,Integer>(false,count);
				}
							
			}
                current = s;
                if(current.key.compareTo(key) > 0 ) 
                	current.left = p;
                else 
                	current.right = p;
                
                current = p;
                return new Pair<Boolean,Integer> (true,count);
		}
			
			

	@Override
	public Pair<Boolean, Integer> remove(K key) {
		// TODO Auto-generated method stub
		BSTNode<K,T> p = root , q = root;
		Integer count = 0;
		K k1 = key;
		while( p != null) {
			if(p.key.compareTo(key) > 0 ) {
				count++;
				q = p;
				p = p.left;
			}else if(p.key.compareTo(key) < 0 ) {
				count++;
				q = p;
				p = p.right;
			}else {
				count++;
				if(p.left != null && p.right != null) {
					BSTNode<K,T> min = p.right;
					q = p ;
					while(min.left != null) {
						q = min;
						min = min.left;
					}
					p.data = min.data;
					p.key = min.key;
					k1 = min.key;
					p = min;
					
				}
				
				if(p.left != null)
					p = p.left;
				else
					p = p.right;
				
				if(q == null)
					root = p;
				else {
					if(q.key.compareTo(key) > 0)
						q.left = p;
					else
						q.right = p;
				}
				
				current = root;
				return new Pair<Boolean,Integer>(true,count);
				
			}
		}
		
		return new Pair<Boolean,Integer>(false,count);
	}

	@Override
	public List<K> getAll() {
		// TODO Auto-generated method stub
		LinkedList<K> l1 = new LinkedList<K>();
		if(root == null)
			return l1;
		return getAll2(root , l1);
	}
	
	private List<K> getAll2(BSTNode<K,T> r, LinkedList<K> l1){
		if(r == null)
			return null;
		
		
	    getAll2(r.left,l1);
		l1.insert(r.key);
	    getAll2(r.right,l1);
	    
	    return l1;
		
	}
	
	/*public void displayinorder() {
		if (root == null)
			System.out.println("Empty BST");
		else
			displaykeyinorder(root);
		System.out.println();
	}
	private void displaykeyinorder(BSTNode<K,T> p) {
		if(p == null)
			return;
		
		else {
			displaykeyinorder(p.left);
			System.out.print(p.key+" "+p.data+",  ");
			displaykeyinorder(p.right);
		}
	}*/

}
