package sk.tsystems.akademia.MovieDatabase.dao;

import java.util.List;

import sk.tsystems.akademia.MovieDatabase.model.Movie;
import sk.tsystems.akademia.MovieDatabase.model.VideoArt;
import sk.tsystems.akademia.MovieDatabase.model.jpaHelper;


public class MovieDao {	
		
		public void saveMovie(Movie movie){
			jpaHelper.beginTransaction();
			jpaHelper.getEntityManager().persist(movie);
			System.out.println("After persist");
			
			//company entity is managed
			jpaHelper.commitTransaction();
			// company entity is detached
		}
		
		public static void listAllMovies(){
			jpaHelper.beginTransaction();
			List<Movie> movies= jpaHelper.getEntityManager().createQuery("select c from Movie c",Movie.class).getResultList();
			
			for(Movie movie : movies){
				System.out.println(movie);
			}
			
			jpaHelper.commitTransaction();
		}
		
		public Movie find(long id){
			return jpaHelper.getEntityManager().find(Movie.class,id);
		}
		
		public void FindByYear(String number){
			List<VideoArt> videos= jpaHelper.getEntityManager()
					.createQuery("select c from VideoArt c where yearOfPublication = :number ",VideoArt.class).setParameter("number", number).getResultList();
			System.out.println(videos.toString());
		}	
		
		public void FindByActor(String firstName, String surName){ //- nefunkcne
//			List<VideoArt> videos= jpaHelper.getEntityManager()
//					.createQuery("select c from VideoArt c where firsName = :firstName AND surName = :surName ",VideoArt.class).setParameter("firstname", firstName,"surName",surName).getResultList();
//			System.out.println(videos.toString());
		}		
	}
