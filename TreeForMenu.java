package menutree;

import java.io.IOException;
import java.util.Scanner;

public class TreeForMenu extends Tree<String> {

	public Node<String> currentNode;

	public void generateMenuForGame() throws IOException {
		TreeForMenu mfg;
		Menunodes mn = new Menunodes();
		NodePath np = new NodePath();
		Scanner scan = new Scanner(System.in);
		mfg = mn.generateMenuNodes();
		mfg.getRootNode().getChildren();
		for (Integer i : mfg.getRootNode().getChildren().keySet()) {
			System.out.println(i + ". " + mfg.getRootNode().getChildren().get(i).getContent());
		}
		
		int i = scan.nextInt();
		currentNode = mfg.getRootNode().getChildNode(i);
		np.toChildren(currentNode);
		do {
		int j = scan.nextInt();
		if(j == 0) {
				currentNode = np.toParent(currentNode);
		}
		else {
				currentNode = currentNode.getChildNode(j);
				np.toChildren(currentNode);
		}
		} while (true); 
//		scan.close();
	}

	public static void main(String[] args) throws IOException {
		TreeForMenu tfm = new TreeForMenu();

		tfm.generateMenuForGame();
	}
}
