package menutree;

import java.io.IOException;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.regex.Pattern;

public class TreeForMenu extends Tree<String> {

	public Node<String> currentNode;

	public void generateMenuForGame() throws IOException {
		TreeForMenu mfg;
		Menunodes mn = new Menunodes();
		Scanner scan = new Scanner(System.in);
		Map<Integer, Node<String>> menuLevel1, menuLevel2, menuLevel3;
		mfg = mn.generateMenuNodes();
		menuLevel1 = mfg.getRootNode().getChildren();
		for (Integer i : menuLevel1.keySet())
			System.out.println(i + ". " + menuLevel1.get(i).getContent());
		int key = scan.nextInt();
		if (key == 0)
			System.exit(0);
		menuLevel2 = menuLevel1.get(key).getChildren();
		for (Integer j : menuLevel2.keySet())
			System.out.println("\t" + j + ". " + menuLevel2.get(j).getContent());
		int key2 = scan.nextInt();
		// if(key2 == 0)
		menuLevel3 = menuLevel2.get(key2).getChildren();
		for (Integer k : menuLevel3.keySet())
			System.out.println("\t\t" + k + ". " + menuLevel3.get(k).getContent());
		int text = scan.nextInt();
		System.out.println("Start game");
		scan.close();
	}

	public static void main(String[] args) throws IOException {
		TreeForMenu tfm = new TreeForMenu();

		tfm.generateMenuForGame();
	}
}
