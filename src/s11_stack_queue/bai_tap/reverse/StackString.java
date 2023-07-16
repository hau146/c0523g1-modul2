package s11_stack_queue.bai_tap.reverse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.EmptyStackException;

public class StackString {
    private ArrayList<String> wStack;
    private String string;

    public StackString() {
        wStack = new ArrayList<>();
    }

    public void push(String[] mWord) {
        for (int i = 0; i < mWord.length; i++) {
            wStack.add(mWord[i]);
        }
        System.out.println(wStack);
    }

    public void pop(String[] mWord) {
        this.reverse(mWord);
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        for (int i = 0; i < mWord.length; i++) {
            wStack.remove(mWord[i]);
        }
    }

    public String reverse(String[] mWord) {
        String[] newArr = new String[mWord.length];
        int j = 0;
        for (int i = mWord.length - 1; i >= 0; i--) {
            while (j < mWord.length) {
                newArr[j] = mWord[i];
                j++;
                break;
            }
        }
        return Arrays.toString(newArr);
    }

    public int size() {
        return wStack.size();
    }

    public boolean isEmpty() {
        if (wStack.size() == 0) {
            return true;
        }
        return false;
    }
}
