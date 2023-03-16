package EnumFactory.IOS;

public enum LoginPageEnumIOS {

    XPATH_PIN_FIELD("//XCUIElementTypeSecureTextField[@value='Enter PIN']"),
    XPATH_SIGN_IN_BUTTON("//XCUIElementTypeButton[@name='Sign-in']"),
    XPATH_CONFIRM_BUTTON("//XCUIElementTypeButton[@name='Confirm']"),
    XPATH_JOIN_BUTTON("//XCUIElementTypeButton[@name='Join e& money']"),
    XPATH_OTP_FIELD("//XCUIElementTypeSecureTextField[@value='Enter code']"),
    XPATH_TRY_AGAIN_BUTTON("//XCUIElementTypeButton[@name='Log in']"),
    XPATH_CONFIRM_LOGIN_BUTTON("//XCUIElementTypeButton[@name='Confirm']"),
    XPATH_WELCOME_HEADING("//XCUIElementTypeStaticText[@name='Log in with your PIN or Touch ID.']"),
    XPATH_MSISDN_FIELD("//XCUIElementTypeTextField[@value='xx xxx xxxx']");

    private String pageVariables;

    private LoginPageEnumIOS(String pageVariables) {
        this.pageVariables = pageVariables;
    }

    public String getValue() {
        return this.pageVariables;
    }
}
