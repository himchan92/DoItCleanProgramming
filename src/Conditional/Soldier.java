package Conditional;

public class Soldier {
    int num;
    int height;
    int physicalLevel;
    EyeSight eyeSight;
    boolean isHeartDisease;

    public Soldier(int num, int height, int physicalLevel, EyeSight eyeSight, boolean isHeartDisease) {
        this.num = num;
        this.height = height;
        this.physicalLevel = physicalLevel;
        this.eyeSight = eyeSight;
        this.isHeartDisease = isHeartDisease;
    }

    boolean isEligibleForMilitaryPolice() {
        if(height >= 180 && physicalLevel <= 2 && eyeSight.eyesight_left >= 1.0 && eyeSight.eyesight_right >= 1.0 && !isHeartDisease) {
            return true;
        }
        else {
            return false;
        }
    }
}
