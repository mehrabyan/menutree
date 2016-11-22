package menutree;

import java.io.*;
import java.util.*;

public class TreeForMenu extends Tree<String> {

	public Node<String> currentNode, node;

	public boolean isValidPath(String[] path) throws Exception {
		boolean isValid = true;

		Node<String> currentNode = getRootNode();

		if (currentNode == null)
			throw new Exception("Root node can't be null");

		for (String joint : path) {
			currentNode = currentNode.getChildNode(Integer.parseInt(joint));

			if (currentNode == null) {
				isValid = false;
				break;
			}
		}
		return isValid;
	}

	// return isValid;
	// }

	public void generateMenuForGame() throws IOException {
		TreeForMenu mfg = new TreeForMenu();
		Menunodes mn = new Menunodes();
		Scanner scan = new Scanner(System.in);

		mfg = mn.generateMenuNodes();
		mfg.getRootNode().getChildren();

		for (Integer i : mfg.getRootNode().getChildren().keySet()) {
			System.out.println(i + ". " + mfg.getRootNode().getChildren().get(i).getContent());
		}

		int i = scan.nextInt();
		currentNode = mfg.getRootNode().getChildNode(i);
		for (Integer m : currentNode.getChildren().keySet())
			System.out.println(m + ". " + currentNode.getChildren().get(m).getContent());

		do {
			int j = scan.nextInt();
			if (j == 0) {
				for (Integer k : currentNode.getParent().getChildren().keySet())
					System.out.println(k + ". " + currentNode.getParent().getChildren().get(k).getContent());
				currentNode = currentNode.getParent();
			} else {
				currentNode = currentNode.getChildNode(j);
				for (Integer m : currentNode.getChildren().keySet())
					System.out.println(m + ". " + currentNode.getChildren().get(m).getContent());
			}
		} while (true);
		// scan.close();
	}

	public static void main(String[] args) throws IOException {
		TreeForMenu tfm = new TreeForMenu();

		tfm.generateMenuForGame();
	}
}
