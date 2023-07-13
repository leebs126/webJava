package sec02.ex01;

import java.awt.List;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class MovieModel {
	public void addTitle(String title, List movieList) throws IOException{
		movieList.add(title);
	}

	public void delTitle(String title, List movieList) throws IOException{
		movieList.remove(title);
	}

	public void saveTitles(List movieList) throws IOException {
		File file = new File("src\\sec02\\ex01\\movieInfo.txt");
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), "UTF-8"));
		PrintWriter writer = new PrintWriter(bw,true );
		String items[] = movieList.getItems(); 
		
		for(int i=0; i<items.length;i++){
			writer.println(items[i]);
			System.out.println(items[i]);
		}
		bw.close();
		writer.close();
	}

}
