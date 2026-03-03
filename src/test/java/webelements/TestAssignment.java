package webelements;

public enum TestAssignment {

    CONTINUEMODULE("//button[contains(text(),'Continue Module')]");

    String strlocator;

    private TestAssignment(String setstrlocator) {
        this.strlocator = setstrlocator;
    }

    public String getLocator() {
        return strlocator;
    }
}

