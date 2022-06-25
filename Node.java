
public class Node<T> {
public List<T> data;
public Location loc;
public Node<T> first,second,third,fourth;

public Node(List<T> d , Location l) {
	data = d;
	loc = l;
	first = second = third = fourth = null;

}

public Node() {
	
}

}
