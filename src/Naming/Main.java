package Naming;

public class Main {
    //상수로 설정함으로써 의미를 명확히 알수있음
    static final int MOVE_DOWN = 1;
    static final int STONE_EXIST = 1;
    static final int MOVE_RIGHT = 0;
    static int[][] map = new int[10][10]; //10도 상수화 권장한다 -> 수정발생시 일일이 해줘야하니 상수선언해서 해당것만 수정하면되니 좋음

    public static void main(String[] args) {
        map[1][0] = STONE_EXIST;
        User user = new User("하루코딩", "jk5020.kim@naver.com", 40, new Position(0, 0));
        moveUser(user, MOVE_DOWN);
        moveUser(user, MOVE_RIGHT);
        moveUser(user, MOVE_DOWN);
    }

    //함수명을 통해 무슨역할인지 알수있음
    static void moveUser(User user, int direction) {
        int move_x = 0;
        int move_y = 1;
        if(direction == MOVE_RIGHT) {
            move_x = 1;
            move_y = 0;
        }

        int next_position_x = user.position.getX() + move_x;
        int next_position_y = user.position.getY() + move_y;

        //상수명을 통해 이동의미를 알수 있음
        if(map[next_position_y][next_position_x] == STONE_EXIST) {
            System.out.println("돌이 있는 곳입니다. 현재 위치를 유지합니다.");
        }
        else {
            System.out.println("[" + next_position_y + ", " + next_position_x + "]로 이동합니다.");
            user.position.setX(next_position_x);
            user.position.setY(next_position_y);
        }
    }
}
