//************************ DO NOT MODIFY *******************************//

import java.util.List;

public class MovieTester {
	
	public static void main(String[] args)
	{
		System.out.println("Task 1: Load movies from a file");
		MovieCatalog catalog = new MovieCatalog();
		catalog.loadMovies("movies.csv");
		System.out.println("There are "+catalog.getAllMovies().size()+" movies in the catalog.");
		System.out.println("The first movie is:\n\t"+catalog.getAllMovies().get(0));
		System.out.println("The last movie is:\n\t"+catalog.getAllMovies().get(catalog.getAllMovies().size()-1));
		
		System.out.println("\nTask 2: Searching movies");
		List<Movie> dayMovies = catalog.searchByTitle("Day");
		System.out.println("Movies whose titles contain \"Day\"\n\t"+dayMovies.toString().replaceAll(" Movie", "\n\tMovie")+"\n");
		List<Movie> goodMovies = catalog.searchByRottenTomatoesScores(91, 96);
		System.out.println("Movies whose Rotten Tomatoes scores are between \"91%-96%\"\n\t"+goodMovies.toString().replaceAll(" Movie", "\n\tMovie"));
		
		System.out.println("\nTask 3: Saving search results");
		MovieCatalog.saveMoviesJSON(dayMovies, "searchresults-keyword-day.json");
		MovieCatalog.saveMoviesJSON(goodMovies, "searchresults-rt-91-96.json");
		
		System.out.println("Good Bye");
	}

}
