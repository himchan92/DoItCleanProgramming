package Naming;

public class Calculator { //명사 or 명사구 권장
    public static void main(String[] args) {
        int operand1 = 1;
        int operand2 = 2;
        System.out.println("sum : " + addNumbers(operand1, operand2));
    }

    //동작역할이니 동사 or 동사구 권장
    static public int addNumbers(int operand1, int operand2) {
        return operand1 + operand2;
    }
}
