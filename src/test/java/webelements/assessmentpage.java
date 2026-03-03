package webelements;

public enum assessmentpage {

    ASSESSMENTBUILDERIFRAME("//iframe[@id='assessment-builder']"),
    RAINBOWQUESTIONCORRECTANSWER("//input[@id='a4f8e098-b67c-404f-892a-38b038330e39']"),
    VIDEOGAMEANSWER("//input[@id='a25d4c1e-a6f8-414e-b70a-f7b10dff9e51']"),
    WHOTEXTANSWER("//textarea[@placeholder='Add Response']"),
    CLEARRAINBOWQUESTIONANSWER("(//gux-icon[@icon-name='close'])[1]"),
    CLEARANSWERS("//gux-icon[@icon-name='close']"),
    GROUP2TAB("(//button[@class='wem-header'])[2]"),
    SUNRISEQUESTIONCORRECTANSWER("//input[@id='df820bf9-530a-4225-a5c8-a7e922d21143']")
    ;

    String strlocator;

    private assessmentpage(String setstrlocator) {
        this.strlocator = setstrlocator;
    }

    public String getLocator() {
        return strlocator;
    }
}

