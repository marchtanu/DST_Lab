//Name:
//ID:
//Section:

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import com.google.gson.Gson;

public class MovieCatalog {

	private List<Movie> movies = null;

	MovieCatalog() {
		movies = new ArrayList<Movie>();
	}

	public List<Movie> getAllMovies() {
		return movies;
	}

	public void loadMovies(String filename) {
		// ********************* YOUR CODE HERE **************************//
		try {
			CSVParser parser = new CSVParser(new FileReader("D:\\Desktop\\Code\\university\\DST\\1st_year\\OOP_code_6887020\\Lab12-student-package\\"+filename), CSVFormat.DEFAULT.withFirstRecordAsHeader());
			for (CSVRecord record : parser) {
				String title = record.get("Movie Title");
				int year = Integer.parseInt(record.get("Year"));
				double rtScore = Double.parseDouble(record.get("Rotten Tomatoes %").replace("%", ""));
				String genre = record.get("Genre");
				String leadStudio = record.get("Lead Studio");
				double audienceScore = Double.parseDouble(record.get("Audience Score %").replace("%", ""));
				double profitability = Double.parseDouble(record.get("Profitability"));
				double worldwideGross = Double.parseDouble(record.get("Worldwide Gross").trim().replace("$", "").replace(",", ""));
				Movie movie = new Movie(title, genre, leadStudio, audienceScore, profitability,
						rtScore, worldwideGross, year);
				movies.add(movie);
			}
			parser.close();
		} catch (FileNotFoundException e) {
			System.err.println("File not found: " + filename);
		} catch (IOException e) {
			System.err.println("Error reading file: " + filename);
		}

		// **************************************************************//
	}

	public List<Movie> searchByTitle(String keyword) {
		// ********************* YOUR CODE HERE **************************//
		List<Movie> results = new ArrayList<>();
		for (Movie movie : movies) {
			if (movie.getTitle().toLowerCase().contains(keyword.toLowerCase())) {
				results.add(movie);
			}
		}
		return results;
		// **************************************************************//
	}

	public List<Movie> searchByRottenTomatoesScores(double lowScore, double highScore) {
		// ********************* YOUR CODE HERE **************************//
		List<Movie> results = new ArrayList<>();
		for (Movie movie : movies) {
			if (movie.getRottenTomatoesScore() >= lowScore && movie.getRottenTomatoesScore() <= highScore) {
				results.add(movie);
			}
		}
		return results;
		// **************************************************************//
	}

	public static void saveMoviesJSON(List<Movie> movieList, String outFilename) {
		// ********************* YOUR CODE HERE **************************//
		Gson gson = new Gson();
		try (BufferedWriter writer = new BufferedWriter(new FileWriter("D:\\Desktop\\Code\\university\\DST\\1st_year\\OOP_code_6887020\\Lab12-student-package\\"+outFilename))) {
			gson.toJson(movieList, writer);
		} catch (IOException e) {
			System.err.println("Error writing JSON file: " + outFilename);
		}
		// **************************************************************//
	}

}
