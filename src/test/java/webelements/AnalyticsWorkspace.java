package webelements;

public enum AnalyticsWorkspace {

    DEVELOPEMENTBUTTONLOCATOR("//button[text()='Development']"),
    DATEDISPLAY("//button[@class='current-date-display']"),
    ANALYTICSWORSPACEIFRAME("//iframe[@title='Analytics UI']"),
    TESTASSIGNMENTLINK("//a[text()='Test Assignment']");

    String strlocator;

    private AnalyticsWorkspace(String setstrlocator) {
        this.strlocator = setstrlocator;
    }

    public String getLocator() {
        return strlocator;
    }
}

