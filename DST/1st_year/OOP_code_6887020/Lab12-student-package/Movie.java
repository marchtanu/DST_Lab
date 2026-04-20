//************************ DO NOT MODIFY *******************************//
public class Movie {
	private String title = null;
	private String genre = null;
	private String leadStudio = null;
	private double audienceScore = -1;	//%
	private double profitability = -1;	//ratio
	private double rottenTomatoesScore = -1;	//%
	private double worldwideGross = -1;	//$
	private int year = -1;
	public Movie(String title, String genre, String leadStudio, double audienceScore, double profitability,
			double rottenTomatoesScore, double worldwideGross, int year) {
		super();
		this.title = title;
		this.genre = genre;
		this.leadStudio = leadStudio;
		this.audienceScore = audienceScore;
		this.profitability = profitability;
		this.rottenTomatoesScore = rottenTomatoesScore;
		this.worldwideGross = worldwideGross;
		this.year = year;
	}
	public String getTitle() {
		return title;
	}
	
	public String getGenre() {
		return genre;
	}
	
	public String getLeadStudio() {
		return leadStudio;
	}
	
	public double getAudienceScore() {
		return audienceScore;
	}
	
	public double getProfitability() {
		return profitability;
	}
	
	public double getRottenTomatoesScore() {
		return rottenTomatoesScore;
	}
	
	public double getWorldwideGross() {
		return worldwideGross;
	}
	
	public int getYear() {
		return year;
	}
	
	@Override
	public String toString() {
		return "Movie [title=" + title + ", genre=" + genre + ", leadStudio=" + leadStudio + ", audienceScore="
				+ audienceScore + ", profitability=" + profitability + ", rottenTomatoesScore=" + rottenTomatoesScore
				+ ", worldwideGross=" + worldwideGross + ", year=" + year + "]";
	}
	
	
}
