package view;

import entities.LogIn;
import service.LogInService;
import service.RegisterService;

import java.util.ArrayList;
import java.util.Scanner;

public class LoginMenu {
    public void displayMenu(Scanner sc){
        System.out.println("Hãy chọn 1 trong 2");
        System.out.println("1. Đăng nhập");
        System.out.println("2. Đăng ký");
        System.out.println("Hãy lựa chọn chức năng");
    }

    public void selectDisplayMenu(Scanner sc){

        displayMenu(sc);
        int choice = Integer.parseInt(sc.nextLine());
        switch (choice){
            case 1:
                LogInService logInService = new LogInService();
                logInService.inputLogin(sc);
                break;
            case 2:
                RegisterService registerService = new RegisterService();
                registerService.innputRegister(sc);
                break;
            default:
                System.out.println("Lỗi đăng nhập");
        }
    }


    public void inputpasswordMenu(Scanner sc){
        System.out.println("---Sai Mật Khẩu Rồi---");
        System.out.println("1. đăng nhập lại ");
        System.out.println("2. quên mật khẩu");
        System.out.println("0. thoát! sau nhớ nhập lại nak");
        System.out.println(" hãy chọn cái bạn muốn ");

    }
    public void selectPassWordMenu(Scanner sc){
        inputpasswordMenu(sc);
        int choice = Integer.parseInt(sc.nextLine());
        LogInService logInService = new LogInService();
        ArrayList<LogIn> log = new ArrayList<>();
        switch (choice){
            case 1:
                logInService.inputLogin(sc);
                break;
            case 2:
                logInService.forgotPassword(sc);
                break;
            case 0:
                System.out.println("Thoát chương trình!");
                System.exit(0);
            default:
                System.out.println("Lỗi đăng nhập");
        }
    }
}
