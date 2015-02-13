package za.ac.cput.kristenweek2task2module2;

import za.ac.cput.kristenweek2task2.BicycleGear;

import java.util.Scanner;

/**
 * Created by student on 2015/02/13.
 */
public class RideTheBike
{
    public static void main(String[] args)
    {
        //Declarations
        BicycleGear bike = new BicycleGear("Novelty", 4);
        Child kid = new Child("Peter", 5, 4);
        Scanner scan = new Scanner(System.in);
        String input = "0";

        //Statements
        System.out.println("Hello, Peter! Happy Birthday! You just got a new bike. \n\n");
        System.out.println(bike.toString() + "\n\n");
        System.out.println("Do you want to take it out for a ride? [y/n]");
        scan.next(input);

        while (input != "Y" && input != "y" && input != "N" && input != "n")
        {
            System.out.println("Sorry, what was that? [y/n]");
            scan.next(input);
        }

        while (input != "n" && input != "N")
        {
            if (!bike.getStopped())
            {
                if(kid.getStrength() == bike.getNoGears())
                {
                    System.out.println("You went so fast that you grew!");
                    kid.grow();
                    System.out.println(kid.toString());
                }

                else
                {
                    System.out.println("You are pedalling. Do you want to go faster?");
                    scan.next(input);
                    while (input != "Y" && input != "y" && input != "N" && input != "n")
                    {
                        System.out.println("Sorry, what was that? [y/n]");
                        scan.next(input);
                    }

                    if (input == "Y" || input == "y")
                    {
                        bike.addGear();
                    }
                }
            }


            if (kid.getStrength() > bike.getNoGears())
            {
                System.out.println("You got too big for your bike!");
                while (!bike.getStopped())
                    bike.lowerGear();
                input = "Y";
            }


            else
            {
                System.out.println("Do you want to carry on cycling?  [y/n]");
                scan.next(input);

                while (input != "Y" && input != "y" && input != "N" && input != "n")
                {
                    System.out.println("Sorry, what was that? [y/n]");
                    scan.next(input);
                }
            }
        }

        while(!bike.getStopped())
            bike.lowerGear();
        System.out.println("Goodbye, Peter!");
    }
}