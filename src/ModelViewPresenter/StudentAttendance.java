package ModelViewPresenter;

public class StudentAttendance
{
    private String name;
    private boolean isPresent = false;

    public StudentAttendance(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }
    public boolean isPresent()
    {
        return isPresent;
    }
    public void setPresent(boolean isPresent)
    {
        this.isPresent = isPresent;
    }
}
