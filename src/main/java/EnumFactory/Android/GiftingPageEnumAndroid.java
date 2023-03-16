package EnumFactory.Android;

public enum GiftingPageEnumAndroid {

    XPATH_NAVIGATION_OPTION_START("//android.widget.TextView[@resource-id='com.etisalat.ewallet:id/tv_bill_type' and @text='"),
    XPATH_NAVIGATION_OPTION_END("']"),
    XPATH_MSISDN_FIELD("//android.widget.EditText[@resource-id='com.etisalat.ewallet:id/et_phone_number']"),
    XPATH_AMOUNT_FIELD("//android.widget.EditText[@resource-id='com.etisalat.ewallet:id/et_data']"),
    XPATH_AMOUNT_TO_BE_DEDUCTED("//android.widget.TextView[@resource-id='com.etisalat.ewallet:id/tv_amount' or @resource-id='com.etisalat.ewallet:id/tv_transfer_bal_amount']"),
    XPATH_PROCEED_BUTTON("//android.widget.Button[@resource-id='com.etisalat.ewallet:id/btn_confirm' or @resource-id='com.etisalat.ewallet:id/btn_proceed']"),
    XPATH_PAYMENT_METHOD_BALANCE("//android.widget.TextView[@resource-id='com.etisalat.ewallet:id/tv_amount_to_pay']"),
    XPATH_PIN_FIELD("//android.widget.EditText[@text='Enter your PIN']"),
    XPATH_LOGIN_PROCEED_BUTTON("//android.widget.Button[@resource-id='com.etisalat.ewallet:id/btn_login']"),
    XPATH_ADD_MONEY_BUTTON("//android.widget.Button[@resource-id='com.etisalat.ewallet:id/btn_cash_in']"),
    XPATH_VOUCHER_AMOUNT_START("//android.widget.TextView[@resource-id='com.etisalat.ewallet:id/tv_service_name' and @text='"),
    XPATH_VOUCHER_AMOUNT_END("']/following-sibling::android.widget.TextView[@resource-id='com.etisalat.ewallet:id/tv_price']"),
    XPATH_VOUCHER_OPTION_START("//android.widget.TextView[@resource-id='com.etisalat.ewallet:id/tv_service_name' and @text='"),
    XPATH_VOUCHER_OPTION_END("']"),
    XPATH_GIFTING_HEADING_MSG("//android.widget.TextView[@text='Which service would you like to gift?']"),
    XPATH_BILLERS_PRICES("//android.widget.TextView[@resource-id='com.etisalat.ewallet:id/tv_price']"),
    XPATH_AVAILABLE_BALANCE("//android.widget.TextView[@resource-id='com.etisalat.ewallet:id/tv_current_balance']");

    private String pageVariables;

    private GiftingPageEnumAndroid(String pageVariables) {
        this.pageVariables = pageVariables;
    }

    public String getValue() {
        return this.pageVariables;
    }
}
