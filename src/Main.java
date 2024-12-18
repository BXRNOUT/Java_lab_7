import ModelViewController.Enemy;
import ModelViewController.EnemyController;
import ModelViewController.EnemyView;
import ModelViewPresenter.Presenter;
import ModelViewPresenter.StudentAttendance;
import ModelViewPresenter.StudentView;
import ModelViewPresenter.StudentViewInterface;
import ModelViewViewModel.AppView;
import ModelViewViewModel.AppViewModel;

class Main
{
    public static void main(String[] args)
    {
        Enemy dragon = new Enemy("Dragon", 100);
        Enemy goblin = new Enemy("Goblin", 100);
        EnemyView dragonView = new EnemyView();
        EnemyView goblinView = new EnemyView();
        EnemyController dragonController = new EnemyController(dragon,dragonView);
        EnemyController goblinController = new EnemyController(goblin, goblinView);
        dragonController.updateView();
        goblinController.updateView();
        dragonController.takeDamage(60);
        dragonController.heal(35);
        goblinController.takeDamage(90);
        System.out.println();

        StudentAttendance student = new StudentAttendance("Cristiano");
        StudentViewInterface view = new StudentView();
        Presenter presenter = new Presenter(view, student);
        presenter.updateView();
        presenter.isPresent(true);
        presenter.updateView();
        System.out.println();

        AppViewModel viewModel = new AppViewModel();
        AppView appView = new AppView();
        viewModel.addNewApp("Youtube", 4.8, 390);
        viewModel.addNewApp("VK", 3.1, 20);
        viewModel.addNewApp("Telegram", 4.4, 127);
        appView.printApps(viewModel.filtration("youtube"));
        System.out.println();
        appView.printApps(viewModel.filtration(4.3));
        System.out.println();
        appView.printApps(viewModel.filtration(40));
        System.out.println();
        appView.printApps(viewModel.getApps());
        System.out.println();
        viewModel.selectionSort();
        appView.printApps(viewModel.getApps());
    }
}

