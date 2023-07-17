package s11_stack_queue.bai_tap.kiem_tra_chuoi_palindrome;

import java.util.*;

public class Palindrome {
    private Queue<String> queue = new LinkedList<>();
    private Stack<String> stack = new Stack<>();

    public void enqueue(String str) {
        str = str.toLowerCase();
        String[] newArr = str.split("");
        if (!isEmpty()) {
            throw new IndexOutOfBoundsException("Hàng đợi bị đầy");
        }
        for (int i = newArr.length - 1; i >= 0; i--) {
            queue.add(newArr[i]);
        }
        System.out.println(str);
        this.push(newArr);
    }

    public void push(String[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            stack.add(arr[i]);
        }
    }

    public boolean checkPalindrome() {
        for (int i = 0; i < stack.size(); i++) {
            if (!queue.poll().equals(stack.pop())) {
                System.out.println("Không phải chuỗi Palindrome\n");
                queue.clear();
                stack.clear();
                return false;
            }
        }
        System.out.println("Là chuỗi Palindrome\n");
        queue.clear();
        stack.clear();
        return true;
    }

    public int size() {
        return queue.size();
    }

    public boolean isEmpty() {
        if (queue.size() == 0) {
            return true;
        }
        return false;
    }
}
