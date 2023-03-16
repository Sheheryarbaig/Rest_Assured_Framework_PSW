package EnumFactory.Android;

public enum LoginPageEnumAndroid {

    XPATH_PIN_FIELD("//android.widget.EditText[@text='Enter PIN']"),
    XPATH_SIGN_IN_BUTTON("//android.widget.Button[@resource-id='com.etisalat.ewallet:id/btnSignIn']"),
    XPATH_CONFIRM_BUTTON("//android.widget.Button[@resource-id='com.etisalat.ewallet:id/btn_regist_join']"),
    XPATH_JOIN_BUTTON("//android.widget.Button[@resource-id='com.etisalat.ewallet:id/btn_send']"),
    XPATH_OTP_FIELD("//android.widget.EditText[@text='Enter code']"),
    XPATH_TRY_AGAIN_BUTTON("//android.widget.Button[@resource-id='com.etisalat.ewallet:id/btn_action']"),
    XPATH_CONFIRM_LOGIN_BUTTON("//android.widget.Button[@resource-id='com.etisalat.ewallet:id/btn_login']"),
    XPATH_WELCOME_HEADING("//android.widget.TextView[@resource-id='com.etisalat.ewallet:id/tv_user_name']"),
    XPATH_MSISDN_FIELD("//android.widget.EditText[@resource-id='com.etisalat.ewallet:id/et_phone']");

    private String pageVariables;

    private LoginPageEnumAndroid(String pageVariables) {
        this.pageVariables = pageVariables;
    }

    public String getValue() {
        return this.pageVariables;
    }
}
