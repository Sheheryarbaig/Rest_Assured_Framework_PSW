package EnumFactory.Android;

public enum HelpSupportPageEnumAndroid {

    XPATH_FAQS_OPTION_START("//android.widget.TextView[@resource-id='com.etisalat.ewallet:id/tv_bill_type' and @text='"),
    XPATH_FAQS_OPTION_END("']"),
    XPATH_FAQ_HEADING_START("//android.widget.TextView[@resource-id='com.etisalat.ewallet:id/tv_heading' and @text='"),
    XPATH_FAQ_HEADING_END("']");


    private String pageVariables;

    private HelpSupportPageEnumAndroid(String pageVariables) {
        this.pageVariables = pageVariables;
    }

    public String getValue() {
        return this.pageVariables;
    }
}
