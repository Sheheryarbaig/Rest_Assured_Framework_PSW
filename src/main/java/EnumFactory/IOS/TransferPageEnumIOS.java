package EnumFactory.IOS;

public enum TransferPageEnumIOS {

    XPATH_AMOUNT_FIELD("//XCUIElementTypeStaticText[@name='Enter amount (AED)']/following-sibling::XCUIElementTypeOther//XCUIElementTypeTextField"),
    XPATH_AMOUNT_TO_BE_DEDUCTED("//XCUIElementTypeStaticText[@value='TOTAL TO BE DEDUCTED']/following-sibling::XCUIElementTypeStaticText[contains(@value,'.')]"),
    XPATH_PROCEED_BUTTON("//XCUIElementTypeButton[@name='Proceed']"),
    XPATH_PAYMENT_METHOD_BALANCE("//XCUIElementTypeStaticText[@value='e& money']/following-sibling::XCUIElementTypeStaticText[contains(@value,'.')]"),
    XPATH_PIN_FIELD("//XCUIElementTypeSecureTextField[@value='Enter your PIN']"),
    XPATH_CONFIRM_BUTTON("//XCUIElementTypeButton[@name='Confirm']");

    private String pageVariables;

    private TransferPageEnumIOS(String pageVariables) {
        this.pageVariables = pageVariables;
    }

    public String getValue() {
        return this.pageVariables;
    }
}
