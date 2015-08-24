package sk.tsystems.akademia.MovieDatabase.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class TvSeries extends VideoArt {

	private int series;
	
	private int episode;	

	private String startYear;
	
	private String endYear;
	
	public TvSeries(String name,String yearOfPublication,int series, int episode, String startYear, String endYear){
		super(name,yearOfPublication);
		this.series = series;
		this.episode = episode;
		this.startYear = startYear;
		this.endYear = endYear;
	}
	
	public TvSeries(){
		
	}

	public int getSeries() {
		return series;
	}

	public void setSeries(int series) {
		this.series = series;
	}

	public int getEpisode() {
		return episode;
	}

	public void setEpisode(int episode) {
		this.episode = episode;
	}

	public String getStartYear() {
		return startYear;
	}

	public void setStartYear(String startYear) {
		this.startYear = startYear;
	}

	public String getEndYear() {
		return endYear;
	}

	public void setEndYear(String endYear) {
		this.endYear = endYear;
	}

	@Override
	public String toString() {
		return "TvSeries [series=" + series + ", episode=" + episode + ", startYear=" + startYear + ", endYear="
				+ endYear + "]";
	}
	
	
	
}
