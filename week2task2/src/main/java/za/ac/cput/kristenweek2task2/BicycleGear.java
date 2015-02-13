package za.ac.cput.kristenweek2task2;

/**
 * Created by student on 2015/02/13.
 */
public class BicycleGear extends Bicycle
{
    private String gearBrand;
    private int noGears, currentGear;
    private boolean stopped;

    public BicycleGear(String brand, int noGears)
    {
        super();
        gearBrand = brand;
        this.noGears = noGears;
        currentGear = 0;
        stopped = true;
    }


    public void setGearBrand(String brand)
    {
        gearBrand = brand;
    }

    public void setGears(int gears)
    {
        noGears = gears;
    }

    public void addGear()
    {
        if (currentGear < noGears)
        {
            currentGear++;
            stopped = false;
        }

        else
            System.out.println("Maximum gears reached");
    }

    public void lowerGear()
    {
        if (currentGear > 0)
            currentGear--;

        else
            stopped = true;
    }


    public String getGearBrand()
    {
        return gearBrand;
    }

    public int getNoGears()
    {
        return noGears;
    }

    public int getCurrentGear()
    {
        return currentGear;
    }

    public boolean getStopped()
    {
        return stopped;
    }

    public String toString()
    {
        return String.format("Gear brand: %s\tType: %d gears", gearBrand, noGears);
    }
}
