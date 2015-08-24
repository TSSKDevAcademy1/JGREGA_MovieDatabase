package sk.tsystems.akademia.MovieDatabase;

import java.util.Date;
import java.util.List;

import sk.tsystems.akademia.MovieDatabase.dao.CelebrityDao;
import sk.tsystems.akademia.MovieDatabase.dao.GenreDao;
import sk.tsystems.akademia.MovieDatabase.dao.MovieDao;
import sk.tsystems.akademia.MovieDatabase.dao.ReviewDao;
import sk.tsystems.akademia.MovieDatabase.dao.SerialDao;
import sk.tsystems.akademia.MovieDatabase.model.Genre;
import sk.tsystems.akademia.MovieDatabase.model.Movie;
import sk.tsystems.akademia.MovieDatabase.model.TvSeries;
import sk.tsystems.akademia.MovieDatabase.model.VideoArt;
import sk.tsystems.akademia.MovieDatabase.model.jpaHelper;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//////// minimalne 5 realnych filmov public Movie(String name,String yearOfPublication, Date date, String length)
//    	Movie movie = new Movie("Rain Man","1988",new Date(),"133");    	
//
//    	MovieDao movdao = new MovieDao();
//    	movdao.saveMovie(movie);
//    	
//    	MovieDao.listAllMovies();
//    	
//    	jpaHelper.beginTransaction();
//    	
//    	jpaHelper.commitTransaction();
//    	
//    	System.out.println(movdao.toString());
//    	jpaHelper.close();
//    	
////////// 5 serialov (String name,String yearOfPublication,int series, int episode, String startYear, String endYear)
//    	TvSeries serie = new TvSeries("Mr. Bean","1990",2,14,"1990","1992");    	
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

///////// 5 zanrov Genre(String name, String description)
//    	Genre genre = new Genre("Rodinny","Film/serial z prostredia rodiny");    	
//
//    	GenreDao movdao = new GenreDao();
//    	movdao.saveGenre(genre);
//    	
//    	GenreDao.listAllGenres();
//    	
//    	jpaHelper.beginTransaction();
//    	
//    	jpaHelper.commitTransaction();
//    	
//    	System.out.println(movdao.toString());
//    	jpaHelper.close();
//    	

///////// Pridanie zanru do VideoArt k danemu filmu (Zadam Id filmu a Id zanru)
//    	VideoArt video = jpaHelper.getEntityManager().find(VideoArt.class, 13L); // mozem vyhladat cez toto alebo cez funkciu find(long id) vytvorenu v MovieDao
//    	Genre genre = jpaHelper.getEntityManager().find(Genre.class, 17L); // mozem vyhladat cez toto alebo cez funkciu find(long id) vytvorenu v GenreDao
//    	video.addGenres(genre);
//    	
//    	jpaHelper.beginTransaction();
//    	
//    	jpaHelper.commitTransaction();
//    	
//    	jpaHelper.close();
    	
//////////- vytvorenie novej celebrity (BEZ priradenych filmov a serialov ktore rezirovali alebo v ktorych hrali

//    	CelebrityDao cedao = new CelebrityDao();
//    	cedao.addCelebrity("AlastaiR", "Fothergill", new Date(), "dfasdg");    	
    	
//////// - pridanie rezisera do videoArt
//    	//addDirector(long idVideo,long idCelebrity)
//    	CelebrityDao cedao = new CelebrityDao();
//    	cedao.addDirector(13, 37);
    	
/////// - pridanie herca do videoArt    	
//    	//addActors(long idVideo,long idCelebrity)
//    	CelebrityDao cedao = new CelebrityDao();
//    	cedao.addActor(13, 36);
 
/////// - vytvorenie Review k VideoArt    	
//    	CreateReview(Date date, int rating, String text
//    	ReviewDao rewdao = new ReviewDao();
//    	rewdao.CreateReview(new Date(), 10, "Kultovka");
    	
///// - priradenie REVIEW k filmu 
//    	//addReview(long idVideo,long idCelebrity) -- zle som to pochopil
//    	ReviewDao rewdao = new ReviewDao();
//    	rewdao.addReview(2, 43);
    	
////// - zobrazenie vsetkych filmov publikovanych za dany rok
    	MovieDao dao = new MovieDao();
    	dao.FindByYear("1994");
    	
////// - zobrazenie vsetkych filmov v ktorych hral zvoleny herec
//    	MovieDao dao = new MovieDao();
//    	dao.FindByActor("Snipes","Wesley");
    	
    }
}

