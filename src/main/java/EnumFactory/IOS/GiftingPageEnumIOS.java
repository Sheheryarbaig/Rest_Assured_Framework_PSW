package EnumFactory.IOS;

public enum GiftingPageEnumIOS {

    XPATH_NAVIGATION_OPTION_START("//XCUIElementTypeStaticText[@value='"),
    XPATH_NAVIGATION_OPTION_END("']"),
    XPATH_MSISDN_FIELD("//XCUIElementTypeTextField[contains(@value,'+971')]"),
    XPATH_AMOUNT_FIELD("//XCUIElementTypeTextField[@value='0.00']"),
    XPATH_AMOUNT_TO_BE_DEDUCTED("//XCUIElementTypeStaticText[@value='TOTAL TO BE DEDUCTED']/following-sibling::XCUIElementTypeStaticText[contains(@value,'.')]"),
    XPATH_PROCEED_BUTTON("//XCUIElementTypeButton[@name='Proceed']"),
    XPATH_PAYMENT_METHOD_BALANCE("//XCUIElementTypeStaticText[@value='e& money']/following-sibling::XCUIElementTypeStaticText[contains(@value,'.')]"),
    XPATH_PIN_FIELD("//XCUIElementTypeSecureTextField[@value='Enter your PIN']"),
    XPATH_LOGIN_PROCEED_BUTTON("//XCUIElementTypeButton[@name='Confirm']"),
    XPATH_ALLOW_BUTTON("//XCUIElementTypeButton[@name='Allow' or @name='Allow While Using App' or @name='OK']"),
    XPATH_ADD_MONEY_BUTTON("//XCUIElementTypeButton[@name='Add money']"),
    XPATH_VOUCHER_AMOUNT_START("//XCUIElementTypeStaticText[@value='"),
    XPATH_VOUCHER_AMOUNT_END("']/preceding-sibling::XCUIElementTypeStaticText[contains(@value,'AED')]"),
    XPATH_VOUCHER_OPTION_START("//XCUIElementTypeStaticText[@value='"),
    XPATH_VOUCHER_OPTION_END("']"),
    XPATH_GIFTING_HEADING_MSG("//XCUIElementTypeStaticText[@value='Which service would you like to gift?']"),
    XPATH_BILLERS_PRICES("//XCUIElementTypeStaticText[starts-with(@value,'AED')]"),
    XPATH_AVAILABLE_BALANCE("//XCUIElementTypeStaticText[contains(@value,'Your e& money balance is')]");

    private String pageVariables;

    private GiftingPageEnumIOS(String pageVariables) {
        this.pageVariables = pageVariables;
    }

    public String getValue() {
        return this.pageVariables;
    }
}
