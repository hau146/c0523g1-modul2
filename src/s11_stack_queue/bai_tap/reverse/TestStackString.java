package s11_stack_queue.bai_tap.reverse;

public class TestStackString {
    private static String name = "codegym";

    public static void main(String[] args) {
        StackString string = new StackString();
        String[] str = name.split("");
        string.push(str);
        System.out.println("Mảng trước khi đảo ngược");
        string.pop(str);
        System.out.println(string.reverse(str));
        System.out.println("Mảng sau khi đảo ngược");
    }
}
