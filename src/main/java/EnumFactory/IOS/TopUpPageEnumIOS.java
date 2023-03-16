package EnumFactory.IOS;

public enum TopUpPageEnumIOS {

    XPATH_NAVIGATION_OPTION_START("//XCUIElementTypeStaticText[@value='"),
    XPATH_NAVIGATION_OPTION_END("']"),
    XPATH_MSISDN_FIELD("//XCUIElementTypeTextField[contains(@value,'+971')]"),
    XPATH_AMOUNT_TO_BE_DEDUCTED("//XCUIElementTypeStaticText[@value='TOTAL TO BE DEDUCTED']/following-sibling::XCUIElementTypeStaticText[contains(@value,'AED')]"),
    XPATH_PROCEED_BUTTON("//XCUIElementTypeButton[@name='Proceed']"),
    XPATH_PIN_FIELD("//XCUIElementTypeSecureTextField[@value='Enter your PIN']"),
    XPATH_CONFIRM_BUTTON("//XCUIElementTypeButton[@name='Confirm']"),
    XPATH_ADD_ACCOUNT_BUTTON("//XCUIElementTypeButton[@name='Add account']"),
    XPATH_PRE_DEFINE_AMOUNT_FIELD_START("//XCUIElementTypeStaticText[@name='"),
    XPATH_PRE_DEFINE_AMOUNT_FIELD_END("']"),
    XPATH_NAME_FIELD("//XCUIElementTypeTextField[@value='Name/nickname']"),
    XPATH_PAYMENT_METHOD_BALANCE("//XCUIElementTypeStaticText[@value='e& money']/following-sibling::XCUIElementTypeStaticText[contains(@value,'.')]"),;

    private String pageVariables;

    private TopUpPageEnumIOS(String pageVariables) {
        this.pageVariables = pageVariables;
    }

    public String getValue() {
        return this.pageVariables;
    }
}
