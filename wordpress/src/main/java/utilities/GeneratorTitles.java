package utilities;

import java.util.Random;

public class GeneratorTitles {
	
	
		public static String generateTitile(){
	String[] articles = {"a", "the"};
	String[] nouns = {"cat", "dog", "rat","bat","sun","bug","rabbit", "bird", "monkey","man"};
	String[] verbs = {"go", "run", "sit","catch","hit","bite","speack", "jump", "dead","fly", "love", "like"};
	String[] pretext = {"in", "to", "from","with","under","above","on", "across", "behind","before"};
	String[] nouns_2 = {"cars", "store", "ball","game","chair","plate","hot-dog", "milk", "house"};
	
	Random r = new Random();
	int selectedElement = r.nextInt(articles.length);
	int selectedElement_2 = r.nextInt(nouns.length);
	int selectedElement_3 = r.nextInt(verbs.length);
	int selectedElement_4 = r.nextInt(nouns_2.length);
	int selectedElement_5 = r.nextInt(pretext.length);
	

		
	String randomResult = articles[selectedElement]
			+" " + nouns[selectedElement_2]
					+ " " + verbs[selectedElement_3]
							+" " + pretext[selectedElement_5]
									+ " " +articles[selectedElement]
											+" " + nouns_2[selectedElement_4];
	
	return randomResult;
	}
	
	//System.out.println(randomResult);
	
	
}
