package sk.tsystems.akademia.MovieDatabase.dao;

import java.util.List;

import sk.tsystems.akademia.MovieDatabase.model.Genre;
import sk.tsystems.akademia.MovieDatabase.model.jpaHelper;


public class GenreDao {	
		
		public void saveGenre(Genre genre){
			jpaHelper.beginTransaction();
			jpaHelper.getEntityManager().persist(genre);
			System.out.println("After persist");
			
			//company entity is managed
			jpaHelper.commitTransaction();
			// company entity is detached
		}
		
		public static void listAllGenres(){
			jpaHelper.beginTransaction();
			List<Genre> genres= jpaHelper.getEntityManager().createQuery("select c from Genre c",Genre.class).getResultList();
			
			for(Genre genre : genres){
				System.out.println(genre);
			}
			
			jpaHelper.commitTransaction();
		}
		
		public Genre find(long id){
			return jpaHelper.getEntityManager().find(Genre.class,id);
		}
		
		/*
		 
		  public static void search(String number){
		List<PersonD> persons= JpaHelperD.getEntityManager()
				.createQuery("select c from PersonD c join c.luckyNumbers lucky where lucky = :number ",PersonD.class).setParameter("number", number).getResultList();
		System.out.println(persons.toString());
	}
		 
		 */
	}
