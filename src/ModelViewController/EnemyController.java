package ModelViewController;

public class EnemyController
{
    private Enemy model;
    private EnemyView view;

    public EnemyController(Enemy model, EnemyView view)
    {
        this.model = model;
        this.view = view;
    }

    public void takeDamage(int damage)
    {
        model.takeDamage(damage);
        updateView();
    }
    public void heal(int amount)
    {
        model.heal(amount);
        updateView();
    }
    public void updateView()
    {
        view.displayEnemyHealth(model.getName(), model.getHealth());
    }
}
