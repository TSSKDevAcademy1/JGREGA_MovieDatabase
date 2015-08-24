package sk.tsystems.akademia.MovieDatabase.dao;

import java.util.Date;
import java.util.List;

import sk.tsystems.akademia.MovieDatabase.model.Celebrity;
import sk.tsystems.akademia.MovieDatabase.model.VideoArt;
import sk.tsystems.akademia.MovieDatabase.model.jpaHelper;


public class CelebrityDao {	
		
		public void saveCelebrity(Celebrity celebrity){
			jpaHelper.beginTransaction();
			jpaHelper.getEntityManager().persist(celebrity);
			System.out.println("After persist");
			
			//company entity is managed
			jpaHelper.commitTransaction();
			// company entity is detached
		}
		
		public static void listAllCelebrities(){
			jpaHelper.beginTransaction();
			List<Celebrity> celebrities= jpaHelper.getEntityManager().createQuery("select c from Celebrity c",Celebrity.class).getResultList();
			
			for(Celebrity celebrity : celebrities){
				System.out.println(celebrity);
			}
			
			jpaHelper.commitTransaction();
		}
		
		public Celebrity find(long id){
			return jpaHelper.getEntityManager().find(Celebrity.class,id);
		}
		
		/*
		 
		  public static void search(String number){
		List<PersonD> persons= JpaHelperD.getEntityManager()
				.createQuery("select c from PersonD c join c.luckyNumbers lucky where lucky = :number ",PersonD.class).setParameter("number", number).getResultList();
		System.out.println(persons.toString());
	}
		 
		 */
		
		public void addCelebrity(String surName,String firstName,Date date,String biography){ //  Celebrity(String surName,String firstName,Date date,String biography)
			Celebrity celebrity = new Celebrity(surName,firstName,date,biography );
			saveCelebrity(celebrity);
			
			jpaHelper.beginTransaction();
			
			jpaHelper.commitTransaction();
			
			jpaHelper.close();
		}
		
	public void addDirector(long idVideo,long idCelebrity) {
		VideoArt video = jpaHelper.getEntityManager().find(VideoArt.class, idVideo);
		Celebrity celebrity = jpaHelper.getEntityManager().find(Celebrity.class, idCelebrity);
		video.addDirectors(celebrity);

		jpaHelper.beginTransaction();

		jpaHelper.commitTransaction();

		jpaHelper.close();
	}
	
	public void addActor(long idVideo,long idCelebrity) {
		VideoArt video = jpaHelper.getEntityManager().find(VideoArt.class, idVideo);
		Celebrity celebrity = jpaHelper.getEntityManager().find(Celebrity.class, idCelebrity);
		video.addActors(celebrity);

		jpaHelper.beginTransaction();

		jpaHelper.commitTransaction();

		jpaHelper.close();
	}
		
		
		/*
		 VideoArt video = jpaHelper.getEntityManager().find(VideoArt.class, 13L);
//    	Genre genre = jpaHelper.getEntityManager().find(Genre.class, 17L);
//    	video.addGenres(genre);
//    	
//    	jpaHelper.beginTransaction();
//    	
//    	jpaHelper.commitTransaction();
//    	
//    	jpaHelper.close();
		 */
		
		
		/*
		 TvSeries serie = new TvSeries("Mr. Bean","1990",2,14,"1990","1992");    	
//
//    	SerialDao movdao = new SerialDao();
//    	movdao.saveTvSerial(serie);
//    	
//    	SerialDao.listAllTvSeries();
//    	
//    	jpaHelper.beginTransaction();
//    	
//    	jpaHelper.commitTransaction();
//    	
//    	System.out.println(movdao.toString());
//    	jpaHelper.close(); 
		 */
		
		
	}
