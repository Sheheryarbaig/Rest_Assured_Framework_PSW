package EnumFactory.IOS;

public enum DirectPayPageEnumIOS {

    XPATH_ADD_ACCOUNT_BUTTON("//XCUIElementTypeButton[@name='Add account']"),
    XPATH_ADD_NEW_ACCOUNT_BUTTON("//XCUIElementTypeButton[@name='iOS buttons add']"),
    XPATH_MSISDN_FIELD("//XCUIElementTypeTextField[@value='+971 xx xxx xx']"),
    XPATH_ACCOUNT_NAME_START("//XCUIElementTypeStaticText[@label='"),
    XPATH_ACCOUNT_NAME_END("']"),
    XPATH_ACCOUNT_NUMBER_START("//XCUIElementTypeStaticText[@label='+971 "),
    XPATH_ACCOUNT_NUMBER_END("']"),
    XPATH_ACCOUNT_START("//XCUIElementTypeStaticText[@label='"),
    XPATH_ACCOUNT_END("']"),
    XPATH_SAVED_ACCOUNT_START("(//XCUIElementTypeStaticText[not(@value='"),
    XPATH_SAVED_ACCOUNT_END("') and contains(@value,'+971 54')])[1]"),
    XPATH_DELETE_BUTTON("//XCUIElementTypeStaticText[@label=' Delete']"),
    XPATH_CONFIRM_BUTTON("//XCUIElementTypeButton[@name='Confirm']"),
    XPATH_PIN_FIELD("//XCUIElementTypeSecureTextField[@value='Enter your PIN']"),
    XPATH_AMOUNT_FIELD("//XCUIElementTypeTextField[@value='How much?']"),
    XPATH_AMOUNT_TO_BE_DEDUCTED("//XCUIElementTypeStaticText[@value='TOTAL TO BE DEDUCTED']/following-sibling::XCUIElementTypeStaticText[contains(@value,'.')]"),
    XPATH_PROCEED_BUTTON("//XCUIElementTypeButton[@name='Proceed']"),
    XPATH_LOGIN_PROCEED_BUTTON("//XCUIElementTypeButton[@name='Proceed']"),
    XPATH_ADD_MONEY_BUTTON("//XCUIElementTypeButton[@name='Add money']"),
    XPATH_TAG_FIELD("//XCUIElementTypeTextField[@value='Tag']/parent::XCUIElementTypeOther/parent::XCUIElementTypeOther/preceding-sibling::XCUIElementTypeButton"),
    XPATH_TAG_VALUE_START("//XCUIElementTypeButton[@name='Add money']"),
    XPATH_TAG_VALUE_END("//XCUIElementTypeButton[@name='Add money']"),
    XPATH_NAME_FIELD("//XCUIElementTypeTextField[@value='Name/nickname']");

    private String pageVariables;

    private DirectPayPageEnumIOS(String pageVariables) {
        this.pageVariables = pageVariables;
    }

    public String getValue() {
        return this.pageVariables;
    }
}
