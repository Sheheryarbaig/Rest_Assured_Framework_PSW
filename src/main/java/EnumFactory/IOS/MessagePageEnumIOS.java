package EnumFactory.IOS;

public enum MessagePageEnumIOS {

    XPATH_TO_NUMBER_TEXT("//XCUIElementTypeTextField[@name='To:']"),
    XPATH_MSG_FIELD("//XCUIElementTypeTextField[@name='messageBodyField']");

    private String pageVariables;

    private MessagePageEnumIOS(String pageVariables) {
        this.pageVariables = pageVariables;
    }

    public String getValue() {
        return this.pageVariables;
    }
}
