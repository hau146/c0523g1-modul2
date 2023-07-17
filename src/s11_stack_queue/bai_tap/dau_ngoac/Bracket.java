package s11_stack_queue.bai_tap.dau_ngoac;

import java.util.Stack;

public class Bracket {
    private Stack<String> bStack = new Stack<>();

    public void checkBracket(String str) {
        String[] newStr = str.split("");
        for (int i = 0; i < newStr.length; i++) {
            if (newStr[i].equals("(") || newStr[i].equals(")")) {
                bStack.add(newStr[i]);
            }
        }
        for (int i = 1; i < bStack.size() ; i++) {
            if (bStack.get(0).equals("(")){

            }
        }
//        if (bStack.size() % 2 == 0) {
//            System.out.println(str + "\tWell");
//        } else {
//            System.out.println(str + "\t???");
//        }
        System.out.println(bStack);
        bStack.clear();
    }

    public int size() {
        return bStack.size();
    }

    public static void main(String[] args) {
        Bracket bracket = new Bracket();
        bracket.checkBracket("s * (s – a) * (s – b) * (s – c)");
        bracket.checkBracket("(– b + (b^2 – 4*a*c)^(0.5/ 2*a))");
        bracket.checkBracket("s * (s – a) * (s – b * (s – c)");
    }
}
