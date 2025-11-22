package Function;

public class Main {
    public static void main(String[] args) {
        createShoppingMall();
    }

    private static void createShoppingMall() {
        System.out.println("쇼핑몰시스템");
        createUserMgmtModule();
    }

    private static void createUserMgmtModule() {
        System.out.println("고객관리 모듈을 만듭니다.");
        CreateRegisterUserFunction();
    }

    private static void CreateRegisterUserFunction() {
        System.out.println("회원가입기능을 만듭니다.");
    }
}
