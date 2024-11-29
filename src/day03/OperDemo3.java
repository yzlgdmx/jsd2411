package day03;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class OperDemo3 {
    public static void main(String[] args) {
        System.out.println(!(1 > 3) && /*次方*/Math.pow(2/*底数*/, 11/*指数*/) < 4 || 4 + 1 <= 3 ? 'A' + 'a' : false + "------asdfghjkl;");
        //math.lerp
        //Mathf.Lerp();
        HashMap<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
        ArrayList<String> content1 = new ArrayList<>(), content2 = new ArrayList<>();
        content1.add("这是第一章的第1小节");
        content1.add("这是第一章的第2小节");
        content1.add("这是第一章的第3小节");
        content2.add("这是第二章的第1小节");
        content2.add("这是第二章的第2小节");
        content2.add("这是第二章的第3小节");
        map.put("chapter1", content1);
        map.put("chapter2", content2);
        System.out.println(map.get("chapter1"));
        System.out.println(map);
        for (var item : map.entrySet()) {
            System.out.println("Key: " + item.getKey() + ", Value: " + item.getValue());
        }
    }
}
