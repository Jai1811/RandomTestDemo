package webelements;

public enum CommonElements {

    LOADER(".loader");

    String strlocator;

    private CommonElements(String setstrlocator) {
        this.strlocator = setstrlocator;
    }

    public String getLocator() {
        return strlocator;
    }
}
