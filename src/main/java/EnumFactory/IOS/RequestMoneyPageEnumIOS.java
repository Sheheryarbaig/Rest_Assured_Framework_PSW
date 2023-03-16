package EnumFactory.IOS;

public enum RequestMoneyPageEnumIOS {

    XPATH_MSISDN_FIELD("//XCUIElementTypeTextField[@value='+971 xx xxx xx']"),
    XPATH_NEXT_BUTTON("//XCUIElementTypeStaticText[@value='Next']"),
    XPATH_AMOUNT_FIELD("//XCUIElementTypeTextField[@value='How much?']"),
    XPATH_REQUEST_FROM_QR_CODE_BUTTON("//XCUIElementTypeButton[@name='Request from QR code']"),
    XPATH_QR_CODE("//XCUIElementTypeStaticText[@name='Be sure the sender is able to scan this code.']//following-sibling::XCUIElementTypeImage"),
    XPATH_REQUESTED_MONEY("//XCUIElementTypeStaticText[@value='Request']//following-sibling::XCUIElementTypeStaticText");

    private String pageVariables;

    private RequestMoneyPageEnumIOS(String pageVariables) {
        this.pageVariables = pageVariables;
    }

    public String getValue() {
        return this.pageVariables;
    }
}
