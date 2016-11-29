package menutree;

import java.io.*;
import java.util.*;
import java.util.regex.Pattern;

public class Menunodes {
	private String line = null;
	private List<String> linesMenuText = new ArrayList<String>();

	public Menunodes() throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader("src/res/MenuText"));
		while ((line = reader.readLine()) != null) {
			linesMenuText.add(line);
		}
		reader.close();
	}

	public TreeForMenu generateMenuNodes() {
		TreeForMenu tfm = new TreeForMenu();
		for (int i = 0; i < linesMenuText.size(); i++) {
			String line = linesMenuText.get(i);
			if (line.length() != 0) {
				String[] linePartsSplitedByDD = line.split(":");
				String levels = linePartsSplitedByDD[0];

				if (linePartsSplitedByDD.length != 1) {
					tfm.currentNode = tfm.getRootNode();
					String[] level = levels.split(Pattern.quote("."));

					for (int k = 0; k < level.length; k++) {

						while (k <= level.length - 2) {

							if (!(tfm.currentNode.getChildren().containsKey(Integer.parseInt(level[k])))) {
								System.out.println("Incorrect number in line for menu");
								break;
							}
							tfm.currentNode = tfm.currentNode.getChildNode(Integer.parseInt(level[k]));
							k++;
						}					
						tfm.currentNode.addChildNode(Integer.parseInt(level[k]),
								new Node<String>(linePartsSplitedByDD[1]));
					}
				}
			}
		}
		return tfm;
	}
}