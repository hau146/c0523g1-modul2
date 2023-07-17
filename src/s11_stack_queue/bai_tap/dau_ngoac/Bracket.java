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
        if (bStack.get(0).equals("(")) {
            if (bStack.get(3).equals(")")) {
                System.out.println(str + "\tWell");
            } else {
                System.out.println(str + "\t???");
            }
            bStack.clear();
        } else {
            System.out.println(str + "\t???");
        }
    }

    public int size() {
        return bStack.size();
    }

    public static void main(String[] args) {
        Bracket bracket = new Bracket();
        bracket.checkBracket("s * (s – a) * (s – b) * (s – c)");
        bracket.checkBracket("(– b + (b^2 – 4*a*c)^(0.5/ 2*a))");
        bracket.checkBracket("s * (s – a) * (s – b * (s – c)");
        bracket.checkBracket("(– b + (b2 – 4*a*c)^0.5) / 2*a");
    }
}
