package menutree;

import java.util.Map;

public class OutMenuForGame {

	public static void printMenuForGame() {
		SetTreeMap st = new SetTreeMap();
		TreeForMenu<String>  tfm = (TreeForMenu<String>) st.generateMenuTree();
		Map<Integer, Node<String>> level1, level2, level3;
		level1 = tfm.getRootNode().getChildren();
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
