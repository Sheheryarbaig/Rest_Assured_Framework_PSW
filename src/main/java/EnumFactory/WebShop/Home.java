package EnumFactory.WebShop;

public enum Home {
    XPATH_USER_NAME("//div[@class='ms-profile-button-text']//div"),
    XPATH_PRODUCT("//div[@id='renderPage']//descendant::a[contains(text(),'Products')]"),;
    private String pageVariables;

    private Home(String pageVariables) {

        this.pageVariables = pageVariables;
    }

    public String getValue() {
        return this.pageVariables;
    }

    public String getPageVariables(){return this.pageVariables;}
}
