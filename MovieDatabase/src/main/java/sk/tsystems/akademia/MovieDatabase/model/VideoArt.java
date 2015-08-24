package sk.tsystems.akademia.MovieDatabase.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public abstract class VideoArt {

	@Id
	@GeneratedValue
	private long id;
	
	public String name;
	
	public String yearOfPublication;
	
	@ManyToMany(cascade=CascadeType.ALL)
	public List<Genre> genres = new ArrayList<>();
	
	@JoinTable(name="directors")
	@ManyToMany(cascade=CascadeType.ALL)
	public List<Celebrity> directors = new ArrayList<>();
	
	@JoinTable(name="actors")
	@ManyToMany(cascade=CascadeType.ALL)
	public List<Celebrity> actors = new ArrayList<>();
	
	@OneToMany(cascade=CascadeType.ALL,mappedBy="reviewed")
	public List<Review> reviews = new ArrayList<>();
	
	public VideoArt(String name,String yearOfPublication){
		this.name = name;
		this.yearOfPublication = yearOfPublication;
	}
	
	public VideoArt(){
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getYearOfPublication() {
		return yearOfPublication;
	}

	public void setYearOfPublication(String yearOfPublication) {
		this.yearOfPublication = yearOfPublication;
	}

	public List<Genre> getGenres() {
		return genres;
	}

	public void addGenres(Genre genres) {
		this.genres.add(genres);
	}

	public List<Celebrity> getDirectors() {
		return directors;
	}

	public void addDirectors(Celebrity directors) {
		this.directors.add(directors);
	}

	public List<Celebrity> getActors() {
		return actors;
	}

	public void addActors(Celebrity actors) {
		this.actors.add(actors);
	}

	public List<Review> getReviews() {
		return reviews;
	}

	public void addReviews(Review reviews) {
		this.reviews.add(reviews);
	}

	@Override
	public String toString() {
		return "VideoArt [id=" + id + ", name=" + name + ", yearOfPublication=" + yearOfPublication + ", genres="
				+ genres + ", reviews=" + reviews + "]";
	}


	
	
}
