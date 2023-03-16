package EnumFactory.PartnerPortal;

public enum TransactionHistoryPageEnum {

    XPATH_TRANSACTION_HISTORY_HEADING("//h1[text()='Transaction history']"),
    XPATH_FIELD_START("//label[text()='"),
    XPATH_FIELD_END("']/parent::span/preceding-sibling::input"),
    XPATH_DROPDOWN_FIELD_START("//span[text()='"),
    XPATH_DROPDOWN_FIELD_END("']/ancestor::mat-select"),
    XPATH_DROPDOWN_VALUE_START("//mat-option//span[contains(text(),'"),
    XPATH_DROPDOWN_VALUE_END("')]"),
    XPATH_SEARCH_BUTTON("//button/span[text()='Search']"),
    XPATH_RESET_BUTTON("//button/span[text()='Reset']"),
    XPATH_LOADER_DIV("//div[@id='loaderM']"),
    XPATH_TRANSACTION_DATE_RECORD("//tbody//td[3]"),
    XPATH_STATUS_RECORD("//tbody//td[4]"),
    XPATH_TRANSACTION_ID_RECORD("//tbody//td[1]"),
    XPATH_TO_ACCOUNT_RECORD("//tbody//td[8]"),
    XPATH_FROM_ACCOUNT_RECORD("//tbody//td[6]");

    private String pageVariables;

    private TransactionHistoryPageEnum(String pageVariables) {
        this.pageVariables = pageVariables;
    }

    public String getValue() {
        return this.pageVariables;
    }
}
