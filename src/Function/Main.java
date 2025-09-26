package Function;

public class Main {
    public static void main(String[] args) {
        createShoppingMall();
    }

    public static void createShoppingMall() {
        System.out.println("쇼핑몰만들기");
        createUserMgmtModule();
        createProductMgmtModule();
        createDeliveryMgmtModule();
    }

    private static void createUserMgmtModule() {
        System.out.println("고객 관리 모듈을 만듭니다.");
        CreateRegisterUserFunction();
        CreateModifyUserFunction();
        CreateDeleteUserFunction();
    }

    private static void CreateRegisterUserFunction() {
        System.out.println("회원가입기능");
    }

    private static void CreateModifyUserFunction() {
        System.out.println("회원정보수정기능");
    }

    private static void CreateDeleteUserFunction() {
        System.out.println("회원 탈퇴기능");
    }

    private static void createProductMgmtModule() {
        System.out.println("상품관리모듈");
    }

    private static void createDeliveryMgmtModule() {
        System.out.println("배송관리모듈");
    }
}
