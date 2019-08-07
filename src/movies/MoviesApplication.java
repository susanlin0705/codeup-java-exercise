package movies;

import java.util.Scanner;

import util.Input;

public class MoviesApplication {





    public void findMovies(){
        System.out.println("What would you like to do? ");
        System.out.println("0 - exit \n"+
                "1 - view all movies \n"+
                "2 - view movies in the animated category \n"+
                "3 - view movies in the drama category \n"+
                "4 - view movies in the horror category \n"+
                "5 - view movies in the scifi category");

    }

     public void displayMovies(Movie[] movies){
        // create loop to show all the list of the movies.(for each loop)
        // for each movie display movie and genre (movie -- genre)
         for (Movie movie : movies){
             System.out.println(movie.getName() +" -- "+ movie.getCategory());
         }
     }

    public void moviesByCategory(Movie[] movies, String category) {
        for(Movie movie :movies) {
            if(movie.getCategory().contains(category)) {
                System.out.println(movie.getName()+ " -- " + movie.getCategory());
            }
        }
    }

    public static void main(String[] args) {
        MoviesApplication movie1 = new MoviesApplication();

        Movie[] mymovies = MoviesArray.findAll();

//        Scanner scan = new Scanner(System.in);

        boolean keepGoing = true;

            do {
                movie1.findMovies();
                System.out.println("Please Enter the Number");
                Input typeIn = new Input();
                Integer input = typeIn.getInt(0, 5);


                if (input == 0) {
                    keepGoing=false;
                } else if (input.equals(1)) {
                    movie1.displayMovies(mymovies);
                } else if (input.equals(2)) {
                    movie1.moviesByCategory(mymovies, "animated");
                } else if (input.equals(3)) {
                    movie1.moviesByCategory(mymovies, "drama");
                } else if (input.equals(4)) {
                    movie1.moviesByCategory(mymovies, "horror");
                } else if (input.equals(5)) {
                    movie1.moviesByCategory(mymovies, "scifi");
                } else {
                    System.out.println("please type again");
                }
            } while (keepGoing);

        }

}
