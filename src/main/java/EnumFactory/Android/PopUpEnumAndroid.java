package EnumFactory.Android;

public enum PopUpEnumAndroid {

    XPATH_POP_UP_CROSS_BUTTON("//android.widget.ImageView[@resource-id='com.etisalat.ewallet:id/iv_cross']"),
    XPATH_ALLOW_BUTTON("//android.widget.TextView[@resource-id='com.etisalat.ewallet:id/tvBalanceAmount']"),
    XPATH_REJECT_BUTTON("//android.widget.TextView[@resource-id='com.etisalat.ewallet:id/tvBalanceAmount']"),
    XPATH_SEND_INVITE_MSG("//android.widget.TextView[@resource-id='com.etisalat.ewallet:id/tv_title']"),
    XPATH_PROCEED_BUTTON("//android.widget.Button[@resource-id='com.etisalat.ewallet:id/btn_action']"),
    XPATH_CVV_FIELD("//android.widget.EditText[@resource-id='ValidationCode']"),
    XPATH_CASH_IN_BUTTON("//android.widget.Button[@text='Cash In']"),
    XPATH_SUCCESSFUL_MSG("//android.widget.TextView[@resource-id='com.etisalat.ewallet:id/tv_title']"),
    XPATH_SUCCESSFUL_MSG_DESC("//android.widget.TextView[@resource-id='com.etisalat.ewallet:id/tv_desc']"),
    XPATH_PROCESSING_TEXT("//android.widget.TextView[@text='Transaction processing...']"),
    XPATH_POP_UP_OK_BUTTON("//android.widget.Button[@text='Ok']"),
    XPATH_NOT_NOW_BUTTON("//android.widget.TextView[@resource-id='com.etisalat.ewallet:id/tv_not_now']"),
    XPATH_QUICKER_ACCESS_POP_UP("//android.widget.ImageView[@resource-id='com.etisalat.ewallet:id/iv_touchid']"),
    XPATH_LOADER("//android.widget.ProgressBar[@resource-id='com.etisalat.ewallet:id/spin_kit']"),
    XPATH_RADIO_BUTTON("//android.widget.RadioButton[@resource-id='com.etisalat.ewallet:id/rb_attestation']"),
    XPATH_ACCEPT_BUTTON("//android.widget.Button[@resource-id='com.etisalat.ewallet:id/btn_accept' or @text='Accept']"),
    XPATH_CLOSE_BUTTON("//android.widget.Button[@resource-id='com.etisalat.ewallet:id/btnOk']"),
    XPATH_OPEN_CAMERA_BUTTON("//android.widget.Button[@resource-id='com.etisalat.ewallet:id/btn_open_camera']"),
    XPATH_UPGRADE_BUTTON("//android.widget.Button[@text='Upgrade']"),
    XPATH_CAMERA_ELEMENT("//android.widget.ImageView[@resource-id='com.etisalat.ewallet:id/btn_camera_scan']"),
    XPATH_CAMERA_RADIO_BUTTON("//android.widget.RadioButton[@resource-id='com.etisalat.ewallet:id/rb_agree']"),
    XPATH_SUCCESS_MSG("//android.widget.TextView[@resource-id='com.etisalat.ewallet:id/tvTitle']"),
    XPATH_LETS_TRY_AGAIN_BUTTON("//android.widget.Button[@resource-id='com.etisalat.ewallet:id/btn_action']"),
    XPATH_ACCEPT_AND_CONTINUE_BUTTON("//android.widget.Button[@resource-id='com.etisalat.ewallet:id/btn_action' and @text='Accept & continue']"),

    XPATH_SUCCESSFUL_MSG_FIRST("//android.widget.TextView[@resource-id='com.etisalat.ewallet:id/tv_title']"),
    XPATH_SUCCESSFUL_MSG_SECOND("//android.widget.TextView[@resource-id='com.etisalat.ewallet:id/tv_desc']");

    private String pageVariables;

    private PopUpEnumAndroid(String pageVariables) {
        this.pageVariables = pageVariables;
    }

    public String getValue() {
        return this.pageVariables;
    }
}
