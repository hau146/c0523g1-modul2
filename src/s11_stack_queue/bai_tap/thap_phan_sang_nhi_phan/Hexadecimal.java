package s11_stack_queue.bai_tap.thap_phan_sang_nhi_phan;

import java.util.ArrayList;

public class Hexadecimal {
    private ArrayList<Number> stack;
    private String sum = "";


    public Hexadecimal() {
        stack = new ArrayList<>();
    }

    public ArrayList<Number> effectiveness(int number) {
        stack.add(number);
        int total = number / 2;
        for (int i = 0; i < number; i++) {
            stack.add(total);
            total = total / 2;
            if (total == 0) {
                break;
            }
        }
        return stack;
    }

    public String getTotalExcess() {
        for (int i = 0; i < stack.size(); i++) {
            int remainder = ((Integer) stack.get(i)) % 2;
            sum += remainder;
        }
        stack.clear(); //tìm dc hệ nhị phân thì xóa sạch stack

        StringBuilder temp = new StringBuilder(sum); //để đảo nguợc chuỗi
        temp.reverse();
        String result = temp.toString();
        return result;
    }

    public int size() {
        return stack.size();
    }


    public static void main(String[] args) {
        Hexadecimal hexadecimal = new Hexadecimal();
        hexadecimal.effectiveness(30);
        System.out.println(hexadecimal.stack);
        System.out.println(hexadecimal.getTotalExcess());
        hexadecimal.effectiveness(100);
        System.out.println(hexadecimal.stack);
        System.out.println(hexadecimal.getTotalExcess());
    }
}
