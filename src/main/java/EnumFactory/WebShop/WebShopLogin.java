package EnumFactory.WebShop;

public enum WebShopLogin {

    XPATH_USER_NAME("//input[@id='signInName']"),
    XPATH_USER_PASSWORD("//input[@id='password']"),
    XPATH_LOGIN_BUTTON("//a[@title='Log in']"),
    XPATH_LOGIN_SIGN_IN("//button[@id='next']"),
    XPATH_LOGIN_MESSAGE("//div[@id='login_credentials']/h4");
    private String pageVariables;

    private WebShopLogin(String pageVariables) {

        this.pageVariables = pageVariables;
    }

    public String getValue() {
        return this.pageVariables;
    }

    public String getPageVariables(){return this.pageVariables;}
}
