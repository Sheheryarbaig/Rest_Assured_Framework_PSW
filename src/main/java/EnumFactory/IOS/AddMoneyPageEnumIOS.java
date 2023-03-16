package EnumFactory.IOS;

public enum AddMoneyPageEnumIOS {

    XPATH_SAVED_DEBIT_CARD("//XCUIElementTypeStaticText[contains(@value,'*****')]"),
    XPATH_AMOUNT_FIELD("//XCUIElementTypeTextField[@value='How much?']"),
    XPATH_PIN_FIELD("//XCUIElementTypeSecureTextField[@value='Enter your PIN']"),
    XPATH_LOGIN_CONFIRM_BUTTON("//XCUIElementTypeButton[@name='Confirm']"),
    XPATH_PAYMENT_MACHINES_STEPS_TEXT("//XCUIElementTypeImage[@name='payment machines']/following-sibling::XCUIElementTypeStaticText"),
    XPATH_NAVIGATION_OPTION_START("//XCUIElementTypeStaticText[@label='"),
    XPATH_NAVIGATION_OPTION_END("']"),
    XPATH_ADD_MONEY_HEADING("//XCUIElementTypeNavigationBar[@name='etisalatWallet.AddSendMoneyView']//XCUIElementTypeButton[@name='Add money']"),
    XPATH_CONTINUE_BUTTON("//XCUIElementTypeButton[@name='Continue']"),
    XPATH_SUBMIT_BUTTON("//XCUIElementTypeButton[@name='Submit']"),
    XPATH_RADIO_BUTTON("//XCUIElementTypeSwitch"),
    XPATH_GENERATE_HASH_BUTTON("//XCUIElementTypeButton[@name='Generate Hash']"),
    XPATH_RETURN_TO_PG_BUTTON("//XCUIElementTypeButton[@name='Return to PG']"),
    XPATH_RESPONSE_CODE_FIELD("//XCUIElementTypeStaticText[@name='pp_ResponseCode:']/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther/XCUIElementTypeTextField"),
    XPATH_RESPONSE_MESSAGE_FIELD("//XCUIElementTypeStaticText[@name='pp_ResponseMessage:']/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther/XCUIElementTypeTextField"),
    XPATH_AUTH_CODE_FIELD("//XCUIElementTypeStaticText[@name='pp_AuthCode:']/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther/XCUIElementTypeTextField"),
    XPATH_BANK_ID_FIELD("//XCUIElementTypeStaticText[@name='pp_BankID:']/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther/XCUIElementTypeTextField"),
    XPATH_BANK_FIELD("//XCUIElementTypeOther[@value='Select Bank']"),
    XPATH_DROPDOWN_VALUE_START("//XCUIElementTypeButton[@name='"),
    XPATH_DROPDOWN_VALUE_END("']"),
    XPATH_CONFIRM_BUTTON("//XCUIElementTypeButton[@name='Confirm']");

    private String pageVariables;

    private AddMoneyPageEnumIOS(String pageVariables) {
        this.pageVariables = pageVariables;
    }

    public String getValue() {
        return this.pageVariables;
    }
}
