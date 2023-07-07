package EnumFactory.WebShop;

public enum Home {
    XPATH_USER_NAME("//div[@class='ms-profile-button-text']//div"),
    XPATH_SEARCH("//form[@name='searchForm']//input"),
    XPATH_SUBMIT_SEARCH("//form[@name='searchForm']//button[@class='ms-search__form-submitSearch msc-btn']"),
    XPATH_PRODUCT("//div[@id='renderPage']//descendant::a[contains(text(),'Products')]"),
    XPATH_CART_ICON("//div[@class='ms-cart-icon' and @id='IDNMAwGxa_c26y77k-cart-icon']"),
    XPATH_DESIGNATION("//div[@class='ms-cart-icon' and @id='IDNMAwGxa_c26y77k-cart-icon']"),
    XPATH_NAVIGATE_TO_SEARCH_RESULT("//li[@class='msc-autoSuggest__categoryResults-item']//a");

    private String pageVariables;

    private Home(String pageVariables) {

        this.pageVariables = pageVariables;
    }

    public String getValue() {
        return this.pageVariables;
    }

    public String getPageVariables(){return this.pageVariables;}
}
