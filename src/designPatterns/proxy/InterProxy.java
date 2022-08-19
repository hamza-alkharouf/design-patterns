package designPatterns.proxy;

import java.util.Arrays;
import java.util.List;

public class InterProxy implements InternetServiceProvider{

    private List<String> bockedSite = Arrays.asList("twitter","youtube","facebook");

    @Override
    public String serverSite(String url) {
        internetLog(url);
        if (bockedSite.contains(url))
            return "This website is blocked";
        return new Paltel().serverSite(url);
    }

    private void internetLog(String url) {
        System.out.printf("[%d] -> %s requested \n",System.currentTimeMillis(),url);
    }


}
