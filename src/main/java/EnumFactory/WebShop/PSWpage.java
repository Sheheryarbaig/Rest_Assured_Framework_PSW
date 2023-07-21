package EnumFactory.WebShop;

public enum PSWpage {
    XPATH_SUBSCRIBE("//a[contains(@href,'/app/subscription')] | //a[normalize-space()='Subscribe']"),//div[@id='carouselExampleIndicators1']/div[2]/div/div/div/div/div/div/div[2]/a/button
    XPATH_AGREE("//input[@class='k-checkbox']"),
    XPATH_PROCEED("//button[@type='submit']"),
    XPATH_VALIDATE("//button[@id='sub-info-button-validate']"),
    XPATH_NTN("//input[@id='input-ntn']"),
    XPATH_EMAIL("//input[@id='input-email']"),
    XPATH_NUMBER("//input[@id='input-cell']"),
    XPATH_CNIC("//input[@id='input-cnic']"),
    XPATH_SELECT_NUMBER("//input[@placeholder='Select Network']"),
    XPATH_JAZZ1("//*[@id=\"payment-process\"]/div[2]/form/fieldset/div[2]/div[2]"),
    XPATH_GENERATE_VOUCHER("//button[normalize-space()='Generate Voucher'] | //button[@xpath='1']"),
    XPATH_JAZZ("//*[@id=\"validate-response-container\"]/div[3]/div/div[2]/div[2]/div/span/span/span[2]"),
    XPATH_PAYMENT_SLIP("//*[@id=\"sub-fee-slip-subscriptionFees-data\"]/strong"),
    XPATH_SUBSCRIPTION_FEE("(//*[@id=\"sub-fee-slip-subscriptionFees-data\"])[2]"),
    XPATH_REFRESH("//*[@id=\"validate-response-container\"]/div[2]/div[3]/p[2]"),
    XPATH_APPLICATION_ID("(//*[@id=\"sub-fee-slip-applicationID-data\"])[1]"),
    XPATH_SEND_OTP("//*[@id=\"sub-info-button-sendOTP\"]");
    private String pageVariables;
    private PSWpage(String pageVariables) {

        this.pageVariables = pageVariables;
    }

    public String getValue() {
        return this.pageVariables;
    }

    public String getPageVariables(){return this.pageVariables;}

}
