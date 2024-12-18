package ModelViewViewModel;

public class App
{
    private String name;
    private double rating;
    private int downloads;

    public App(String name, double rating, int downloads)
    {
        this.name = name;
        this.rating = rating;
        this.downloads = downloads;
    }

    public String getName()
    {
        return name;
    }
    public double getRating()
    {
        return rating;
    }
    public int getDownloads()
    {
        return downloads;
    }
}
