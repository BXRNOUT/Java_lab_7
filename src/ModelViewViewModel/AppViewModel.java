package ModelViewViewModel;

import java.util.*;
import java.util.stream.Collectors;

public class AppViewModel
{
    private List<App> apps;

    public AppViewModel()
    {
        apps = new ArrayList<>();
    }

    public void addNewApp(String name, double rating, int downloads)
    {
        apps.add(new App(name, rating, downloads));
    }
    public List<App> getApps()
    {
        return apps;
    }
    public List<App> filtration(String name)
    {
        List<App> names = new ArrayList<>();
        for (App app : apps)
        {
            if (app.getName().equalsIgnoreCase(name))
                names.add(app);
        }
        return names;
    }
    public List<App> filtration(double rating)
    {
        List<App> ratings = new ArrayList<>();
        for (App app : apps)
        {
            if(rating <= app.getRating())
                ratings.add(app);
        }
        return ratings;
    }
    public List<App> filtration(int downloads)
    {
        List<App> download = new ArrayList<>();
        for (App app : apps)
        {
            if(downloads <= app.getDownloads())
                download.add(app);
        }
        return download;
    }
    public void selectionSort()
    {
        Comparator<App>  compareByName = Comparator.comparing((App::getName));
        apps = apps.stream().sorted(compareByName).collect(Collectors.toCollection(ArrayList::new));
    }

}
