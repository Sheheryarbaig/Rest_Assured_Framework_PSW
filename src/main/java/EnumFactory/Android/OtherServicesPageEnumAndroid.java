package EnumFactory.Android;

public enum OtherServicesPageEnumAndroid {

    XPATH_NAVIGATION_OPTION_START("//android.widget.TextView[@resource-id='com.etisalat.ewallet:id/tv_bill_type' and @text='"),
    XPATH_NAVIGATION_OPTION_END("']"),
    XPATH_ACCOUNT_NUMBER_FIELD("//android.widget.RelativeLayout[@resource-id='com.etisalat.ewallet:id/rl_number']//android.widget.EditText[@resource-id='com.etisalat.ewallet:id/et_phone_number']"),
    XPATH_AMOUNT_TO_BE_DEDUCTED("//android.widget.TextView[(@resource-id='com.etisalat.ewallet:id/tv_amount' or @resource-id='com.etisalat.ewallet:id/tv_final_bill_amount') and (contains(@text,'AED'))]"),
    XPATH_PROCEED_BUTTON("//android.widget.Button[@text='Proceed']"),
    XPATH_PIN_FIELD("//android.widget.EditText[@text='Enter your PIN']"),
    XPATH_CONFIRM_BUTTON("//android.widget.Button[@resource-id='com.etisalat.ewallet:id/btn_login']"),
    XPATH_ADD_ACCOUNT_BUTTON("//android.widget.Button[@resource-id='com.etisalat.ewallet:id/btn_confirm' and @text='Add account']"),
    XPATH_PRE_DEFINE_AMOUNT_FIELD_START("//android.widget.TextView[@resource-id='com.etisalat.ewallet:id/tv_amount' and @text='"),
    XPATH_PRE_DEFINE_AMOUNT_FIELD_END("']"),
    XPATH_NAME_FIELD("//android.widget.FrameLayout[@resource-id='com.etisalat.ewallet:id/et_name']//android.widget.EditText[@resource-id='com.etisalat.ewallet:id/et_data']"),
    XPATH_ACCOUNT_PIN_FIELD("//android.widget.FrameLayout[@resource-id='com.etisalat.ewallet:id/et_pin']//android.widget.EditText[@resource-id='com.etisalat.ewallet:id/et_data']"),
    XPATH_PAYMENT_METHOD_BALANCE("//android.widget.TextView[@resource-id='com.etisalat.ewallet:id/tv_amount_to_pay']");

    private String pageVariables;

    private OtherServicesPageEnumAndroid(String pageVariables) {
        this.pageVariables = pageVariables;
    }

    public String getValue() {
        return this.pageVariables;
    }
}
