package EnumFactory.Android;

public enum InviteFriendPageEnumAndroid {

    XPATH_SEND_INVITES_BUTTON("//android.widget.Button[@resource-id='com.etisalat.ewallet:id/btn_send']"),
    XPATH_YES_BUTTON("//android.widget.Button[@resource-id='com.etisalat.ewallet:id/btnResume']"),
    XPATH_INVITE_BUTTON_START("//android.widget.TextView[@text='"),
    XPATH_INVITE_BUTTON_END("']/following-sibling::android.widget.Button[@text='Invite']"),
    XPATH_REWARD_JOURNEY_MSG("//android.widget.TextView[@text='Give AED 10 and get AED 10']"),
    XPATH_PENDING_COUNT("//android.widget.TextView[@resource-id='com.etisalat.ewallet:id/pending_count']");

    private String pageVariables;

    private InviteFriendPageEnumAndroid(String pageVariables) {
        this.pageVariables = pageVariables;
    }

    public String getValue() {
        return this.pageVariables;
    }
}
