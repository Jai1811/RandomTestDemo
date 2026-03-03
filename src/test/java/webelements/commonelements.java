package webelements;

public enum commonelements {

    LOADER(".loader");

    String strlocator;

    private commonelements(String setstrlocator) {
        this.strlocator = setstrlocator;
    }

    public String getLocator() {
        return strlocator;
    }
}
