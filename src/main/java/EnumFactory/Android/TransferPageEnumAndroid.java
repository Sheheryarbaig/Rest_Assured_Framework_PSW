package EnumFactory.Android;

public enum TransferPageEnumAndroid {

    XPATH_AMOUNT_FIELD("//android.widget.EditText[@resource-id='com.etisalat.ewallet:id/et_data']"),
    XPATH_AMOUNT_TO_BE_DEDUCTED("//android.widget.TextView[@resource-id='com.etisalat.ewallet:id/tv_amount' or @resource-id='com.etisalat.ewallet:id/tv_transfer_bal_amount']"),
    XPATH_PROCEED_BUTTON("//android.widget.Button[@resource-id='com.etisalat.ewallet:id/btn_confirm' or @resource-id='com.etisalat.ewallet:id/btn_proceed']"),
    XPATH_PAYMENT_METHOD_BALANCE("//android.widget.TextView[@resource-id='com.etisalat.ewallet:id/tv_amount_to_pay']"),
    XPATH_PIN_FIELD("//android.widget.EditText[@text='Enter your PIN']"),
    XPATH_CONFIRM_BUTTON("//android.widget.Button[@resource-id='com.etisalat.ewallet:id/btn_login']");

    private String pageVariables;

    private TransferPageEnumAndroid(String pageVariables) {
        this.pageVariables = pageVariables;
    }

    public String getValue() {
        return this.pageVariables;
    }
}
