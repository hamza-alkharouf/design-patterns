package designPatterns.singleton;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Singleton {

    private Integer[] numbers = {1,2,3,4,5,6,7};
    private List<Integer> list = Arrays.asList(numbers);
    private static Singleton instance;

    public static Singleton getInstance() {
        if (instance == null) {
           instance = new Singleton();
        }
        return instance;
    }

    private Singleton(){
        System.out.println("Object Created");
        Collections.shuffle(list);
        System.out.println(this.hashCode());
    }
    public  void printer(){
        for (Integer i:list){
            System.out.print(i.toString()+" ");
        }
        System.out.println();
    }

}
