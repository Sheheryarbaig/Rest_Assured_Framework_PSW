package EnumFactory.IOS;

public enum InviteFriendPageEnumIOS {

    XPATH_SEND_INVITES_BUTTON("//XCUIElementTypeButton[@name='Send invites']"),
    XPATH_YES_BUTTON("//XCUIElementTypeButton[@name='Yes']"),
    XPATH_INVITE_BUTTON_START("//XCUIElementTypeStaticText[@value='"),
    XPATH_INVITE_BUTTON_END("']/following-sibling::XCUIElementTypeButton[@name='Invite']"),
    XPATH_REWARD_JOURNEY_MSG("//XCUIElementTypeStaticText[@value='Give AED 10 and get AED 10']"),
    XPATH_PENDING_COUNT("//XCUIElementTypeStaticText[@name='PENDING']/preceding-sibling::XCUIElementTypeStaticText");

    private String pageVariables;

    private InviteFriendPageEnumIOS(String pageVariables) {
        this.pageVariables = pageVariables;
    }

    public String getValue() {
        return this.pageVariables;
    }
}
