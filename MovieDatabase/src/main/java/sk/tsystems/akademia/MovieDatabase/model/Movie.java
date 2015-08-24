package sk.tsystems.akademia.MovieDatabase.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
public class Movie extends VideoArt {

	@Temporal(TemporalType.DATE)
	private Date date; // datum premieri v kine
	
	private String length; // Dlzka filmu
	
	public Movie(String name,String yearOfPublication, Date date, String length){
		super(name,yearOfPublication);
		this.date = date;
		this.length = length;
	}
	
	public Movie(){
		
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getLength() {
		return length;
	}

	public void setLength(String length) {
		this.length = length;
	}

	@Override
	public String toString() {
		return "Movie ["+super.toString()+" date=" + date + ", length=" + length + "]";
	}	
	
	
}

