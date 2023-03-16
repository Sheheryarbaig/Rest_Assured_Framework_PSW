package EnumFactory.IOS;

public enum PopUpEnumIOS {

    XPATH_POP_UP_CROSS_BUTTON("//XCUIElementTypeButton[@name='iOS nav icons close blue']"),
    XPATH_ALLOW_BUTTON("//XCUIElementTypeButton[@name='Allow' or @name='Allow While Using App' or @name='OK']"),
    XPATH_REJECT_BUTTON("//XCUIElementTypeButton[@name='Not Now']"),
    XPATH_SEND_INVITE_MSG("//XCUIElementTypeStaticText[@label='Send invite?']"),
    XPATH_PROCEED_BUTTON("//XCUIElementTypeButton[@name='Proceed']"),
    XPATH_CVV_FIELD("//XCUIElementTypeTextField[@value='...']"),
    XPATH_CASH_IN_BUTTON("//XCUIElementTypeButton[@name='Cash In']"),
    XPATH_SUCCESSFUL_MSG("//XCUIElementTypeImage/following-sibling::XCUIElementTypeStaticText[1]"),
    XPATH_SUCCESSFUL_MSG_DESC("//XCUIElementTypeImage/following-sibling::XCUIElementTypeStaticText[2]"),
    XPATH_PROCESSING_TEXT("//XCUIElementTypeStaticText[@name='Transaction processing...']"),
    XPATH_POP_UP_OK_BUTTON("//XCUIElementTypeButton[@name='Ok']"),
    XPATH_NOT_NOW_BUTTON("//XCUIElementTypeButton[@name='Not now']"),
    XPATH_QUICKER_ACCESS_POP_UP("//XCUIElementTypeStaticText[@name='Activate your Face ID for quicker access']"),
    XPATH_LOADER("//XCUIElementTypeApplication[@name='e& money']/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]"),
    XPATH_RADIO_BUTTON("//XCUIElementTypeButton[@name='iOS buttons radio button unsel']"),
    XPATH_ACCEPT_BUTTON("//XCUIElementTypeButton[@name='Accept']"),
    XPATH_CLOSE_BUTTON("//XCUIElementTypeButton[@name='Close']"),
    XPATH_OPEN_CAMERA_BUTTON("//XCUIElementTypeButton[@name='Open camera']"),
    XPATH_UPGRADE_BUTTON("//XCUIElementTypeButton[@name='Upgrade']"),
    XPATH_CAMERA_ELEMENT("//XCUIElementTypeButton[@name='camera']"),
    XPATH_CAMERA_RADIO_BUTTON("//XCUIElementTypeButton[@name='iOS buttons radio button unsel']"),
    XPATH_SUCCESSFUL_BANK_MSG("//XCUIElementTypeImage/parent::XCUIElementTypeOther/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther/XCUIElementTypeStaticText[1]"),
    XPATH_SUCCESSFUL_BANK_MSG_DESC("//XCUIElementTypeImage/parent::XCUIElementTypeOther/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeStaticText"),
    XPATH_SUCCESS_MSG("//XCUIElementTypeButton[@name='Ok']/parent::XCUIElementTypeOther/preceding-sibling::XCUIElementTypeStaticText"),
    XPATH_LETS_TRY_AGAIN_BUTTON("//XCUIElementTypeButton[@name='OK']"),
    XPATH_ACCEPT_AND_CONTINUE_BUTTON("//XCUIElementTypeButton[@name='Accept & continue']"),
    XPATH_SUCCESSFUL_MSG_FIRST("//XCUIElementTypeImage[@name='success']/following-sibling::XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeStaticText[1]"),
    XPATH_SUCCESSFUL_MSG_SECOND("//XCUIElementTypeImage[@name='success']/following-sibling::XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeStaticText[2]");

    private String pageVariables;

    private PopUpEnumIOS(String pageVariables) {
        this.pageVariables = pageVariables;
    }

    public String getValue() {
        return this.pageVariables;
    }
}
