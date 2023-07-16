package s11_stack_queue.bai_tap.stack_reveser;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.EmptyStackException;

public class StackNumber<N> {
    private ArrayList<Number> stack;

    public StackNumber() {
        stack = new ArrayList<>();
    }

    public ArrayList<Number> push(Number element) {
        stack.add((Number) element);
        return stack;
    }

    public void pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        stack.remove(stack.size() - 1);
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

