package utilities;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TextFileWriter {
	
	//removes last string expression from file if string expression contains split ";" 
	public static String RemooveLastString(String string) {
		String[] parts = string.split(";");
		String newString = null;
		String lastString = parts[parts.length-1];
		for (int i = 0; i < parts.length-1; i++) {
			if(newString == null){
			newString = parts[i]+";";
			}else
			{newString = newString+parts[i]+";";}
		}
		
		return newString;
	}
	//adds string to the end of file and put ";" after string 
	public static void addStringToFile(String text, String filePath) {
		try {
            FileWriter writer = new FileWriter(filePath,true);
            BufferedWriter bufferWriter = new BufferedWriter(writer);
            
            bufferWriter.write(text+";");
            
            bufferWriter.close();
        }
        catch (IOException e) {
            System.out.println(e);
        }
		
	}

	
	public static void writeStringToFile(String content, String filePath) {
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
