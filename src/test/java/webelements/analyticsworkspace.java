package webelements;

public enum analyticsworkspace {

    DEVELOPEMENTBUTTONLOCATOR("//button[text()='Development']"),
    DATEDISPLAY("//button[@class='current-date-display']"),
    ANALYTICSWORSPACEIFRAME("//iframe[@title='Analytics UI']"),
    TESTASSIGNMENTLINK("//a[text()='Test Assignment']");

    String strlocator;

    private analyticsworkspace(String setstrlocator) {
        this.strlocator = setstrlocator;
    }

    public String getLocator() {
        return strlocator;
    }
}

