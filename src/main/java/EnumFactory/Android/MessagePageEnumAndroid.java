package EnumFactory.Android;

public enum MessagePageEnumAndroid {

    XPATH_TO_NUMBER_TEXT("//android.widget.TextView[@resource-id='com.google.android.apps.messaging:id/conversation_title']"),
    XPATH_MSG_FIELD("//android.widget.EditText[@resource-id='com.google.android.apps.messaging:id/compose_message_text']");


    private String pageVariables;

    private MessagePageEnumAndroid(String pageVariables) {
        this.pageVariables = pageVariables;
    }

    public String getValue() {
        return this.pageVariables;
    }
}
