package s11_stack_queue.bai_tap.stack_reveser;

public class TestStackString {
    private static String name = "hau huu nguyen";

    public static void main(String[] args) {
        StackString wStack = new StackString();
        System.out.println(wStack.push(name));
        System.out.println("trước khi đảo ngược");
        wStack.pop();
        wStack.pop();
        wStack.pop();
        wStack.push("nguyen");
        wStack.push("huu");
        System.out.println(wStack.push("hau"));
        System.out.println("sau khi đảo ngược");
    }
}
