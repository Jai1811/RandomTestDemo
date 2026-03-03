package webelements;

public enum homepage {

    MENUBUTTONLOCATOR("//button[@id='navigation-menu']"),
    ANALYTICSBUTTONLOCATOR("//button[@id='navBar.commandView.analytics.title']"),
    ANALYTICSWORKSPACEBUTTONLOCATOR("//a[@id='navBar.commandView.analytics.subMenu.analyticsWorkspace']");

    String strlocator;

    private homepage(String setstrlocator) {
        this.strlocator = setstrlocator;
    }

    public String getLocator() {
        return strlocator;
    }
}

