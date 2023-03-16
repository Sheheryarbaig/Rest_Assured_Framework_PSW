package EnumFactory.PartnerPortal;

public enum BalanceInquiryPageEnum {

    XPATH_BALANCE_INQUIRY_HEADING("//h1[text()='Balance Inquiry']");

    private String pageVariables;

    private BalanceInquiryPageEnum(String pageVariables) {
        this.pageVariables = pageVariables;
    }

    public String getValue() {
        return this.pageVariables;
    }
}
