package za.ac.cput.kristenweek2task2module2;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import za.ac.cput.kristenweek2task2.BicycleGear;

import java.util.Scanner;

/**
 * Created by student on 2015/02/13.
 */
public class TestAll extends TestCase
{

    public TestAll( String testName )
    {
        super( testName );
    }


    public static Test suite()
    {
        return new TestSuite( TestAll.class );
    }

    public void testWorks()
    {
        RideTheBike run = new RideTheBike();
        assertNotNull(run());
    }


    public void testMain() throws Exception
    {
        BicycleGear bike = new BicycleGear("Novelty", 4);
        Child kid = new Child("Peter", 5, 4);
        Scanner scan = new Scanner("y");
        String input = "0";

        //Statements
        System.out.println("Hello, Peter! Happy Birthday! You just got a new bike. \n\n");
        System.out.println(bike.toString() + "\n\n");
        System.out.println("Do you want to take it out for a ride? [y/n]");
        input = "y";

        while (input != "Y" && input != "y" && input != "N" && input != "n")
        {
            System.out.println("Sorry, what was that? [y/n]");
            input = "y";
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
                    input = scan.next();
                    while (input != "Y" && input != "y" && input != "N" && input != "n")
                    {
                        System.out.println("Sorry, what was that? [y/n]");
                        input = scan.next();
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
                input = "n";

                while (input != "Y" && input != "y" && input != "N" && input != "n")
                {
                    System.out.println("Sorry, what was that? [y/n]");
                    input = "y";
                }
            }
        }

        while(!bike.getStopped())
            bike.lowerGear();
        System.out.println("Goodbye, Peter!");
    }
}
