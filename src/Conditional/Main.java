package Conditional;

public class Main {
    public static void main(String[] args) {
        Soldier soldier = new Soldier(1, 180, 2, new EyeSight(1.0, 1.0), false);
        if(soldier.isEligibleForMilitaryPolice()) {
            System.out.println("헌병 지원가능");
        }
        else {
            System.out.println("헌병 지원불가능");
        }
    }
}
