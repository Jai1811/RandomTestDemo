package webelements;

public enum contentassement {

    RICHTEXTSCROLLABLEELEMENT(".content-scrollable"),
    PROGRESSBARINFO("//gux-tab-panel[not(@hidden)]//div[@class='progress-bar-info']"),
    FILLPERCENTAGE("//gux-tab-panel[not(@hidden)]//wem-game-progress-bar"),
    ENABLEURLRADIOBUTTON("(//button[@class='wem-header'])[1]"),
    NEXTBUTTON("//gux-tab-panel[@id='gux-tab-inform-panel']//div[@class='assignment-viewer-wrapper']//nav[@class='assignment-summary-nav-section']//div[@class='assignment-nav-container']//div[@class='progress-bar-container']//div[@class='nav-buttons-container']//div//gux-button[@title='Next'][normalize-space()='Next']");

    String strlocator;
    private contentassement(String setstrlocator) {
        this.strlocator = setstrlocator;
    }

    public String getLocator() {
        return strlocator;
    }
}

