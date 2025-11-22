package Naming;

public class User {
    String userName;
    String userEmail;
    int userAge;
    GetPosition userPosition; //User 클래스명이 있는데 굳이 user~ 이름붙일필요없다

    public User(String userName, String userEmail, int userAge, GetPosition userPosition) {
        this.userName = userName;
        this.userEmail = userEmail;
        this.userAge = userAge;
        this.userPosition = userPosition;
    }
}
