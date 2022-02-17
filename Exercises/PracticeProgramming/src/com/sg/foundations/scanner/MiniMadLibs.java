package com.sg.foundations.scanner;

import java.util.Scanner;

public class MiniMadLibs {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String rand = (4+3) + "s";
        System.out.printf(rand);

        System.out.println("Let's play MAD LIBS!");

        System.out.print("I need a noun: ");
        String noun1 = scanner.nextLine();

        System.out.print("Now an adjective: ");
        String adjective = scanner.nextLine();

        System.out.print("Another noun: ");
        String noun2 = scanner.nextLine();

        System.out.print("And a number: ");
        int number = Integer.parseInt(scanner.nextLine());

        System.out.print("Another adjective: ");
        String adjective2 = scanner.nextLine();

        System.out.print("A plural noun: ");
        String noun3 =  scanner.nextLine();

        System.out.print("Another noun: ");
        String noun4 =  scanner.nextLine();

        System.out.print("One more noun: ");
        String noun5 =  scanner.nextLine();

        System.out.print("A verb (infinitive form)");
        String verb =  scanner.nextLine();
        System.out.print("Same verb (past form)");
        String pastVerb =  scanner.nextLine();

        System.out.println("*** NOW LETS GET MAD (libs) ***\n" +
        noun1+ ":" + " the" +  adjective + " frontier. These are the voyages of the starship " + noun2 + ". Its "+ number + "-year mission: to explore strange red kittens, to seek out red balls and red lettuce, to boldly sneeze where no one has sneezed before.");

//        A plural noun: kittens
//        Another one: balls
//        One more: lettuce
//        A verb (infinitive form): sneeze
//        Same verb (past participle): sneezed
    }
}
