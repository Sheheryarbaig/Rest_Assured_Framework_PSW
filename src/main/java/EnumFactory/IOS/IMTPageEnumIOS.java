package EnumFactory.IOS;

public enum IMTPageEnumIOS {

    XPATH_COUNTRY_FIELD("//XCUIElementTypeImage[@name='iOS_general icon_chevron down 2pt_grey']"),
    XPATH_DROPDOWN_VALUE_START("//*[@value='"),
    XPATH_DROPDOWN_VALUE_END("']"),
    XPATH_RECEIVER_OPTION_START("//XCUIElementTypeStaticText[@name and @value='"),
    XPATH_RECEIVER_OPTION_END("']"),
    XPATH_UAE_AMOUNT_FIELD("//XCUIElementTypeStaticText[@value='AED']/following-sibling::*//XCUIElementTypeTextField"),
    XPATH_NEXT_BUTTON("//XCUIElementTypeButton[@name='Next']"),
    XPATH_TRANSACTION_FEE("//XCUIElementTypeStaticText[@value='Transaction fee:']/following-sibling::XCUIElementTypeStaticText"),
    XPATH_VAT("//XCUIElementTypeStaticText[@value='VAT:']/following-sibling::XCUIElementTypeStaticText"),
    XPATH_TOTAL_AMOUNT("//XCUIElementTypeStaticText[@value='Total']/following-sibling::XCUIElementTypeStaticText[not(contains(@value,'balance'))]"),
    XPATH_IMT_FIELD_START("//XCUIElementTypeTextField[contains(@value,\""),
    XPATH_IMT_FIELD_END("\")]"),
    XPATH_PIN_FIELD("//XCUIElementTypeSecureTextField[@value='Enter your PIN']"),
    XPATH_CONFIRM_BUTTON("//XCUIElementTypeButton[@name='Confirm']"),
    XPATH_SEND_TO_MYSELF_BUTTON("//XCUIElementTypeStaticText[@value='Send to myself']"),
    XPATH_WAIT_ELEMENT("//XCUIElementTypeStaticText[@value='Select Country']"),
    XPATH_INSUFFICIENT_BALANCE_MSG("//XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeStaticText"),
    XPATH_IMT_DROPDOWN_START("//XCUIElementTypeTextField[@value='"),
    XPATH_IMT_DROPDOWN_END("']/following-sibling::XCUIElementTypeButton");

    private String pageVariables;

    private IMTPageEnumIOS(String pageVariables) {
        this.pageVariables = pageVariables;
    }

    public String getValue() {
        return this.pageVariables;
    }
}
