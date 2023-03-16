package EnumFactory.Android;

public enum DirectPayPageEnumAndroid {

    XPATH_ADD_ACCOUNT_BUTTON("//android.widget.Button[@resource-id='com.etisalat.ewallet:id/btn_confirm']"),
    XPATH_ADD_NEW_ACCOUNT_BUTTON("//android.view.ViewGroup[@resource-id='com.etisalat.ewallet:id/cl_add_new_account']"),
    XPATH_MSISDN_FIELD("//android.widget.EditText[@resource-id='com.etisalat.ewallet:id/et_phone_number']"),
    XPATH_ACCOUNT_NAME_START("//android.widget.TextView[@resource-id='com.etisalat.ewallet:id/tv_account_title' and @text='"),
    XPATH_ACCOUNT_NAME_END("']"),
    XPATH_ACCOUNT_NUMBER_START("//android.widget.TextView[@resource-id='com.etisalat.ewallet:id/tv_account_number' and @text='+971 "),
    XPATH_ACCOUNT_NUMBER_END("']"),
    XPATH_ACCOUNT_START("//android.widget.TextView[@text='"),
    XPATH_ACCOUNT_END("']"),
    XPATH_SAVED_ACCOUNT_START("(//android.widget.TextView[@resource-id='com.etisalat.ewallet:id/tv_account_number' and not(@text='"),
    XPATH_SAVED_ACCOUNT_END("')])[1]"),
    XPATH_DELETE_BUTTON("//android.widget.TextView[@text='Delete']"),
    XPATH_CONFIRM_BUTTON("//android.widget.Button[@resource-id='com.etisalat.ewallet:id/btn_start']"),
    XPATH_PIN_FIELD("//android.widget.EditText[@resource-id='com.etisalat.ewallet:id/et_data']"),
    XPATH_AMOUNT_FIELD("//android.widget.EditText[@resource-id='com.etisalat.ewallet:id/et_data']"),
    XPATH_AMOUNT_TO_BE_DEDUCTED("//android.widget.TextView[@resource-id='com.etisalat.ewallet:id/tv_transfer_bal_amount']"),
    XPATH_PROCEED_BUTTON("//android.widget.Button[@resource-id='com.etisalat.ewallet:id/btn_confirm_domestic']"),
    XPATH_LOGIN_PROCEED_BUTTON("//android.widget.Button[@resource-id='com.etisalat.ewallet:id/btn_login']"),
    XPATH_ADD_MONEY_BUTTON("//android.widget.Button[@resource-id='com.etisalat.ewallet:id/btn_cash_in']"),
    XPATH_TAG_FIELD("//android.widget.RelativeLayout[@resource-id='com.etisalat.ewallet:id/ll_question']"),
    XPATH_TAG_VALUE_START("//android.widget.TextView[@text='"),
    XPATH_TAG_VALUE_END("']"),
    XPATH_NAME_FIELD("//android.widget.EditText[@resource-id='com.etisalat.ewallet:id/et_data']");

    private String pageVariables;

    private DirectPayPageEnumAndroid(String pageVariables) {
        this.pageVariables = pageVariables;
    }

    public String getValue() {
        return this.pageVariables;
    }
}
