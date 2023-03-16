package EnumFactory.IOS;

public enum ManageMoneyPageEnumIOS {

    XPATH_BANK_NAME_FIELD("//XCUIElementTypeTextField[@value='Bank Name']"),
    XPATH_PIN_FIELD("//XCUIElementTypeSecureTextField[@value='Enter your PIN']"),
    XPATH_IBAN_FIELD("//XCUIElementTypeTextField[@value='IBAN']"),
    XPATH_BENEFICIARY_FIELD("//XCUIElementTypeTextField[@value='Beneficiary Name (Acc. Owner)']"),
    XPATH_ALIAS_FIELD("//XCUIElementTypeTextField[@value='Alias']"),
    XPATH_LINK_BANK_ACCOUNT_BUTTON("//XCUIElementTypeButton[@name='Link bank account']"),
    XPATH_CARD_NUMBER_FIELD("//XCUIElementTypeTextField[@value='0000 0000 0000 0000']"),
    XPATH_EXPIRY_DATE_FIELD_START("//XCUIElementTypeTextField[@value='"),
    XPATH_EXPIRY_DATE_FIELD_END("']"),
    XPATH_EXPIRY_YEAR_FIELD("//XCUIElementTypeTextField[@value='22']"),
    XPATH_CVV_NUMBER_FIELD("//XCUIElementTypeTextField[@value='...']"),
    XPATH_VERIFY_CARD_BUTTON("//XCUIElementTypeButton[@name='Verify Card']"),
    XPATH_CONFIRM_BUTTON("//XCUIElementTypeButton[@name='Confirm']");

    private String pageVariables;

    private ManageMoneyPageEnumIOS(String pageVariables) {
        this.pageVariables = pageVariables;
    }

    public String getValue() {
        return this.pageVariables;
    }
}
