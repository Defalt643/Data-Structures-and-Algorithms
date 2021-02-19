package Week9;

public class SeparateChainingHashST <Key,Value> {
	private int M = 5;
	private Node[] st = new Node[M];
	
	private static class Node{
		private Object key;
		private Object val;
		private Node next;
		
		public Node(Object key2,Object val2,Node node) {
			key = key2;
			val = val2;
			next = node;
		}
	}

	private int hash(Key key){
		return(key.hashCode() & 0x7FFFFFFF)% M;
	}
	
	public Value get(Key key) {
		int i = hash(key);
		for(Node x = st[i]; x != null; x = x.next)
			if(key.equals(x.key))
				return(Value) x.val;
		return null;
	}
	
	public void put(Key key,Value val) {
		int i = hash(key);
		for(Node x = st[i]; x != null; x = x.next) {
			if(key.equals(x.key)) {
				x.val = val;
				return;
			}
		}
		st[i] = new Node(key,val,st[i]);
	}
	
	public void printNode() {
        int i = 0;
        for(i = 0; i < st.length;i++) {
            for(Node x= st[i];x != null;x = x.next){
                System.out.println(i+" -> "+x.key+" "+x.val);
            }
        }
	}

}
