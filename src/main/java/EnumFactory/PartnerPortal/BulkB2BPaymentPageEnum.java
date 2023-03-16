package EnumFactory.PartnerPortal;

public enum BulkB2BPaymentPageEnum {

    XPATH_BULK_B2B_PAYMENT_HEADING("//h1[text()='Upload Batch']"),
    XPATH_FILE_UPLOAD_FIELD("//input[@id='input-file-id']"),
    XPATH_FROM_ACCOUNT_FIELD("//mat-select[@id='fromAccount']"),
    XPATH_FROM_ACCOUNT_OPTION_START("//mat-option//span[contains(text(),'"),
    XPATH_FROM_ACCOUNT_OPTION_END("')]"),
    XPATH_TITLE_FIELD("//input[@id='title']"),
    XPATH_SUBMIT_BUTTON("//button[@id='submit']"),
    XPATH_REQUEST_SUCCESS_HEADING("//h1[text()='Request created Successfully']");

    private String pageVariables;

    private BulkB2BPaymentPageEnum(String pageVariables) {
        this.pageVariables = pageVariables;
    }

    public String getValue() {
        return this.pageVariables;
    }
}
