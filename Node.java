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

	public Map<Integer, Node<T>> getChildren() {
		return children;
	}
	
	public Node<T> getChildNode(int i) {
		return children.get(i);
	}

	public void setChildren(Map<Integer, Node<T>> children) {
		this.children = children;
		// addChildNode(node);
		for (Node<T> node : children.values())
			node.setParent(this);
	}
	
	public Node<T> makeNode(T content) {
		return new Node<T>(content);
	}

	public void addChildNode(Node<T> node) {
		if (node != null && !children.values().contains(node)) {
			int i = 0;
			if (!children.isEmpty()) {
			i = ((TreeMap<Integer, Node<T>>) children).lastKey();
			children.put(i + 1, node);
			}
			else children.put(1, node);
			node.setParent(this);
		}
	}
}