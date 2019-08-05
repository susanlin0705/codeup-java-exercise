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


    public static void main(String[] args) {
        MoviesApplication movie1 = new MoviesApplication();
        movie1.findMovies();
        Movie[] movies = MoviesArray.findAll();

//        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter the Number");
//        int input = scan.nextInt();
        Input input = new Input();
        int userInput= input.getInt(0,5);

        System.out.println("Are you an admin?");
        boolean userAnswer = input.yesNo();

//        do {
//            if (input==1)
                movie1.displayMovies(movies);
//            } else if (input==2) {
//                return animated movie;
//            }else if (input=2){
//                return drama;
//            }else if (input==3){
//                return horror movie;
//            }else if (input==4){
//                return horror movie;
//            }else if (input){
//                return scifi movie;
//            }else{
//                return exit;
//            }
//        }while (true);


    }

}
