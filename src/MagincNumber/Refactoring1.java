package MagincNumber;

public class Refactoring1 {
    public static final int MIN_NICKNAME_LENGTH = 3;
    public static final int MAX_NICKNAME_LENGTH = 20;

    public static void main(String[] args) {
        String nickName = "TodayCoding";
        if(isValidNickName(nickName)) {
            System.out.println("사용가능한 닉네임");
        }
        else {
            System.out.println("사용할수없습니다.");
        }
    }

    private static boolean isValidNickName(String nickName) {
        if(nickName.length() <= MIN_NICKNAME_LENGTH && nickName.length() >= MAX_NICKNAME_LENGTH) {
            return true;
        }
        else {
            return false;
        }
    }

}

