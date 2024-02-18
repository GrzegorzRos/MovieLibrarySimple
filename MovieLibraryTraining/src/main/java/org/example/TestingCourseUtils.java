package org.example;

import models.Actor;
import models.Movie;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestingCourseUtils {

    public static void javaBaseCourse() {
        Scanner scan = new Scanner(System.in);

//        System.out.println("Podaj mi swoje imię");
//        String name = scan.nextLine();
//
//        System.out.println("Podaj swój wiek");
//        int age = scan.nextInt();
//
//        switch (name) {
//            case "Jurek", "Leszek", "Adaś" -> System.out.println("Zapraszam, " + name + " brachu, zapraszam do środka. Masz już swoje " + age + " Lat to na co czekasz.");
//            case "Donald" -> System.out.println("Ciebie nie wpuszczam " + name);
//            default -> System.out.println(name + " Nie znam Cię");
//        }

//        System.out.println("podaj czas do wybuchu bomby");
//        int time = scan.nextInt();

//        for (int i=time; i>= 0; i--){
//            if (i>0) {
//                System.out.println("bomba wybuchnie za " + i);
//                try {
//                    Thread.sleep(1000);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
//            } else {
//                System.out.println("!!!!!  BUM !!!!!!!!");
//            }
//        }

//        while(time>=0){
//            if (time>0) {
//                System.out.println("bomba wybuchnie za " + time);
//                try {
//                    Thread.sleep(1000);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
//            } else {
//                System.out.println("!!!!!  BUM !!!!!!!!");
//            }
//            time--;
//        }

//        do {
//            if (time > 0) {
//                System.out.println("bomba wybuchnie za " + time);
//                try {
//                    Thread.sleep(1000);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
//            } else {
//                System.out.println("!!!!!  BUM !!!!!!!!");
//            }
//            time--;
//        } while (time >= 0);

//        String[] movies = new String[3];
//        String[] movies = {"Green mile", "Shawshank redemptions", "Va banque"};
//        int[] rating = new int[3];
//
//        for (int i=0; i<3; i++){
//            System.out.println("proszę podaj ranking dla filmu " + movies[i]);
//            rating[i]=scan.nextInt();
//        }
//        for (int i=0; i<3; i++){
//            System.out.println("Według rankingu film " + movies[i] + " ma pozycję " + rating[i]);
//        }

//        List<String> moviesStringList = new ArrayList<>();
//        moviesStringList.add("Green mile");
//        moviesStringList.add("Shawshank redemptions");
//        moviesStringList.add("Va banque");
//        moviesStringList.add("King size");
//        moviesStringList.add("Titanic");
//        moviesStringList.add("Dune");
//
//        List<Integer> ratingList =  new ArrayList<>();
//        System.out.println("Za chwilę zobaczysz listę filmów. Proszę oceń je");
//
////        for (int i=0; i<moviesList.size(); i++){
////            System.out.println("proszę podaj ranking dla filmu " + moviesList.get(i));
////            ratingList.add(scan.nextInt());
////        }
//
//        for (String el: moviesStringList){
//            System.out.println("proszę podaj ranking dla filmu " + el);
//            ratingList.add(scan.nextInt());
//        }
//        for (int i=0; i<moviesStringList.size(); i++){
//            System.out.println("Według rankingu film " + moviesStringList.get(i) + " ma pozycję " + ratingList.get(i));
//        }

//        Movies[] movies2 = new Movies[3];
//        movies2[0].setTitle("Green mile");
//        movies2[1].setTitle("Shawshank redemptions");
//        movies2[2].setTitle("Va banque");
//        for (Movies el: movies2){
//            System.out.println("proszę podaj ranking dla filmu " + el.getTitle());
//            el.setRating(scan.nextInt());
//        }
//        System.out.println("Podsumowanie:");
//        for (Movies el: movies2){
//            System.out.println("Według rankingu film " + el.getTitle() + " ma pozycję " + el.getRating());
//        }

        List<Actor> greenMilesActors = new ArrayList<>();
        greenMilesActors.add(new Actor("Tom", "Hanks", 2, true));
        greenMilesActors.add(new Actor("Michael", "Duncan", 10, false));
        greenMilesActors.add(new Actor("Doug", "Hutchinson", 50, false));

        List<Movie> movieList = new ArrayList<>();

        System.out.println("Za chwilę zobaczysz listę filmów. Proszę oceń je");
        movieList.add(new Movie("Green mile", 0 , greenMilesActors));
        movieList.add(new Movie("Shawshank redemptions"));
        movieList.add(new Movie("Va banque"));
        movieList.add(new Movie("King size"));
        movieList.add(new Movie("Titanic"));
        movieList.add(new Movie("Dune"));

        for (Movie el: movieList){
            System.out.println("Proszę podaj ranking dla filmu " + el.getTitle());
            el.setRating(scan.nextInt());
        }
        System.out.println("Podsumowując uznałeś że:");
        for (Movie el: movieList){
            System.out.println("Film " + el.getTitle() + " ma pozycję " + el.getRating());
        }

        System.out.println("w filmach tych wystepują:");
        for (Movie el: movieList){
            System.out.println("Film " + el.getTitle() + ":");
            for (Actor act: el.getActors()) {
                System.out.println(act);
            }
        }
    }
}
