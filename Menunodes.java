package menutree;

import java.io.IOException;
import java.util.regex.Pattern;

public class Menunodes {
	public TreeForMenu generateMenuNodes() {
		TreeForMenu tfm = new TreeForMenu();
		FromTxtToList fttl = new FromTxtToList();
		try {
			fttl.readMenuFromFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		for (int i = 0; i < fttl.linesMenuText.size(); i++) {
			String line = fttl.linesMenuText.get(i);
			if (line.length() != 0) {
				String[] linePartsSplitedByDD = line.split(":");
				String levels = linePartsSplitedByDD[0];
				if (linePartsSplitedByDD.length != 1) {
					tfm.currentNode = tfm.getRootNode();
					String[] level = levels.split(Pattern.quote("."));
					for (int k = 0; k < level.length; k++) {
						while (k <= level.length - 2) {
							if (!(tfm.currentNode.getChildren().containsKey(Integer.parseInt(level[k])))) {
								System.out.println("Uncorrect number in line for menu");
								break;
							}
							tfm.currentNode = tfm.currentNode.getChildNode(Integer.parseInt(level[k]));
							k++;
						}
						tfm.currentNode.addChildNode(Integer.parseInt(level[k]),new Node<String>(linePartsSplitedByDD[1]));
					}
							
				}
				
			}
		}
		return tfm;
	}
}