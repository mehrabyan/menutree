package menutree;

import java.util.*;

public class SetTreeMap {

	public Tree<String> generateMenuTree() {
		Tree<String> menuTree = new Tree<String>();
		Node<String> root = menuTree.getRootNode();
		MenuItems items = new MenuItems();
		for(int i = 0; i < items.level1.length; i++) 
		root.addChildNode(new Node<String>(items.level1[i]));
		
		Node<String> node = new Node<String>();
		
		node = root.getChildNode(1);
		for(int j = 0; j < items.level11.length; j++)  
		node.addChildNode(new Node<String>(items.level11[j]));
		Node<String> node2 = new Node<String>();
			node2 = node.getChildNode(1);
			for(int j = 0; j < items.level111.length; j++)  
				node2.addChildNode(new Node<String>(items.level111[j]));
			node2 = node.getChildNode(2);
			for(int j = 0; j < items.level112.length; j++)  
				node2.addChildNode(new Node<String>(items.level112[j]));
			node2 = node.getChildNode(3);
			for(int j = 0; j < items.level113.length; j++)  
				node2.addChildNode(new Node<String>(items.level113[j]));
			
		node = root.getChildNode(2);
		for(int k = 0; k < items.level21.length; k++)
			node.addChildNode(new Node<String>(items.level21[k]));
		
		node = root.getChildNode(3);
		for(int k = 0; k < items.level31.length; k++)
			node.addChildNode(new Node<String>(items.level31[k]));
		
		node = root.getChildNode(4);
		for(int k = 0; k < items.level41.length; k++)
			node.addChildNode(new Node<String>(items.level41[k]));
		
		node = root.getChildNode(5);
		for(int k = 0; k < items.level51.length; k++)
			node.addChildNode(new Node<String>(items.level51[k]));
		
			return menuTree;
	}
}
