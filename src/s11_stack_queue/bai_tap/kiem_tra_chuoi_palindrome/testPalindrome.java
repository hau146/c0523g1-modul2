package s11_stack_queue.bai_tap.kiem_tra_chuoi_palindrome;

import java.util.Queue;

public class testPalindrome {
    private static String palindrome = "Able was I ere I saw Elba";

    public static void main(String[] args) {
        Palindrome queue = new Palindrome();
        queue.enqueue(palindrome);
        queue.checkPalindrome();
        queue.enqueue("aaaaaaa bbbbadac");
        queue.checkPalindrome();
    }
}
