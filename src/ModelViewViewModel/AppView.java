package ModelViewViewModel;

import java.util.List;

public class AppView
{
    public void printApps(List<App> apps)
    {
        for (App app : apps)
            System.out.println("App name: " + app.getName() + "\trating: " + app.getRating() + "*\tdownloads: " + app.getDownloads() + " mlrd");
    }
}
