package ss12_conllection_framework.bai_tap.map;

import java.util.Map;
import java.util.TreeMap;

public class MyMap {
    public static void main(String[] args) {
        String str = "code gym da nang";
        String[] newStr = str.split(" ");
        int count = 0;
        Map<String, Integer> map = new TreeMap<>();
        for (int i = 0; i < newStr.length; i++) {
            if (map.containsKey(newStr[i])) {
                map.put(newStr[i], count++);
            } else {
                map.put(newStr[i], count++);
            }
        }
        System.out.println(count);
    }
}
