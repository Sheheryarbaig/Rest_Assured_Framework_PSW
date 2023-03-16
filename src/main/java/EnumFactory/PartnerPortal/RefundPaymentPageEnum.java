package EnumFactory.PartnerPortal;

public enum RefundPaymentPageEnum {

    XPATH_REFUND_PAYMENT_HEADING("//h1[text()='Refund Payment']");

    private String pageVariables;

    private RefundPaymentPageEnum(String pageVariables) {
        this.pageVariables = pageVariables;
    }

    public String getValue() {
        return this.pageVariables;
    }
}
