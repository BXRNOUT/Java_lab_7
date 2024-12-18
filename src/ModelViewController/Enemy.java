package ModelViewController;

public class Enemy
{
    private int health;
    private final String name;

    public Enemy(String name, int health)
    {
        this.name = name;
        this.health = health < 0 ? 0 : Math.min(100, health);
    }
    public String getName()
    {
        return name;
    }
    public int getHealth()
    {
        return health;
    }
    public void takeDamage(int damage)
    {
        health = Math.max(0, health - damage);
    }
    public void heal(int amount)
    {
        health = Math.min(100, health + amount);
    }
}
