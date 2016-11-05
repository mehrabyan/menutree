package menutree;

import java.util.*;

public class SetTreeMap {

	public Tree<String> generateMenuTree() {
		Tree<String> menuTree = new Tree<String>();
		Node<String> node11 = new Node<String>("New game");
		Node<String> node12 = new Node<String>("Load game");
		Node<String> node13 = new Node<String>("Save game");
		Node<String> node14 = new Node<String>("Help");
		Node<String> node15 = new Node<String>("Exit game");
		// List<Node<String>> children1 = new ArrayList<Node<String>>();
		Map<Integer, Node<String>> childmap1 = new TreeMap<Integer, Node<String>>();
		childmap1.put(1, node11);
		childmap1.put(2, node12);
		childmap1.put(3, node13);
		childmap1.put(4, node14);
		childmap1.put(5, node15);
		menuTree.getRootNode().setChildren(childmap1);
		menuTree.getRootNode().setParent(null);
		for (Node<String> node : childmap1.values())
			node.setParent(menuTree.rootNode);

		Node<String> node111 = new Node<String>("Comp vs Comp");
		Node<String> node112 = new Node<String>("Comp vs Human");
		Node<String> node113 = new Node<String>("Human vs Human");
		// List<Node<String>> children11 = new ArrayList<Node<String>>();
		Map<Integer, Node<String>> childmap11 = new TreeMap<Integer, Node<String>>();
		childmap11.put(1, node111);
		childmap11.put(2, node112);
		childmap11.put(3, node113);
		node11.setChildren(childmap11);
		for (Node<String> node : childmap11.values())
			node.setParent(node11);
		
		Node<String> node1111 = new Node<String>("Local comp game");
		Node<String> node1112 = new Node<String>("Net comp game");
		Map<Integer, Node<String>> childmap111 = new TreeMap<Integer, Node<String>>();
		childmap111.put(1, node1111);
		childmap111.put(2, node1112);
		node111.setChildren(childmap111);
		for(Node<String> node : childmap111.values())
			node.setParent(node111);
		
		Node<String> node1121 = new Node<String>("Local  game");
		Node<String> node1122 = new Node<String>("Net game");
		Map<Integer, Node<String>> childmap112 = new TreeMap<Integer, Node<String>>();
		childmap112.put(1, node1121);
		childmap112.put(2, node1122);
		node112.setChildren(childmap112);
		for(Node<String> node : childmap112.values())
			node.setParent(node112);
		
		Node<String> node1131 = new Node<String>("Local  game");
		Node<String> node1132 = new Node<String>("Net game");
		Map<Integer, Node<String>> childmap113 = new TreeMap<Integer, Node<String>>();
		childmap113.put(1, node1131);
		childmap113.put(2, node1132);
		node113.setChildren(childmap113);
		for(Node<String> node : childmap113.values())
			node.setParent(node113);
		
		Node<String> node121 = new Node<String>("Load game from...");
		Map<Integer, Node<String>> childmap12 = new TreeMap<Integer, Node<String>>();
		childmap12.put(1, node121);
		node12.setChildren(childmap12);
		for (Node<String> node : childmap12.values())
			node.setParent(node12);

		Node<String> node131 = new Node<String>("Save game to...");
		Map<Integer, Node<String>> childmap13 = new TreeMap<Integer, Node<String>>();
		childmap13.put(1, node131);
		node13.setChildren(childmap13);
		for (Node<String> node : childmap13.values())
			node.setParent(node13);

		Node<String> node141 = new Node<String>("Help");
		Node<String> node142 = new Node<String>("Large Help");
		Map<Integer, Node<String>> childmap14 = new TreeMap<Integer, Node<String>>();
		childmap14.put(1, node141);
		childmap14.put(2, node142);
		node14.setChildren(childmap14);
		for (Node<String> node : childmap14.values())
			node.setParent(node14);

		Node<String> node151 = new Node<String>("Exit game with saving");
		Node<String> node152 = new Node<String>("Exit game ");
		Map<Integer, Node<String>> childmap15 = new TreeMap<Integer, Node<String>>();
		childmap15.put(1, node151);
		childmap15.put(2, node152);
		node15.setChildren(childmap15);
		for (Node<String> node : childmap15.values())
			node.setParent(node15);

		return menuTree;
	}
}
