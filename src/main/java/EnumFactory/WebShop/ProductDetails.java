package EnumFactory.WebShop;

public enum ProductDetails {
    XPATH_PRODUCT_SPECIFICATION_HEADING("//div[@class='product_specification_table']//h2"),
    XPATH_QUANTITY_BOX_LABEL("//label[@class='ms-buybox__product-quantity-label']/div"),
    XPATH_QUANTITY_BOX("//input[@class='quantity-input']"),
    XPATH_MIN_QUANTITY_MESSAGE("//div[@class='quantity_text_message']//p]"),
    XPATH_MAX_QUANTITY_MESSAGE("//h5[text()='Alert']//..//following-sibling::div"),
    XPATH_CLOSE_ALERT("//h5[text()='Alert']//..//button[@class='msc-modal__close-button']"),
    XPATH_ADD_TO_CART_BUTTON("//div[contains(@class,'product-add-to-cart')]//button[contains(@title,'ADD TO CART')]"),
    XPATH_VIEW_CART_CHECKOUT("//a[contains(@class,'msc-add-to-cart__dialog__go-to-cart msc-btn')]");

    private String pageVariables;

    private ProductDetails(String pageVariables) {

        this.pageVariables = pageVariables;
    }

    public String getValue() {
        return this.pageVariables;
    }

    public String getPageVariables(){return this.pageVariables;}
}
