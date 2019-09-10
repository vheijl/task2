public class HelloArgs {
    public static void main(String[] args) {
        String name = args[0];
        char initialChar = args[0].charAt(0);
        System.out.println("Hello " + name + ", your name is " + name.length() + " characters long and starts with a " + initialChar);
    }
}