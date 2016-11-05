package menutree;

public class Tree<T> {
	public Node<T> rootNode = new Node<T>();

	public Node<T> getRootNode() {
		return rootNode;
	}

	public void setRootNode(Node<T> node) {
		this.rootNode = node;
	}
}