package HomeTask.CatsTask;

import java.util.ArrayList;
import java.util.List;

public class MyCats {

    public static void main(String[] args) {

        List<Cat> catList = new ArrayList<>();
        Cat cat1 = new Cat();
        cat1.setName("napoleon");
        cat1.setColor("white");
        cat1.setAge(6);

        Cat cat2 = new Cat();
        cat2.setName("leon");
        cat2.setColor("gray");
        cat2.setAge(4);

        Cat cat3 = new Cat();
        cat3.setName("puma");
        cat3.setColor("orange");
        cat3.setAge(10);

        Cat cat4 = new Cat();
        cat4.setName("slava");
        cat4.setColor("brown");
        cat4.setAge(2);

        Cat cat5 = new Cat();
        cat5.setName("or");
        cat5.setColor("pale");
        cat5.setAge(32);

        catList.add(cat1);
        catList.add(cat2);
        catList.add(cat3);
        catList.add(cat4);
        catList.add(cat5);

        printCatList(catList);
    }

    public static void printCatList (List<Cat> cats){
        for (Cat cat : cats){
            System.out.println("CatList");
            System.out.println("Cat name: " + cat.getName());
            System.out.println("Cat color: " + cat.getColor());
            System.out.println("Cat age: " + cat.getAge());


        }
    }

}
