package EnumFactory.PartnerPortal;

public enum ConfirmCashOutPageEnum {

    XPATH_CONFIRM_CASH_OUT_HEADING("//h1[text()='Confirm CashOut']");

    private String pageVariables;

    private ConfirmCashOutPageEnum(String pageVariables) {
        this.pageVariables = pageVariables;
    }

    public String getValue() {
        return this.pageVariables;
    }
}
