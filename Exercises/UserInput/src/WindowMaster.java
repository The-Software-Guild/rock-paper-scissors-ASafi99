import java.util.Scanner;

public class WindowMaster {

    /**
     * @param args
     */
    public static void main(String[] args) {

        // declare variables for height and width
        float height;
        float width;

        // declare String variables to hold the user's height and
        // width input
        String stringHeight;
        String stringWidth;
        String stringGlassCost;
        String stringTrimCost;
        String stringNumOfWindows;

        // declare other variables
        float areaOfWindow;
        float cost;
        float perimeterOfWindow;
        float glassCost;
        float trimCost;
        float numOfWindows;

        // declare and initialize the Scanner
        Scanner myScanner = new Scanner(System.in);
        boolean isValid = false;

        do {

            try {
                System.out.println("Please enter how many windows:");
                stringNumOfWindows = myScanner.nextLine();
                System.out.println("Please enter window height:");
                stringHeight = myScanner.nextLine();
                System.out.println("Please enter window width:");
                stringWidth = myScanner.nextLine();
                System.out.println("Please enter glass cost ($):");
                stringGlassCost = myScanner.nextLine();
                System.out.println("Please enter trim costs ($):");
                stringTrimCost = myScanner.nextLine();

                numOfWindows = Float.parseFloat(stringNumOfWindows);
                height = Float.parseFloat(stringHeight);
                width = Float.parseFloat(stringWidth);
                glassCost = Float.parseFloat(stringGlassCost);
                trimCost = Float.parseFloat(stringTrimCost);

                // calculate the area of the window
                areaOfWindow = height * width;

                // calculate the perimeter of the window
                perimeterOfWindow = 2 * (height + width);

                // calculate the total cost - use a hard-coded value
                // for material cost
                cost = ((glassCost * areaOfWindow) + (trimCost * perimeterOfWindow)) * numOfWindows;

                // display the results to the user
                System.out.println("Number of windows = " + numOfWindows);
                System.out.println("Window height = " + stringHeight);
                System.out.println("Window width = " + stringWidth);
                System.out.println("Window area = " + areaOfWindow);
                System.out.println("Window perimeter = " + perimeterOfWindow);
                System.out.println("Total Cost =  $" + cost);

                isValid = true;

            } catch (NumberFormatException ex) {
                System.out.println("That was not a whole number!");
            }

        } while (!isValid);


    }
}
