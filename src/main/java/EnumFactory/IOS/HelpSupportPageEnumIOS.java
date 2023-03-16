package EnumFactory.IOS;

public enum HelpSupportPageEnumIOS {

    XPATH_FAQS_OPTION_START("//XCUIElementTypeStaticText[@value='"),
    XPATH_FAQS_OPTION_END("']"),
    XPATH_FAQ_HEADING_START("//XCUIElementTypeStaticText[@value='"),
    XPATH_FAQ_HEADING_END("']");

    private String pageVariables;

    private HelpSupportPageEnumIOS(String pageVariables) {
        this.pageVariables = pageVariables;
    }

    public String getValue() {
        return this.pageVariables;
    }
}
