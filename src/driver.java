/**
 * Emmanuel Klutse
 * CH3PC7 - Widget Factory
 * 24/1/19
 */

import java.util.Scanner;

public class driver
{
    public static void main(String[] args)
    {
        //Establish input variable, scanner object, and factory object
        int input;
        Scanner keyboard = new Scanner(System.in);

        widget driver = new widget();

        //Get widget number data from user
        System.out.println("Input the number of widgets that are needed "
                + "to be produced.");
        input = keyboard.nextInt();
        driver.setNumwidgets(input);

        //Print number of days needed to produce widgets
        System.out.println("It will take " + driver.getTime() + " days "
                + "to complete the order.");
    }
}