package EnumFactory.WebShop;

public enum ProductListing {
    XPATH_CATEGORY_NEW("//div[@id='renderPage']//descendant::a[contains(text(),'New')]"),
    XPATH_CATEGORY_SPECIAL_OFFERS("//div[@id='renderPage']//descendant::a[contains(text(),'Special Offers')]"),
    XPATH_CATEGORY_SOLAR_MODULES("//div[@id='renderPage']//descendant::a[contains(text(),'Solar Modules')]"),
    XPATH_SOLAR_MODULE_PRODUCT("//*[(@class='msc-product__title') and contains(text(),'"),
    XPATH_PRODUCT_PRICE("//following::div[@class='msc-price__actual']"),
    XPATH_PRODUCT_IMAGE("//img[contains(@alt,'"),
    XPATH_ADD_TO_CART_BUTTON("//ancestor::li//button[@aria-label='ADD TO CART']"),
    XPATH_QUICK_VIEW("//div[@data-m-t='quickview' and contains(@aria-label,'"),
    XPATH_QUICK_VIEW_CLOSE_ICON("//button[@class='msc-modal__close-button']"),
    XPATH_PRODUCT_CARD("//ancestor::li"),
    XPATH_NAVIGATE_TO_SEARCH_RESULT("//li[@class='ms-product-search-result__item']//a")

    ;

    private String pageVariables;

    private ProductListing(String pageVariables) {

        this.pageVariables = pageVariables;
    }

    public String getValue() {
        return this.pageVariables;
    }

    public String getPageVariables(){return this.pageVariables;}
}
