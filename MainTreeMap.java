package menutree;

import java.util.*;

public class MainTreeMap {

	public static void toPrint() {
		SetTreeMap st = new SetTreeMap();
		Tree<String> mt = st.generateMenuTree();
		Map<Integer, Node<String>> level1, level2, level3;
		level1 = mt.getRootNode().getChildren();
		for (Integer i : level1.keySet()) {
			level2 = level1.get(i).getChildren();
			System.out.println(i + " " + level1.get(i).getContent());
			for (int j : level2.keySet()) {
				level3 = level2.get(j).getChildren();
				System.out.println("\t" + j + " " + level2.get(j).getContent());
				for (int k : level3.keySet())
					System.out.println("\t\t\t" + k + " " + level3.get(k).getContent());
			}
		}
	}
}