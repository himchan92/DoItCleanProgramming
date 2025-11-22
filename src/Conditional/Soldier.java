package Conditional;

public class Soldier {
    int num;
    int height;
    int physicalLevel;
    Eyesight eyesight;
    boolean isHeartDisease;

    public Soldier(int num, int height, int physicalLevel, Eyesight eyesight, boolean isHeartDisease) {
        this.num = num;
        this.height = height;
        this.physicalLevel = physicalLevel;
        this.eyesight = eyesight;
        this.isHeartDisease = isHeartDisease;
    }

    boolean isEligibleForMilitaryPolice() {
        if(height >= 180 && physicalLevel <= 2 && eyesight.left >= 1.0 && eyesight.right >= 1.0 && !isHeartDisease) {
            return true;
        }
        else {
            return false;
        }
    }
}