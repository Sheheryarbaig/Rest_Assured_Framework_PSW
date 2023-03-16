package EnumFactory.PartnerPortal;

public enum LoginPageEnum {

    XPATH_USERNAME_FIELD("//input[@formcontrolname='username']"),
    XPATH_PASSWORD_FIELD("//input[@formcontrolname='password']"),
    XPATH_LOGIN_BUTTON("//input[@id='signbtn']"),
    XPATH_LOGIN_SUCCESS_TOAST("//div[@ng-reflect-ng-class='toast-success']"),
    XPATH_LOGIN_HEADING("//h1[@class='login']");

    private String pageVariables;

    private LoginPageEnum(String pageVariables) {
        this.pageVariables = pageVariables;
    }

    public String getValue() {
        return this.pageVariables;
    }
}
