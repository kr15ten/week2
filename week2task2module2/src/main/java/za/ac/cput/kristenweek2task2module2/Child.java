package za.ac.cput.kristenweek2task2module2;


public class Child
{
    private String name;
    private int age, gearStrength;

    public Child()
    {
        name = "John Doe";
        age = 3;
        gearStrength = 1;
    }

    public Child(String name, int age, int strength)
    {
        this.name = name;
        this.age = age;

        if (strength < 1)
            gearStrength = 1;

        else if (strength > 12)
            gearStrength = 12;

        else
            gearStrength = strength;
    }


    public void setName(String name)
    {
        this.name = name;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public void setStrength(int strength)
    {
        gearStrength = strength;
    }


    public void grow()
    {
        age++;
        if (age%2 == 0 && gearStrength < 12)
            gearStrength++;
    }


    public String getName()
    {
            return name;
    }

    public int getAge()
    {
        return age;
    }

    public int getStrength()
    {
      return gearStrength;
    }


    public String toString()
    {
        return String.format("Name: %s\tAge:  %d\nCan use up to gear %d", name, age, gearStrength);
    }
}