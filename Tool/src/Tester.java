public class Tester {
    public static void main(String[] args) {
        Tool tool = new Tool();
        System.out.println("Before parsing: ");
        tool.inputString();
        System.out.println("After parsing: ");
        int result = tool.parseStringToInteger();
        System.out.println("The number is: " + result);
    }
}
