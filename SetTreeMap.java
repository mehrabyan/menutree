package menutree;

import java.util.*;

public class SetTreeMap {

	public Tree<String> generateMenuTree() {
		Tree<String> menuTree = new Tree<String>();
		Node<String> root = menuTree.getRootNode();
		root.addChildNode(new Node<String>("New game"));
		root.addChildNode(new Node<String>("Load game"));
		root.addChildNode(new Node<String>("Save game"));
		root.addChildNode(new Node<String>("Help"));
		root.addChildNode(new Node<String>("Exit game"));
		
		Node<String> node = new Node<String>();
		node = root.getChildNode(1);
		node.addChildNode(new Node<String>("Comp vs Comp"));
		node.addChildNode(new Node<String>("Comp vs Human"));
		node.addChildNode(new Node<String>("Human vs Human"));
			Node<String> node1 = new Node<String>();
			node1 = node.getChildNode(1);
			node1.addChildNode(new Node<String>("Local game"));
			node1.addChildNode(new Node<String>("Net game"));
			
		node = root.getChildNode(2);
		node.addChildNode(new Node<String>("Load game from..."));
		node = root.getChildNode(3);
		node.addChildNode(new Node<String>("Save game to..."));
		
			return menuTree;
	}
}
