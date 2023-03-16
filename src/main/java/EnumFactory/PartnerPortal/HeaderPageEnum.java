package EnumFactory.PartnerPortal;

public enum HeaderPageEnum {

    XPATH_LOG_OUT_BUTTON("//a[text()='Log Out ']");

    private String pageVariables;

    private HeaderPageEnum(String pageVariables) {
        this.pageVariables = pageVariables;
    }

    public String getValue() {
        return this.pageVariables;
    }
}
