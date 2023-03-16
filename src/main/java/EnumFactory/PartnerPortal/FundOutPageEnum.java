package EnumFactory.PartnerPortal;

public enum FundOutPageEnum {

    XPATH_FUND_OUT_HEADING("//h1[text()='Transfer funds to Linked Bank Account']");

    private String pageVariables;

    private FundOutPageEnum(String pageVariables) {
        this.pageVariables = pageVariables;
    }

    public String getValue() {
        return this.pageVariables;
    }
}
