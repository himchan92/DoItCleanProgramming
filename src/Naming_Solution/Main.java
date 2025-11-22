package Naming_Solution;

public class Main {
    // 상수 사용하면 변경 시 여기저기 수정안하고 해당부분만 수정하면되니 가독성 향상
    static final int MOVE_DOWN = 1;
    static final int STONE_EXIST = 1;
    static final int MOVE_RIGHT = 0;
    static int[][] map = new int[10][10];

    public static void main(String[] args) {
        map[1][0] = STONE_EXIST;
        User user = new User("하루코딩", "jk5020.kim@naver.com", 40, new Position(0, 0));
        moveUser(user, MOVE_DOWN);
        moveUser(user, MOVE_RIGHT);
        moveUser(user, MOVE_DOWN);
    }

    static void moveUser(User user, int direction) {
        int move_x = 0, move_y = 1;
        if(direction == MOVE_RIGHT) {
            move_x = 1;
            move_y = 0;
        }

        int next_position_x = user.position.getX() + move_x;
        int next_position_y = user.position.getY() + move_y;

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
