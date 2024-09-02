import entities.BaseEntities;
import entities.LogIn;
import entities.Register;
import service.BaseEntitiesService;
import service.LogInService;
import service.RegisterService;
import view.LoginMenu;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LoginMenu loginMenu = new LoginMenu();
        loginMenu.selectDisplayMenu(sc);
    }
}
