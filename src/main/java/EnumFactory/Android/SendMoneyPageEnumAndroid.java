package EnumFactory.Android;

public enum SendMoneyPageEnumAndroid {

    XPATH_NAVIGATION_OPTION_START("//android.widget.TextView[@resource-id='com.etisalat.ewallet:id/tvContactName' and @text='"),
    XPATH_NAVIGATION_OPTION_END("']"),
    XPATH_ENTER_ID_LOGO("//android.widget.TextView[@resource-id='com.etisalat.ewallet:id/tv_enter_id']"),
    XPATH_AGENT_ID_FIELD("//android.widget.FrameLayout[@resource-id='com.etisalat.ewallet:id/et_agent_id']//android.widget.EditText[@resource-id='com.etisalat.ewallet:id/et_data']"),
    XPATH_CONFIRM_BUTTON("//android.widget.Button[@text='Confirm']"),
    XPATH_PRE_DEFINE_AMOUNT_FIELD_START("//android.widget.TextView[@resource-id='com.etisalat.ewallet:id/tv_amount' and @text='"),
    XPATH_PRE_DEFINE_AMOUNT_FIELD_END("']"),
    XPATH_PIN_FIELD("//android.widget.FrameLayout[@resource-id='com.etisalat.ewallet:id/et_input']//android.widget.EditText[@resource-id='com.etisalat.ewallet:id/et_data']"),
    XPATH_AMOUNT_TO_BE_DEDUCTED("//android.widget.TextView[@resource-id='com.etisalat.ewallet:id/tv_transfer_bal_amount']"),
    XPATH_SAVED_BANK_ACCOUNT("//androidx.recyclerview.widget.RecyclerView[@resource-id='com.etisalat.ewallet:id/rv_bank_accounts']"),
    XPATH_ADD_MONEY_BUTTON("//android.widget.Button[@resource-id='com.etisalat.ewallet:id/btn_cash_in']");

    private String pageVariables;

    private SendMoneyPageEnumAndroid(String pageVariables) {
        this.pageVariables = pageVariables;
    }

    public String getValue() {
        return this.pageVariables;
    }
}
