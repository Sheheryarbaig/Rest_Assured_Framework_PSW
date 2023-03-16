package EnumFactory.IOS;

public enum PayBillsPageEnumIOS {

    XPATH_NAVIGATION_OPTION_START("//XCUIElementTypeStaticText[@value='"),
    XPATH_NAVIGATION_OPTION_END("']"),
    XPATH_ACCOUNT_NUMBER_FIELD("//XCUIElementTypeTextField[@value='Account Number']"),
    XPATH_AMOUNT_TO_BE_DEDUCTED("//XCUIElementTypeStaticText[@value='TOTAL TO BE DEDUCTED']/following-sibling::XCUIElementTypeStaticText[contains(@value,'AED')]"),
    XPATH_PROCEED_BUTTON("//XCUIElementTypeButton[@name='Proceed']"),
    XPATH_PIN_FIELD("//XCUIElementTypeSecureTextField[@value='Enter your PIN']"),
    XPATH_CONFIRM_BUTTON("//XCUIElementTypeButton[@name='Confirm']"),
    XPATH_ADD_ACCOUNT_BUTTON("//XCUIElementTypeButton[@name='Add account']"),
    XPATH_AMOUNT_FIELD("//XCUIElementTypeTextField"),
    XPATH_NAME_FIELD("//XCUIElementTypeTextField[@value='Name/nickname']"),
    XPATH_EDIT_AMOUNT_BUTTON("//XCUIElementTypeButton[@name='ic Edit']"),
    XPATH_PAY_A_NEW_ACCOUNT_BUTTON("//XCUIElementTypeButton[@name='ic Edit']"),
    XPATH_PAYMENT_METHOD_BALANCE("//XCUIElementTypeStaticText[@value='e& money']/following-sibling::XCUIElementTypeStaticText[contains(@value,'.')]"),;

    private String pageVariables;

    private PayBillsPageEnumIOS(String pageVariables) {
        this.pageVariables = pageVariables;
    }

    public String getValue() {
        return this.pageVariables;
    }
}
