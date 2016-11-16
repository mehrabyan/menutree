package menutree;

import java.io.IOException;
import java.util.regex.Pattern;

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
			line = (String) fttl.linesMenuText.get(i);
			if (line.length() != 0) {
				linePartsDoubleDot = line.split(":");
				String[] level = linePartsDoubleDot[0].split(Pattern.quote("."));
				Node<String> node = new Node(linePartsDoubleDot[1]);
				if (level.length == 1) {
					this.getRootNode().addChildNode(node);
					System.out.println(level[0] + ". " + this.getRootNode().getChildNode(Integer.parseInt(level[0])).getContent());
				} 
					if (level.length == 2) {
						this.getRootNode().getChildNode(Integer.parseInt(level[0])).addChildNode(node);
						System.out.println("\t" + level[1] + ". " +this.getRootNode()
								.getChildNode(Integer.parseInt(level[0]))
								.getChildNode(Integer.parseInt(level[1])).getContent());
					}
						if(level.length == 3) {
					this.getRootNode().getChildNode(Integer.parseInt(level[0])).getChildNode(Integer.parseInt(level[1]))
							.addChildNode(node);
					System.out.println("\t\t" + level[2] + ". " + this.getRootNode()
							.getChildNode(Integer.parseInt(level[0]))
							.getChildNode(Integer.parseInt(level[1]))
							.getChildNode(Integer.parseInt(level[2])).getContent());
				}
			}
		}
	}

	public static void main(String[] args) {
		TreeForMenu tfm = new TreeForMenu();

		tfm.generedMenuItems();
	}
}
