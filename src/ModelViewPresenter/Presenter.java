package ModelViewPresenter;

public class Presenter
{
    private StudentViewInterface view;
    private StudentAttendance model;

    public Presenter(StudentViewInterface view, StudentAttendance model)
    {
        this.view = view;
        this.model = model;
    }

    public void isPresent(boolean parameter)
    {
        model.setPresent(parameter);
    }
    public void updateView()
    {
        view.showStudent(model.getName(), model.isPresent());
    }
}
