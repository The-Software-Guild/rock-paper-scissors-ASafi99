package com.sg.foundations.variables;

public class MenuOfChampions {

    public static void main(String[] args) {


        // ASCII ART https://asciiart.website//index.php?art=art%20and%20design/borders

        String food1, food2, food3;
        double price1, price2, price3;

        food1 = "Pizza";
        food2 = "Burger";
        food3 = "Lasagne";

        price1 = 49.99;
        price2 = 61.50;
        price3 = 99.99;

        System.out.println("^v^v^v^v^v^v^v^v^v^v^v^v^v^v^v^v^v^v^v^v^v^v^v^v^v^v^v^v^v^v^\n");
        System.out.println("WELCOME TO RESTAURANT NIGHT VALE!\n" +
                "Today's Menu Is...\n");
        System.out.println("^v^v^v^v^v^v^v^v^v^v^v^v^v^v^v^v^v^v^v^v^v^v^v^v^v^v^v^v^v^v^\n");
        System.out.println(
                "             $ "+ price1 + " *** " + food1 + "\n" +
                "             $ "+ price2 + " ***** " + food2 + "\n" +
                "             $ "+ price3 + " ***** " + food3);

    }
}
