package EnumFactory.PartnerPortal;

public enum MerchantDepositPageEnum {

    XPATH_MERCHANT_DEPOSIT_HEADING("//h1[text()='Cash In']");

    private String pageVariables;

    private MerchantDepositPageEnum(String pageVariables) {
        this.pageVariables = pageVariables;
    }

    public String getValue() {
        return this.pageVariables;
    }
}
