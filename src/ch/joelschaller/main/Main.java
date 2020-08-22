package ch.joelschaller.main;

import ch.joelschaller.windows.loginWindow.LoginWindow;

public class Main {

    public static void main(String[] args) {
        LoginWindow loginWindow = new LoginWindow("test");
        loginWindow.show();
    }
}
