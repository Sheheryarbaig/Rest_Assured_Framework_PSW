package EnumFactory.Android;

public enum RequestMoneyPageEnumAndroid {

    XPATH_MSISDN_FIELD("//android.widget.EditText[@resource-id='com.etisalat.ewallet:id/et_phone_number']"),
    XPATH_NEXT_BUTTON("//android.widget.Button[@resource-id='com.etisalat.ewallet:id/btn_next']"),
    XPATH_AMOUNT_FIELD("//android.widget.FrameLayout[@resource-id='com.etisalat.ewallet:id/et_amount_request_money']//android.widget.EditText"),
    XPATH_REQUEST_FROM_QR_CODE_BUTTON("//android.widget.TextView[@resource-id='com.etisalat.ewallet:id/tv_request_from_qr']"),
    XPATH_QR_CODE("//android.widget.ImageView[@resource-id='com.etisalat.ewallet:id/iv_qr_code']"),
    XPATH_REQUESTED_MONEY("//android.widget.TextView[@resource-id='com.etisalat.ewallet:id/tv_bill_type']");

    private String pageVariables;

    private RequestMoneyPageEnumAndroid(String pageVariables) {
        this.pageVariables = pageVariables;
    }

    public String getValue() {
        return this.pageVariables;
    }
}
