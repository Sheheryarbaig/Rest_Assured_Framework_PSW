package EnumFactory.Android;

public enum AddMoneyPageEnumAndroid {

    XPATH_SAVED_DEBIT_CARD("//android.view.ViewGroup[@resource-id='com.etisalat.ewallet:id/cl_parent']"),
    XPATH_AMOUNT_FIELD("//android.widget.EditText[@text='How much?']"),
    XPATH_PIN_FIELD("//android.widget.EditText[@resource-id='com.etisalat.ewallet:id/et_data']"),
    XPATH_LOGIN_CONFIRM_BUTTON("//android.widget.Button[@resource-id='com.etisalat.ewallet:id/btn_login']"),
    XPATH_PAYMENT_MACHINES_STEPS_TEXT("//android.widget.TextView[@resource-id='com.etisalat.ewallet:id/tv_message']"),
    XPATH_NAVIGATION_OPTION_START("//android.widget.TextView[@resource-id='com.etisalat.ewallet:id/tvContactName' and @text='"),
    XPATH_NAVIGATION_OPTION_END("']"),
    XPATH_ADD_MONEY_HEADING("//android.widget.TextView[@resource-id='com.etisalat.ewallet:id/tvMoneyTransfer' and @text='Add money']"),
    XPATH_CONTINUE_BUTTON("//android.widget.Button[@resource-id='com.etisalat.ewallet:id/btnContinue']"),
    XPATH_SUBMIT_BUTTON("//android.widget.Button[@text='Submit']"),
    XPATH_RADIO_BUTTON("//android.widget.CheckBox[@resource-id='CheckBoxTerms']"),
    XPATH_GENERATE_HASH_BUTTON("//android.widget.Button[@resource-id='genHash']"),
    XPATH_RETURN_TO_PG_BUTTON("//android.widget.Button[@resource-id='ret']"),
    XPATH_RESPONSE_CODE_FIELD("//android.widget.EditText[@resource-id='pp_ResponseCode']"),
    XPATH_RESPONSE_MESSAGE_FIELD("//android.widget.EditText[@resource-id='pp_ResponseMessage']"),
    XPATH_AUTH_CODE_FIELD("//android.widget.EditText[@resource-id='pp_AuthCode']"),
    XPATH_BANK_ID_FIELD("//android.widget.EditText[@resource-id='pp_BankID']"),
    XPATH_BANK_FIELD("//android.view.View[@resource-id='ddl_BanksList']"),
    XPATH_DROPDOWN_VALUE_START("//android.widget.CheckedTextView[@text='"),
    XPATH_DROPDOWN_VALUE_END("']"),
    XPATH_CONFIRM_BUTTON("//android.widget.Button[@resource-id='com.etisalat.ewallet:id/btn_confirm']");

    private String pageVariables;

    private AddMoneyPageEnumAndroid(String pageVariables) {
        this.pageVariables = pageVariables;
    }

    public String getValue() {
        return this.pageVariables;
    }
}
