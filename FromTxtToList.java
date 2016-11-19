package menutree;

import java.io.*;
import java.util.*;

public class FromTxtToList {
	private String line = null;
	public  List<String> linesMenuText = new ArrayList<String>();

	public void readMenuFromFile() throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader("src/res/MenuText"));
		while ((line = reader.readLine()) != null) {
			linesMenuText.add(line);
		}
		reader.close();
	}

//	public static void main(String[] args) {
//		FromTxtToList txtToList = new FromTxtToList();
//		try {
//			txtToList.readMenuFromFile();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		for (String st : linesMenuText) {
//			System.out.println(st.toString());
//		}
//	}
}