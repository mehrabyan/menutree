package menutree;

import java.util.Map;
import java.util.TreeMap;

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
	
//	public Node<T> getCurrentNode(Node<T> node) {
//		return node;
//	}
	
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

	public void addChildNode(Node<T> node) {
		if (node != null && !children.values().contains(node)) {
			if (!children.isEmpty()) {
				int i = 0;
				i = ((TreeMap<Integer, Node<T>>) children).lastKey();
				children.put(i + 1, node);
			} else
				children.put(1, node);
			node.setParent(this);
		}
	}
}