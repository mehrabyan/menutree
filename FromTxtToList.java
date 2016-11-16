package menutree;

import java.io.*;
import java.util.*;

public class FromTxtToList {
	private String line = null;
	public List<String> linesMenuText = new ArrayList<String>();

	public void readMenuFromFile() throws IOException {
		BufferedReader reader = new BufferedReader(
				new FileReader("C:/myjava/Otherprojects/eckelexsamples/res/MenuText"));
		while ((line = reader.readLine()) != null) {
			linesMenuText.add(line);
		}
		reader.close();
	}
}