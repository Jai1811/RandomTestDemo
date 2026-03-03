package webelements;

import javax.swing.*;

public enum loginpage {

    USERNAMELOCATOR("//input[@id='email']"),
    PASSWORDLOCATOR("//input[@id='password']"),
    LOGINBUTTON("//button[@title='Log In']");

    String strlocator;

    private loginpage(String setstrlocator) {
        this.strlocator = setstrlocator;
    }

    public String getLocator() {
        return strlocator;
    }
}

