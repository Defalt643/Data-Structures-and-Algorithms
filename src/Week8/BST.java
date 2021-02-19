package Week8;

class BST<T extends Comparable<T>> {
	private Node root;
	private class Node {
		private T item;
		private Node left;
		private Node right;
		
		private Node(T item) {
			this.item = item;
			left = null;
			right = null;
		}
	}
	BST(){ root = null;}
	
	public void insert(T item) {
		root = insert(item, root);
	}
	private Node insert(T item, Node node) {
		if(node == null)
			return new Node(item);
	int cmp = item.compareTo(node.item);
	
	if(cmp < 0)
		node.left = insert(item, node.left);
	else if(cmp > 0)
		node.right = insert(item, node.right);
	return node;
	}
	
	public boolean search(T item) {
		return search(item, root);
	}
	private boolean search(T item, Node node) {
		while(node != null) {
		int cmp = item.compareTo(node.item);
		if(cmp < 0)
		node = node.left;
		else if(cmp > 0)
		node = node.right;
		else
		return true; //found item
		}
		return false; //no item found
	}
	public void preorder() {
		preorder(root);
		}
		private void preorder(Node node) {
		 if (node == null)
		 return;

		 System.out.print(node.item + " ");
		 preorder(node.left);
		 preorder(node.right);
	}
	public void postorder() {
			postorder(root);
			}
			private void postorder(Node node) {
			if(node==null)
			return;
			postorder(node.left);
			postorder(node.right);
			System.out.print(node.item+" ");
	}
	public void inorder() {
				inorder(root);
				}
				private void inorder(Node node) {
				 if (node == null)
				 return;
				 inorder(node.left);
				 System.out.print(node.item + " ");
				 inorder(node.right);
	}
}