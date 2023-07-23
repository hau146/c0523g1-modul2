package ss16_text_file.bai_tap.file_csv;

import java.util.ArrayList;
import java.util.List;

public class ListNation {
    public static final String FILE_NAME = "D:\\c0523g1-modul2\\src\\ss16_text_file\\bai_tap\\file_csv\\nation.csv";
    public static final String COMPA = ",";

    public static void main(String[] args) {
        Nation nation1 = new Nation(1, "AU", "Australia");
        Nation nation2 = new Nation(2, "CN", "China");
        Nation nation3 = new Nation(3, "AU", "Australia");
        Nation nation4 = new Nation(4, "CN", "China");
        Nation nation5 = new Nation(5, "JP", "Japan");
        Nation nation6 = new Nation(6, "CN", "China");
        Nation nation7 = new Nation(7, "JP", "Japan");
        Nation nation8 = new Nation(8, "TH", "Thailand");
        List<Nation> nationList = new ArrayList<>();
        nationList.add(nation1);
        nationList.add(nation2);
        nationList.add(nation3);
        nationList.add(nation4);
        nationList.add(nation5);
        nationList.add(nation6);
        nationList.add(nation7);
        nationList.add(nation8);

        String line = "";
        for (Nation naiton : nationList) {
            line = naiton.getId() + COMPA + naiton.getCode() + COMPA + naiton.getName();
            FileUtils.writeFile(FILE_NAME, line);
        }
    }
}
