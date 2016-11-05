package menutree;

import java.io.*;
import java.util.Map;

public class MenuForGame {

	// public static Map<Integer, Node<String>> toPrintMainMenu() {
	public static void toPrintMainMenu() throws IOException {
//		SetTreeMap st = new SetTreeMap();
//		Tree<String> mt = st.generateMenuTree();
//		Map<Integer, Node<String>> level1, level2, level3;
//		level1 = mt.getRootNode().getChildren();
//		for (Map.Entry<Integer, Node<String>> map1 : level1.entrySet())
//			System.out.println(map1.getKey() + " " + map1.getValue().getContent());
//		System.out.println("Enter row number");
//		
//		int k = System.in.read();
////		System.out.println(k);
////		k = 1;
////		System.out.println(k);
//		
//		level2 = level1.get(k).getChildren();
//		for (Map.Entry<Integer, Node<String>> map2 : level2.entrySet())
//			System.out.println(" \t" + map2.getKey() + " " + map2.getValue().getContent());
//		System.out.println("\tEnter row number");
//		
//		int j = System.in.read();
//		level3 = level2.get(j).getChildren();
//		for (Map.Entry<Integer, Node<String>> map3 : level3.entrySet())
//			System.out.println(" \t\t\t" + map3.getKey() + " " + map3.getValue().getContent());
	}

	public static void main(String[] args) throws IOException {
		 MainTreeMap.toPrint();
//		toPrintMainMenu();
	}
}
