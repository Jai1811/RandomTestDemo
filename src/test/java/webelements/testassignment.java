package webelements;

public enum testassignment {

    CONTINUEMODULE("//button[contains(text(),'Continue Module')]");

    String strlocator;

    private testassignment(String setstrlocator) {
        this.strlocator = setstrlocator;
    }

    public String getLocator() {
        return strlocator;
    }
}

