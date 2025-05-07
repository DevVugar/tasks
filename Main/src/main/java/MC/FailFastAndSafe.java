package MC;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class FailFastAndSafe {
    public static void main(String[] args) {


        withList();

    }

    public static void withList() {


        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");

//        for (int i=0; i<list.size();i++) {
//            list.add("C");
//          //  list.set(1,"C");
//        }


        for (String s : list) {
            System.out.println("aa");
         //   list.add("C");
            System.out.println("aa");
        //  list.set(1,"cat");
     //     list.remove(1);
        }
    }



    public static void withMap() {

        Map<String, String> map = new HashMap<>();
        map.put("1", "A");
        map.put("2", "B");

        for (String key : map.keySet()) {
            map.put("3", "C"); // No exception
        }
    }


    public static void withConcurredMap() {

        Map<String, String> map = new ConcurrentHashMap<>();
        map.put("1", "A");
        map.put("2", "B");

        for (String key : map.keySet()) {
            map.put("3", "C"); // No exception
        }
    }

}