package service;

import entities.Register;
import utils.AccountManager;

import java.util.Scanner;
import java.util.regex.Pattern;

public class RegisterService {
    private static String userName;
    private static String passWord;
    private static String email;
    public Register innputRegister(Scanner sc){
        System.out.println("---Tạo Tài Khoản---");
        System.out.print("Nhập userName: ");
        inputUserName(sc);
        System.out.print("Nhập email: ");
        inputEmail(sc);
        System.out.print("Nhập passWord: ");
        inputPassWord(sc);
        return new Register(userName, passWord, email);
    }

    public void inputUserName(Scanner sc){
        do {
            userName = sc.nextLine();
            if(userName.equals(AccountManager.getUSERNAME())){
                System.out.print("Tài khoản đã tồn tại! Hãy chọn tên tài khoản khác");
                System.out.print("\nNhập userName:");
            }else {
                System.out.println("Tài khoản hợp lệ! Tiếp Tục Nhập Email");
                break;
            }
        }while (true);
    }

    public void inputEmail(Scanner sc){
        Pattern pattern = Pattern.compile("^[a-z0-9]+@[a-z]{5}.[a-z]{3}$");
        do {
            email = sc.nextLine();
            if (pattern.matcher(email).find()){
                if (email.equals(AccountManager.getEMAIL())){
                    System.out.println("Email này đã được đăng ký từ trước rồi! Nhập email khác");
                    System.out.print("Nhập email: ");
                }else {
                    System.out.println("Email Hợp Lệ! Tiếp Tục Nhập PassWord");
                    break;
                }
            }else {
                System.out.println("Lỗi khi đặt tên email");
                System.out.print("Nhập lại email đúng quy tắc (---@gmail.com): ");
            }

        }while (true);
    }

    public void inputPassWord(Scanner sc){
        Pattern pattern = Pattern.compile("^(.*[A-Z])([a-z0-9]){7,15}$");
        do {
            passWord = sc.nextLine();
            if(pattern.matcher(passWord).find()){
                System.out.println("Đăng ký hoàn tất");
                break;
            }else {
                System.out.print("Mật khẩu phải từ 7 đến 15 ký tự và chữ cái đầu tiền viết hoa");
                System.out.println("\nNhập Lại: ");
            }
        }while (true);
    }


}
