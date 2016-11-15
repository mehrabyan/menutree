package menutree;

import java.io.IOException;
import java.util.*;

public class TreeForMenu extends Tree<String> {
	String line = null;
	String[] lineparts;

	public void greneredMenu() {
		FromTxtToList fttl = new FromTxtToList();
		try {
			fttl.readMenuFromFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (int i = 0; i < fttl.linesMenuText.size(); i++) {
			line = (String) fttl.linesMenuText.get(i);
			lineparts = line.split(":");
			System.out.println(lineparts[0] + " : " + lineparts[1]);
		}
	}
	public static void main(String[] args) {
		TreeForMenu tfm = new TreeForMenu();
		
		tfm.greneredMenu();
	}
}
