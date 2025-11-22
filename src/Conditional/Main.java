package Conditional;

public class Main {
    public static void main(String[] args) {
        Soldier soldier = new Soldier(1, 180, 2, new Eyesight(1.0, 1.0), false);
        //복잡한 조건문은 별도 함수로 관리하여 가독성 향상, 의미전달 명확
        if(soldier.isEligibleForMilitaryPolice()) {
            System.out.println("헌병지원가능");
        }
        else {
            System.out.println("헌병지원불가능");
        }
    }
}
