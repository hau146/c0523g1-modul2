package s11_stack_queue.bai_tap.reverse;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.EmptyStackException;

public class StackNumber {
    private ArrayList<Number> stack;
    private static Object[] element;

    static {
        element = new Object[]{1, 2, 3, 4};
    }

    public StackNumber() {
        stack = new ArrayList<>();
    }

    public void push() {
        for (int i = 0; i < element.length; i++) {
            stack.add((Number) element[i]);
        }
        System.out.println(stack);
    }

    public void pop() {
        this.reverse();
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        for (int i = 0; i < element.length; i++) {
            stack.remove(element[i]);
        }
        System.out.println(this.reverse());
    }

    public Object reverse() {
        Object[] newArr = new Object[element.length];
        int j = 0;
        for (int i = element.length - 1; i >= 0; i--) {
            while (j < element.length) {
                newArr[j] = element[i];
                j++;
                break;
            }
        }
        return Arrays.toString(newArr);
    }

    public int size() {
        return stack.size();
    }

    public boolean isEmpty() {
        if (stack.size() == 0) {
            return true;
        }
        return false;
    }
}

