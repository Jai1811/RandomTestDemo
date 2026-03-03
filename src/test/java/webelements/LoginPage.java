package webelements;

public enum LoginPage {

    USERNAMELOCATOR("//input[@id='email']"),
    PASSWORDLOCATOR("//input[@id='password']"),
    LOGINBUTTON("//button[@title='Log In']");

    String strlocator;

    private LoginPage(String setstrlocator) {
        this.strlocator = setstrlocator;
    }

    public String getLocator() {
        return strlocator;
    }
}

