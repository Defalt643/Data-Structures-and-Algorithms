package Week9;

public class SeparateChainingHashST <Key,Value>{
	private int M = 8;
	private Value[] vals = (Value[]) new Object[M];
	private Key[] keys = (Key[]) new Object[M];
	private Node[] st = new Node[M];
	private static class Node{
		private Object key;
		private Object Value;
		private Node next;
	}private int hash(Key key) {
		return (key.hashCode() & 0x7fffffff) % M;
	}public void put(Key key,Value val) {
		int i =hash(key);
		for(Node x = st[i];x!=null;x=x.next) {
			if(key.equals(x.key)) {
				x.Value=val;
				return;
			}
		}
		st[i] = new Node(key, val,st[i]);
	}public Value get(Key key) {
		int i = hash(key);
		for(Node x = st[i]; x!=null;x=x.next)
			if(key.equals(x.key))
				return (Value) x.Value;
		return null;
	}public void printNode() {
		int i=4;
		for(Node x = st[i];x !=null;x=x.next) {
			System.out.println(i+" -> "+x.key+" "+x.Value);
		}
	}
}
