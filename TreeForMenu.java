package menutree;

import java.io.IOException;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;

public class TreeForMenu extends Tree<String> {

	public TreeForMenu generateMenuLevels() {
		TreeForMenu tfm = new TreeForMenu();
		FromTxtToList fttl = new FromTxtToList();
		try {
			fttl.readMenuFromFile();
		} catch (IOException e) {
			e.printStackTrace();
		}

		for (int i = 0; i < fttl.linesMenuText.size(); i++) {
			String line = (String) fttl.linesMenuText.get(i);
			if (line.length() != 0) {
				String[] linePartsSplitedByDD = line.split(":");
				String levels = linePartsSplitedByDD[0];
				if(linePartsSplitedByDD.length != 1) {
				String content = linePartsSplitedByDD[1];
				String[] level = levels.split(Pattern.quote("."));
				Node<String> node = new Node<String>(content);
				if (level.length == 1) {
					tfm.getRootNode().addChildNode(node);
//					return this.getRootNode().getChildren();
//					System.out.println(
//							level[0] + ". " + this.getRootNode()
//									.getChildNode(Integer.parseInt(level[0])).getContent());
				}
				if (level.length == 2) {
					tfm.getRootNode().getChildNode(Integer.parseInt(level[0])).addChildNode(node);
//					return this.getRootNode().getChildNode(Integer.parseInt(level[0])).getChildren();
//					System.out.println(
//							"\t" + level[1] + ". " + this.getRootNode()
//									.getChildNode(Integer.parseInt(level[0]))
//									.getChildNode(Integer.parseInt(level[1])).getContent());
				}
				if (level.length == 3) {
					tfm.getRootNode().getChildNode(Integer.parseInt(level[0])).getChildNode(Integer.parseInt(level[1]))
							.addChildNode(node);
//					return this.getRootNode().getChildNode(Integer.parseInt(level[0])).getChildNode(Integer.parseInt(level[1]))
//							.getChildren();
//					System.out.println(
//							"\t\t" + level[2] + ". " + this.getRootNode()
//									.getChildNode(Integer.parseInt(level[0]))
//									.getChildNode(Integer.parseInt(level[1]))
//									.getChildNode(Integer.parseInt(level[2])).getContent());
				}
			}
		}
		}
		return tfm;
	}

	public void generateMenuForGame() throws IOException {
		TreeForMenu mfg;
		Map<Integer, Node<String>> menuLevel1, menuLevel2, menuLevel3;
		mfg = generateMenuLevels();
		menuLevel1 = mfg.getRootNode().getChildren();
		for(Integer i: menuLevel1.keySet())
			System.out.println(i + ". " + menuLevel1.get(i).getContent());
		int i = System.in.read();
//		menuLevel1.
	}
	
	public static void main(String[] args) {
		TreeForMenu tfm = new TreeForMenu();

		tfm.generateMenuForGame();
	}
}
