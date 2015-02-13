package za.ac.cput.kristenweek2task2;



public class Bicycle
{
    private String colour;
    private int year, age, wheels;

    public Bicycle()
    {
        colour = "red";
        year = 2015;
        age = 0;
        wheels = 2;
    }

    public Bicycle(String col, int yr, int ayge, int wheelNo)
    {
        colour = col;
        year = yr;
        age = ayge;
        wheels = wheelNo;
    }


    public void setColour(String col)
    {
        colour = col;
    }

    public void setYear(int yr)
    {
        year = yr;
    }

    public void accrueAge()
    {
        age++;
    }

    public void addWheels()
    {
        wheels++;
    }

    public void removeWheels()
    {
        wheels--;
    }


    public String getColour()
    {
        return colour;
    }

    public int getYear()
    {
        return year;
    }

    public int getAge()
    {
        return age;
    }

    public int getWheels()
    {
        return wheels;
    }

    public String toString()
    {
        return String.format("Year: %d\tColour: %s\tWheels: %d\n%d years old", year, colour, wheels, age);
    }
};
