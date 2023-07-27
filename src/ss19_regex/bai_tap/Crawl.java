package ss19_regex.bai_tap;

import s11_stack_queue.bai_tap.kiem_tra_chuoi_palindrome.Palindrome;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Crawl {
    //    private static final String REGEX_NEWS = "\\<h3.*?\\</h3\\>";
    private static final String REGEX_NEWS = "<a href=\"(.*?)\">(.*?)</a>";

    public static void main(String[] args) {
        try {
            URL url = new URL("https://dantri.com.vn/the-gioi.htm");

            Scanner scanner = new Scanner(new InputStreamReader(url.openStream()));
            scanner.useDelimiter("\\Z");
            String content = scanner.next();
            scanner.close();
            content = content.replaceAll("\\n+", ",");
            Pattern pattern = Pattern.compile(REGEX_NEWS);
            Matcher matcher = pattern.matcher(content);
            while (matcher.find()) {
                System.out.println(matcher.group(1));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

//        URL link = new URL("https://dantri.com.vn/the-gioi.htm");
//        URLConnection connection = link.openConnection();
//        BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
//
//        String dataLine = "";
//        String line;
//        while ((line = reader.readLine()) != null){
//            dataLine += line;
//        }
//        Pattern pattern1 = Pattern.compile(REGEX_NEWS);
//        Matcher matcher1 = pattern1.matcher(dataLine);
//
//        ArrayList<String> list = new ArrayList<>();
//        while (matcher1.find()){
//            String stringMatch = matcher1.group();
//            list.add(stringMatch);
//        }
//        for (String str : list){
//            System.out.println(str);
//        }
    }
}
