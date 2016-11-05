package menutree;

import java.util.*;

public class Node<T> {
	private T content;
	private Node<T> parent;
	private Map<Integer, Node<T>> children = new TreeMap<Integer, Node<T>>();

	public Node() {
	}

	public Node(T content) {
		this.content = content;
	}

	public T getContent() {
		return content;
	}

	public void setContent(T content) {
		this.content = content;
	}

	public Node<T> getParent() {
		return parent;
	}

	public void setParent(Node<T> parent) {
		this.parent = parent;
	}

	// public void setParents(Node<T> parent) {
	// for(Node<T> node : children.values())
	// node.parent = parent;
	// }

	public Map<Integer, Node<T>> getChildren() {
		return children;
	}

	public void setChildren(Map<Integer, Node<T>> children) {
		this.children = children;
		// addChildNode(node);
	}

	public void addChildNode(Node<T> node) {
		if (node != null && !children.values().contains(node)) {
			children.values().add(node);
			node.setParent(this);
		}
	}
}