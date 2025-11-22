package Naming;

public class Calculator {
    public static void main(String[] args) {
        int operand1 = 1;
        int operand2 = 2;
        System.out.println("sum : " + addNumbers(operand1, operand2));
    }

    static public int addNumbers(int operand1, int operand2) {
        return operand1 + operand2;
    }
}
