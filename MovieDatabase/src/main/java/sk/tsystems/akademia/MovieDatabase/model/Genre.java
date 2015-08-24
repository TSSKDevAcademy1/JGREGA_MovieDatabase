package sk.tsystems.akademia.MovieDatabase.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Genre {

	@Id
	@GeneratedValue
	private long id;
	
	private String name;	
	
	private String description;
	
	public Genre(String name, String description){
		this.name = name;
		this.description = description;
	}
	
	public Genre(){
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Genre [id=" + id + ", name=" + name + ", description=" + description + "]";
	}


	
	
}
