package s11_stack_queue.thuc_hanh.my_generic_stack;

public class GenericStackClient {
    private static void stackOfIStrings() {
        MyGenericStack<String> stack = new MyGenericStack();
        stack.push("Five");
        stack.push("Four");
        stack.push("Three");
        stack.push("Two");
        stack.push("One");
        System.out.println("1.1 Kích thước của ngăn xếp sau hoạt động đẩy: " + stack.size());
        System.out.printf("1.2. Các yếu tố pop từ Stack: ");
        while (!stack.isEmpty()) {
            System.out.printf(" %s", stack.pop());
        }
        System.out.println("\n1.3. Kích thước của ngăn xếp sau các hoạt động pop: " + stack.size());
    }
    private static void stackOfIntegers() {
        MyGenericStack<Integer> stack = new MyGenericStack();
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        System.out.println("2.1. Kích thước của ngăn xếp sau hoạt động đẩy: " + stack.size());
        System.out.printf("2.2. Các yếu tố pop từ Stack: ");
        while (!stack.isEmpty()) {
            System.out.printf(" %d", stack.pop());
        }
        System.out.println("\n3.3 Kích thước của ngăn xếp sau các hoạt động pop: " + stack.size());
    }
    public static void main(String[] args) {
        System.out.println("1. Chồng số nguyên");
        stackOfIntegers();
        System.out.println("\n2. Chồng dây");
        stackOfIStrings();
    }
}
