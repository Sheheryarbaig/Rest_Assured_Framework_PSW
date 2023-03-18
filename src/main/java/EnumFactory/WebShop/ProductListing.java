package EnumFactory.WebShop;

public enum ProductListing {
    XPATH_CATEGORY_NEW("//div[@id='renderPage']//descendant::a[contains(text(),'New')]"),
    XPATH_CATEGORY_SPECIAL_OFFERS("//div[@id='renderPage']//descendant::a[contains(text(),'Special Offers')]"),
    XPATH_CATEGORY_SOLAR_MODULES("//div[@id='renderPage']//descendant::a[contains(text(),'Solar Modules')]"),;

    private String pageVariables;

    private ProductListing(String pageVariables) {

        this.pageVariables = pageVariables;
    }

    public String getValue() {
        return this.pageVariables;
    }

    public String getPageVariables(){return this.pageVariables;}
}
