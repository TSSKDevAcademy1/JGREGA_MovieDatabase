package sk.tsystems.akademia.MovieDatabase.dao;

import java.util.List;

import sk.tsystems.akademia.MovieDatabase.model.TvSeries;
import sk.tsystems.akademia.MovieDatabase.model.jpaHelper;


public class SerialDao {	
		
		public void saveTvSerial(TvSeries series){
			jpaHelper.beginTransaction();
			jpaHelper.getEntityManager().persist(series);
			System.out.println("After persist");
			
			//company entity is managed
			jpaHelper.commitTransaction();
			// company entity is detached
		}
		
		public static void listAllTvSeries(){
			jpaHelper.beginTransaction();
			List<TvSeries> series= jpaHelper.getEntityManager().createQuery("select c from TvSeries c",TvSeries.class).getResultList();
			
			for(TvSeries serie : series){
				System.out.println(serie);
			}
			
			jpaHelper.commitTransaction();
		}
		
		public TvSeries find(long id){
			return jpaHelper.getEntityManager().find(TvSeries.class,id);
		}
		
		/*
		 
		  public static void search(String number){
		List<PersonD> persons= JpaHelperD.getEntityManager()
				.createQuery("select c from PersonD c join c.luckyNumbers lucky where lucky = :number ",PersonD.class).setParameter("number", number).getResultList();
		System.out.println(persons.toString());
	}
		 
		 */
	}
