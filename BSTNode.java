
public class BSTNode< K extends Comparable<K> ,T> {
	public T data;
	public K key;
	public BSTNode <K,T> left ,right;
	
	
	public BSTNode() {
		
	}
	
	public BSTNode(K key , T d) {
		data = d;
		this.key = key;
		left = right = null;
	}

}
