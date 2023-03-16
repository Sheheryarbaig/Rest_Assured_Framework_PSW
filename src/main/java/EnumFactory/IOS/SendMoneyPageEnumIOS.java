package EnumFactory.IOS;

public enum SendMoneyPageEnumIOS {

    XPATH_NAVIGATION_OPTION_START("//XCUIElementTypeStaticText[@label='"),
    XPATH_NAVIGATION_OPTION_END("']"),
    XPATH_ENTER_ID_LOGO("//XCUIElementTypeImage[@name='enter-pin-qrcode']"),
    XPATH_AGENT_ID_FIELD("//XCUIElementTypeTextField[@value='Enter agent ID']"),
    XPATH_CONFIRM_BUTTON("//XCUIElementTypeStaticText[@value='Confirm']"),
    XPATH_PRE_DEFINE_AMOUNT_FIELD_START("//*[@name='"),
    XPATH_PRE_DEFINE_AMOUNT_FIELD_END("']"),
    XPATH_PIN_FIELD("//XCUIElementTypeSecureTextField[@value='Enter your PIN']"),
    XPATH_AMOUNT_TO_BE_DEDUCTED("//XCUIElementTypeStaticText[@value='TOTAL TO BE DEDUCTED']/following-sibling::XCUIElementTypeStaticText[contains(@value,'AED')]"),
    XPATH_SAVED_BANK_ACCOUNT("//XCUIElementTypeOther/XCUIElementTypeStaticText[contains(@value,'*****')]"),
    XPATH_ADD_MONEY_BUTTON("//XCUIElementTypeButton[@name='Add money']");

    private String pageVariables;

    private SendMoneyPageEnumIOS(String pageVariables) {
        this.pageVariables = pageVariables;
    }

    public String getValue() {
        return this.pageVariables;
    }
}
