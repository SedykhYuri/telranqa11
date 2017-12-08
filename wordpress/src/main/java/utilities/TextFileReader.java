package utilities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TextFileReader {
	
	private static String readFile(String filePath) {
		 StringBuilder sb = new StringBuilder();
		 BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(filePath));
           String line;
           
           while ((line = br.readLine()) != null) {
           	if (sb.length() > 0) {
                   sb.append("\n");
               }
           	sb.append(line);
           }
       } catch (IOException e) {
           e.printStackTrace();
       }finally {
           try {
               if (br != null) {
                   br.close();
               }
           } catch (IOException ex) {
               ex.printStackTrace();
           }
       }
		 String contents = sb.toString();
		return contents;
	}

}
