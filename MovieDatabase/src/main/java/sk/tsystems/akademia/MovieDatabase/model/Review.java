package sk.tsystems.akademia.MovieDatabase.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Review {

	@Id
	@GeneratedValue
	private long id;
	
	@Temporal(TemporalType.DATE)
	private Date date; //  datum vytvorenia
	
	@ElementCollection
	//private List<VideoArt> reviewed = new ArrayList<>();
	
	@ManyToOne(cascade=CascadeType.ALL)
	private VideoArt reviewed;
	
	public VideoArt getReviewed() {
		return reviewed;
	}

	public void addReviewed(VideoArt reviewed) {
		this.reviewed = reviewed;
	}

	@Column(length=10)
	private int rating;
	
	@Column(length=5000)
	private String text;
	
	public Review(Date date, int rating, String text){
		this.date=date;
		this.rating = rating;
		this.text = text;
		
	}
	
	public Review(){
		
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	@Override
	public String toString() {
		return "Review [date=" + date + ", reviewed=" + reviewed + ", rating=" + rating + ", text=" + text + "]";
	}	
		
	
	
	
}
