package EnumFactory.WebShop;

public enum CheckOut {

    XPATH_HEADING_CHECKOUT("//h2[contains(@class,'ms-checkout__title')]"),
    XPATH_APPLY_SHIPPING("//button[contains(@title,'Apply & continue')]"),
    XPATH_SHIPPING_CHARGES("//span[contains(@class,'msc-price ms-checkout-delivery-options__price')]//span"),
    XPATH_PLACE_ORDER("//button[contains(@class,'ms-checkout__btn-place-order msc-btn btn-primary')]");
    private String pageVariables;
    private CheckOut(String pageVariables) {

        this.pageVariables = pageVariables;
    }

    public String getValue() {
        return this.pageVariables;
    }

    public String getPageVariables(){return this.pageVariables;}
}
