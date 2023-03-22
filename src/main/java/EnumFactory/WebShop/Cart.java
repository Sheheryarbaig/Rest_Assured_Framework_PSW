package EnumFactory.WebShop;

public enum Cart {
    XPATH_CART_HEADING("//*[@class='heading container-heading']"),
    XPATH_ITEM_QUANTITY("(//input[@class='quantity-input'])[2]"),
    XPATH_INCREASE_QUANTITY("(//*[@class='quantity']//button[@class='increment quantity__controls '])[2]"),
    XPATH_MAX_QUANTITY_MSG("//div[@class='cart-line-error-contianer']"),
    XPATH_ITEM("(//*[@class='msc-cart-line__product-title'])[1]");
    private String pageVariables;

    private Cart(String pageVariables) {

        this.pageVariables = pageVariables;
    }

    public String getValue() {
        return this.pageVariables;
    }

    public String getPageVariables(){return this.pageVariables;}
}
