package s11_stack_queue.bai_tap.stack_reveser;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.EmptyStackException;

public class StackString {
    private ArrayList<String> wStack;
    private String string;

    public StackString() {
        wStack = new ArrayList<>();
    }

    public ArrayList<String> push(String str) {
        String[] newArr = str.split(" ");
        for (int i = 0; i < newArr.length; i++) {
            wStack.add(newArr[i]);
        }
        return wStack;
    }

    public void pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        wStack.remove(wStack.size() - 1);
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
