package sec02.ex01;

import java.awt.List;
import java.io.IOException;

public class MovieController {
	MovieModel movieModel;
	
	public MovieController() {
		movieModel = new MovieModel();
	}

	public void addTitle(String title, List movieList) throws IOException{
			movieModel.addTitle(title, movieList);
	}

	public void saveTitles(List movieList) throws IOException{
			movieModel.saveTitles(movieList);
	}
	
	public void delTitle(String title,List movieList) throws IOException{
		movieModel.addTitle(title,movieList);
	}

}
