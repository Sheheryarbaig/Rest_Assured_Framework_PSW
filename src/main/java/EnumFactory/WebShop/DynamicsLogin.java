package EnumFactory.WebShop;

public enum DynamicsLogin {
    XPATH_USER_NAME("//input[@name='loginfmt']"),
    XPATH_NEXT("//input[@type='submit']"),
    XPATH_PASSWORD("//input[@id='passwordInput']"),
    XPATH_SIGN_IN("//span[@id='submitButton']");
    private String pageVariables;
    private DynamicsLogin(String pageVariables) {

        this.pageVariables = pageVariables;
    }

    public String getValue() {
        return this.pageVariables;
    }

    public String getPageVariables(){return this.pageVariables;}
}
