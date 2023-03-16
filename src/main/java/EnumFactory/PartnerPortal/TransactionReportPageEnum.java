package EnumFactory.PartnerPortal;

public enum TransactionReportPageEnum {

    XPATH_TRANSACTION_REPORT_HEADING("//h1[text()='Transaction Report']");

    private String pageVariables;

    private TransactionReportPageEnum(String pageVariables) {
        this.pageVariables = pageVariables;
    }

    public String getValue() {
        return this.pageVariables;
    }
}
