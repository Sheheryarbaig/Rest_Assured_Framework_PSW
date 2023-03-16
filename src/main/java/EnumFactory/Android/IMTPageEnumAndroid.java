package EnumFactory.Android;

public enum IMTPageEnumAndroid {

    XPATH_COUNTRY_FIELD("//android.view.ViewGroup[@resource-id='com.etisalat.ewallet:id/cl_country']"),
    XPATH_DROPDOWN_VALUE_START("//android.widget.TextView[@text='"),
    XPATH_DROPDOWN_VALUE_END("']"),
    XPATH_RECEIVER_OPTION_START("//android.widget.TextView[@resource-id='com.etisalat.ewallet:id/tv_payment_option' and @text='"),
    XPATH_RECEIVER_OPTION_END("']"),
    XPATH_UAE_AMOUNT_FIELD("//android.widget.EditText[@resource-id='com.etisalat.ewallet:id/et_input_currency_from']"),
    XPATH_NEXT_BUTTON("//android.widget.Button[@text='Next']"),
    XPATH_TRANSACTION_FEE("//android.widget.TextView[@resource-id='com.etisalat.ewallet:id/tv_transaction_fee']"),
    XPATH_VAT("//android.widget.TextView[@resource-id='com.etisalat.ewallet:id/tv_vat']"),
    XPATH_TOTAL_AMOUNT("//android.widget.TextView[@resource-id='com.etisalat.ewallet:id/tv_total_amount']"),
    XPATH_IMT_FIELD_START("//android.widget.EditText[contains(@text,\""),
    XPATH_IMT_FIELD_END("\")]"),
    XPATH_PIN_FIELD("//android.widget.FrameLayout[@resource-id='com.etisalat.ewallet:id/et_input']//android.widget.EditText[@resource-id='com.etisalat.ewallet:id/et_data']"),
    XPATH_CONFIRM_BUTTON("//android.widget.Button[@text='Confirm']"),
    XPATH_SEND_TO_MYSELF_BUTTON("//android.widget.TextView[@resource-id='com.etisalat.ewallet:id/tv_self_send']"),
    XPATH_WAIT_ELEMENT("//android.widget.TextView[@text='Select Country']"),
    XPATH_INSUFFICIENT_BALANCE_MSG("//android.widget.TextView[@resource-id='com.etisalat.ewallet:id/tv_input_amount_error']"),
    XPATH_IMT_DROPDOWN_START("(//android.widget.Spinner[@resource-id='com.etisalat.ewallet:id/sp_drop_down'])["),
    XPATH_IMT_DROPDOWN_END("]");


    private String pageVariables;

    private IMTPageEnumAndroid(String pageVariables) {
        this.pageVariables = pageVariables;
    }

    public String getValue() {
        return this.pageVariables;
    }
}
