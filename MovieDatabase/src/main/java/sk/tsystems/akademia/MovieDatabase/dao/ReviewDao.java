package sk.tsystems.akademia.MovieDatabase.dao;

import java.util.Date;
import java.util.List;

import sk.tsystems.akademia.MovieDatabase.model.Celebrity;
import sk.tsystems.akademia.MovieDatabase.model.Movie;
import sk.tsystems.akademia.MovieDatabase.model.Review;
import sk.tsystems.akademia.MovieDatabase.model.VideoArt;
import sk.tsystems.akademia.MovieDatabase.model.jpaHelper;


public class ReviewDao {	
		
		public void saveReview(Review review){
			jpaHelper.beginTransaction();
			jpaHelper.getEntityManager().persist(review);
			System.out.println("After persist");
			
			//company entity is managed
			jpaHelper.commitTransaction();
			// company entity is detached
		}
		
		public static void listAllReviews(){
			jpaHelper.beginTransaction();
			List<Review> reviews= jpaHelper.getEntityManager().createQuery("select c from Review c",Review.class).getResultList();
			
			for(Review review : reviews){
				System.out.println(review);
			}
			
			jpaHelper.commitTransaction();
		}
		
		public Review find(long id){
			return jpaHelper.getEntityManager().find(Review.class,id);
		}
		
		
		public void CreateReview(Date date, int rating, String text){
		
			Review review = new Review(date,rating,text);
			saveReview(review);
			
			jpaHelper.beginTransaction();
			
			jpaHelper.commitTransaction();
			
			jpaHelper.close();
			
		}
		
		public void addReview(long idVideo, long idReview){
		VideoArt video = jpaHelper.getEntityManager().find(VideoArt.class, idVideo);
		Review review = jpaHelper.getEntityManager().find(Review.class, idReview);
		review.addReviewed(video);
		//video.addReviews(review);

		jpaHelper.beginTransaction();

		jpaHelper.commitTransaction();

		jpaHelper.close();		
		}	
	}
