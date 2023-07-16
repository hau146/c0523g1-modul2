package s11_stack_queue.bai_tap.stack_reveser;

import java.util.Arrays;

public class TestStackNumber {
    public static void main(String[] args) {
        StackNumber stack = new StackNumber();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.push(4));
        Integer lenght = stack.size();
        System.out.println("Mảng trước khi đảo ngược");
        for (int i = 0; i < lenght; i++) {
            stack.pop();
        }
        stack.push(4);
        stack.push(3);
        stack.push(2);
        System.out.println(stack.push(1));
        System.out.println("Mảng sau khi đảo ngược");
    }
}
