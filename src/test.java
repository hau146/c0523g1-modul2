import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class test {
    // aaabbaaac -> a3b2a3c1
//    public static String encodeString(String str) {
//        int count = 0;
//        ArrayList arrayList = new ArrayList<>();
//        ArrayList arrayList2 = new ArrayList<>();
//        String[] newArr = str.split("");
//        for (String array : newArr) {
//            arrayList2.add(array);
//        }
//        ArrayList result = new ArrayList<>();
//        for (int i = 0; i < arrayList2.size() ; i++) {
//            for (int j = i; j < arrayList2.size() ; j++) {
//                if (arrayList2.get(i).equals(arrayList2.get(j))){
//                    arrayList.add(arrayList2.get(i));
//                    arrayList2.remove(i);
//                    count++;
//                    break;
//                } else if (arrayList2.get(i).equals(arrayList2.get(j-1))){
//                    break;
//                }
//            }
//        }
//
//    }
}
