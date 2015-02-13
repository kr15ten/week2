package za.ac.cput.kristenweek2;

/**
 * Hello world!
 *
 */
public class StudentObject
{
    private String fName, lName;
    private int studNo, coursesPassed;
    private float fees;
    private boolean passing, paid;


    public StudentObject(String name, String surname, int stdn, float fee, boolean pass)
    {
        fName = name;
        lName = surname;
        studNo = stdn;
        fees = fee;
        passing = pass;
        paid = false;
    }

    public StudentObject(String name, String surname, int stdn, float fee, boolean pass, int coursesPass)
    {
        fName = name;
        lName = surname;
        studNo = stdn;
        fees = fee;
        passing = pass;
        coursesPassed = coursesPass;
        paid = false;
    }

    public void setCoursesPassed(int passed)
    {
        coursesPassed=passed;
    }

    public String getName()
    {
        return fName + " " + lName;
    }

    public int getStdno()
    {
        return studNo;
    }

    public float getFees()
    {
        return fees;
    }

    public boolean getPass()
    {
        return passing;
    }

    public int getCoursesPassed()
    {
        return coursesPassed;
    }

    public boolean getPaid()
    {
        return paid;
    }

    public String toString()
    {
        return String.format("%s\t%s\n%d", fName, lName, studNo);
    }
}
