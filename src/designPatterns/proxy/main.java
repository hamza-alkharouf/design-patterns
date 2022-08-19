package designPatterns.proxy;

import java.util.Arrays;
import java.util.List;

public class main {
    public static void main(String[] args) {
        List<String> sites = Arrays.asList("twitter","github","facebook");
        InternetServiceProvider internetServiceProvider = new InterProxy();
        InternetServiceProvider s =new Paltel();

        for(String site : sites)
            System.out.println(internetServiceProvider.serverSite(site));


    }
}
