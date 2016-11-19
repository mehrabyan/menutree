package menutree;

import java.io.IOException;

public class TreeForMenu extends Tree<String> {
	String line = null;
	String[] linePartsDoubleDot;

	public void generedMenuItems() {
		FromTxtToList fttl = new FromTxtToList();
		try {
			fttl.readMenuFromFile();
		} catch (IOException e) {
			e.printStackTrace();
		}

		for (int i = 0; i < fttl.linesMenuText.size(); i++) {
			String[] dots = { null, null, null, null };
			line = (String) fttl.linesMenuText.get(i);
			if (line.length() != 0) {
				linePartsDoubleDot = line.split(":");
				dots = linePartsDoubleDot[0].split(".");
				Node<String> node = new Node(linePartsDoubleDot[1]);
				System.out.println(node.getContent());
				if (dots[0] != null) {
					System.out.println(dots[0].toString());
					if (dots[1] == null) {
						this.getRootNode().addChildNode(node);
						System.out.println(this.getRootNode().getChildNode(Integer.parseInt(dots[0])).getContent());
					} else {
						if (dots[2] == null) {
							this.getRootNode().getChildNode(Integer.parseInt(dots[0])).addChildNode(node);
							System.out.println(this.getRootNode().getChildNode(Integer.parseInt(dots[0]))
									.getChildNode(Integer.parseInt(dots[1])).getContent());
						}
						this.getRootNode().getChildNode(Integer.parseInt(dots[0]))
								.getChildNode(Integer.parseInt(dots[1])).addChildNode(node);
					}
				}
			}
		}
	}

	public static void main(String[] args) {
		TreeForMenu tfm = new TreeForMenu();

		tfm.generedMenuItems();
	}
}
