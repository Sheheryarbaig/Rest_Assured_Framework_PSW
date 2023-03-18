package EnumFactory.WebShop;

public enum WebShopLogin {

    XPATH_USER_NAME("//input[@id='signInName']"),
    XPATH_USER_PASSWORD("//input[@id='password']"),
    XPATH_LOGIN_BUTTON("//a[@title='Log in']"),
    XPATH_LOGIN_SIGN_IN("//button[@id='next']"),
    XPATH_LOGIN_MESSAGE("//div[@id='login_credentials']/h4"),
    XPATH_CREATE_ACCOUNT_BUTTON("//a[@data-exp-event-id='Homepage.Content block 11.Create an account.click']"),
    XPATH_CONTACT_US_BUTTON("//a[@data-exp-event-id='Homepage.Content block 11.CONTACT US.click']//div"),
    XPATH_TITLE("//span[@class='_title']"),
    XPATH_SIGN_IN_HEADING("//h2[@class='ms-content-block__title']");
    private String pageVariables;

    private WebShopLogin(String pageVariables) {

        this.pageVariables = pageVariables;
    }

    public String getValue() {
        return this.pageVariables;
    }

    public String getPageVariables(){return this.pageVariables;}
}
