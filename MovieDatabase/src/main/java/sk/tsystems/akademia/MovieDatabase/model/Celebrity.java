package sk.tsystems.akademia.MovieDatabase.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Celebrity {
	
	@Id
	@GeneratedValue
	private long id;
	
	private String surName;
	
	private String firstName;
	
	@Temporal(TemporalType.DATE)
	private Date date; // datum narodenia
	
	@Column(length=3000)
	private String biography;
	
	@ManyToMany(cascade=CascadeType.ALL,mappedBy="directors")
	private List<VideoArt> directed = new ArrayList<>();
	
	@ManyToMany(cascade=CascadeType.ALL,mappedBy="actors")
	private List<VideoArt> actedAt = new ArrayList<>();
	
	public Celebrity(String surName,String firstName,Date date,String biography){
		this.firstName = firstName;
		this.surName = surName;
		this.date = new Date();
		this.biography = biography;
	}	
	
	public Celebrity(){
		
	}
	
	public String getSurName() {
		return surName;
	}

	public void setSurName(String surName) {
		this.surName = surName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getBiography() {
		return biography;
	}

	public void setBiography(String biography) {
		this.biography = biography;
	}

	public List<VideoArt> getDirected() {
		return directed;
	}

	public void addDirected(VideoArt directed) {
		this.directed.add(directed);
	}

	public List<VideoArt> getActedAt() {
		return actedAt;
	}

	public void addActedAt(VideoArt actedAt) {
		this.actedAt.add(actedAt);
	}

	@Override
	public String toString() {
		return "Celebrity [id=" + id + ", surName=" + surName + ", firstName=" + firstName + ", date=" + date
				+ ", biography=" + biography + ", directed=" + directed + ", actedAt=" + actedAt + "]";
	}
		
	
}
