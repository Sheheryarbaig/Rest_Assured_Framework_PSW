package EnumFactory.WebShop;

public enum OrderConfirmation {
    XPATH_ORDER_REQUEST_DETAILS("//h2[contains(@class,'ms-order-confirmation__heading')]"),
    XPATH_ORDER_REQUEST_ID("//span[contains(@class,'order-request-details-ID')]");
    private String pageVariables;
    private OrderConfirmation(String pageVariables) {

        this.pageVariables = pageVariables;
    }

    public String getValue() {
        return this.pageVariables;
    }

    public String getPageVariables(){return this.pageVariables;}
}
