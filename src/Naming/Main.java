package Naming;

public class Main {

    static int[][] map = new int[10][10];

    public static void main(String[] args) {
        map[1][0] = 1;
        User user = new User("하루코딩", "jk5020.kim@naver.com", 40, new GetPosition(0, 0));
        userPosition(user, 1);
        userPosition(user, 0);
        userPosition(user, 1);
    }

    static void userPosition(User user, int v) {
        int x = 0, y = 1;
        if(v == 0) {
            x = 1;
            y = 0;
        }

        if(map[user.userPosition.Y() + y][user.userPosition.X() + x] == 1) {
            System.out.println("돌이 있는곳입니다. 현재위치 유지.");
        }
        else {
            int m_x = user.userPosition.X() + x;
            int m_y = user.userPosition.Y() + y;

            System.out.println("[" + m_y + ", " + m_x + "]로 이동합니다.");
            user.userPosition.setX(m_x);
            user.userPosition.setY(m_y);
        }
    }
}
