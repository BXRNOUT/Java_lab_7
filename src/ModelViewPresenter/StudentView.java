package ModelViewPresenter;

public class StudentView implements StudentViewInterface
{
    public void showStudent(String name, boolean isPresent)
    {
        System.out.println("Student: " + name + "\tis present: " + isPresent + ".");
    }
}
