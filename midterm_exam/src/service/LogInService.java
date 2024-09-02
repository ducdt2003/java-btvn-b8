package service;


import entities.LogIn;
import utils.AccountManager;
import view.LoginMenu;


import java.util.ArrayList;
import java.util.Scanner;

public class LogInService {
    private static String userName;
    private static String passWord;

    public LogIn inputLogin(Scanner sc){
            System.out.println("Nhập tài khoản của bạn ");
            userName = sc.nextLine();
            System.out.println("Nhập mật khẩu của bạn ");
            passWord = sc.nextLine();
            checkLogin(sc);
            return new LogIn(userName, passWord);
    }

    public void checkLogin(Scanner sc){
        do {
            if (userName.equals(AccountManager.getUSERNAME()) && passWord.equals(AccountManager.getPASSWORD())){
                System.out.println("Chào mừng --> " + AccountManager.getUSERNAME() + " <-- đã đăng nhập thành công");
                System.exit(0);
            }else if (!userName.equals(AccountManager.getUSERNAME())){
                System.out.println("Kiểm tra lại username! hãy nhập lại ");
                inputLogin(sc);
            } else {
                LoginMenu loginMenu = new LoginMenu();
                loginMenu.selectPassWordMenu(sc);
            }
        }while (true);
    }

    public void forgotPassword(Scanner sc) {
        do {
            System.out.print("Nhập email đã liên kết với tài khoản: ");
            String email = sc.nextLine();
            if (email.equals(AccountManager.getEMAIL())) {
                System.out.print("Email chính xác! Mời bạn nhập mật khẩu mới: ");
                passWord = sc.nextLine();
                AccountManager.PASSWORD = passWord;
                System.out.println("Mật khẩu đã được cập nhật. Vui lòng đăng nhập lại.");
                inputLogin(sc);
                checkLogin(sc);
                break;
            } else {
                System.out.println("Email chưa được liên kết với tài khoản nào! Vui lòng thử lại.");
            }
        } while (true);
    }


}
