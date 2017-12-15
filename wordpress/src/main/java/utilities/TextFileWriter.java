package utilities;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TextFileWriter {
	
	public static void writeFile(String content, String filePath) {
		BufferedWriter bw = null;
		FileWriter fw = null;

		try {

			fw = new FileWriter(filePath);
			bw = new BufferedWriter(fw);
			bw.write(content);

			

		} catch (IOException e) {

			e.printStackTrace();

		} finally {

			try {

				if (bw != null)
					bw.close();

				if (fw != null)
					fw.close();

			} catch (IOException ex) {

				ex.printStackTrace();

			}

		}
		
	}

}
