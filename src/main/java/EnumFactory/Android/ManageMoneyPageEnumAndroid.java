package EnumFactory.Android;

public enum ManageMoneyPageEnumAndroid {

    XPATH_BANK_NAME_FIELD("//android.widget.FrameLayout[@resource-id='com.etisalat.ewallet:id/et_bank_name']//android.widget.EditText[@resource-id='com.etisalat.ewallet:id/et_data']"),
    XPATH_PIN_FIELD("//android.widget.FrameLayout[@resource-id='com.etisalat.ewallet:id/et_input']//android.widget.EditText[@resource-id='com.etisalat.ewallet:id/et_data']"),
    XPATH_IBAN_FIELD("//android.widget.FrameLayout[@resource-id='com.etisalat.ewallet:id/et_iban']//android.widget.EditText[@resource-id='com.etisalat.ewallet:id/et_data']"),
    XPATH_BENEFICIARY_FIELD("//android.widget.FrameLayout[@resource-id='com.etisalat.ewallet:id/et_beneficiary_name']//android.widget.EditText[@resource-id='com.etisalat.ewallet:id/et_data']"),
    XPATH_ALIAS_FIELD("//android.widget.FrameLayout[@resource-id='com.etisalat.ewallet:id/et_alias']//android.widget.EditText[@resource-id='com.etisalat.ewallet:id/et_data']"),
    XPATH_LINK_BANK_ACCOUNT_BUTTON("//android.widget.Button[@resource-id='com.etisalat.ewallet:id/btn_confirm']"),
    XPATH_CARD_NUMBER_FIELD("//android.widget.EditText[@resource-id='cardNumber']"),
    XPATH_EXPIRY_DATE_FIELD("//android.view.View//android.widget.EditText[not(@resource-id)]"),
    XPATH_EXPIRY_YEAR_FIELD("//android.widget.EditText[@resource-id='expYear']"),
    XPATH_CVV_NUMBER_FIELD("//android.widget.EditText[@resource-id='ValidationCode']"),
    XPATH_VERIFY_CARD_BUTTON("//android.widget.Button[@text='Verify Card']"),
    XPATH_CONFIRM_BUTTON("//android.widget.Button[@text='Confirm']");

    private String pageVariables;

    private ManageMoneyPageEnumAndroid(String pageVariables) {
        this.pageVariables = pageVariables;
    }

    public String getValue() {
        return this.pageVariables;
    }
}
