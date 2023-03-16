package EnumFactory.IOS;

public enum DashboardPageEnumIOS {

    XPATH_WALLET_BALANCE("//XCUIElementTypeStaticText[@value='e& money balance']/following-sibling::XCUIElementTypeStaticText[contains(@label,'.')]"),
    XPATH_LOGOUT_BUTTON("//XCUIElementTypeStaticText[@name='Log out']"),
    XPATH_ADD_MONEY_BUTTON("//XCUIElementTypeButton[contains(@name,'Add money')]"),
    XPATH_SEND_MONEY_BUTTON("//XCUIElementTypeButton[contains(@name,'Send money')]"),
    XPATH_BALANCE_CARD("//XCUIElementTypeStaticText[@label='e& money balance']"),
    XPATH_TRANSACTION_HISTORY_HEADING("//XCUIElementTypeStaticText[@label='Transaction History']"),
    XPATH_PROMOTION_BANNER("//XCUIElementTypeCollectionView//XCUIElementTypeImage"),
    XPATH_AGENT_LISTING("//XCUIElementTypeOther[@name='Agents']/following-sibling::XCUIElementTypeCell"),
    XPATH_MERCHANT_LISTING("//XCUIElementTypeOther[@name='Merchants']/following-sibling::XCUIElementTypeCell"),
    XPATH_LIST_VIEW_TAB("//XCUIElementTypeButton[@name='LIST VIEW']"),
    XPATH_MAP_VIEW_TAB("//XCUIElementTypeButton[@name='MAP VIEW']"),
    XPATH_AGENT_VIEW_ALL_BUTTON("//XCUIElementTypeStaticText[@name='Agents']/following-sibling::XCUIElementTypeButton[@name='View all']"),
    XPATH_MERCHANTS_VIEW_ALL_BUTTON("//XCUIElementTypeStaticText[@name='Merchants']/following-sibling::XCUIElementTypeButton[@name='View all']"),
    XPATH_WALLET_HEADING("//XCUIElementTypeNavigationBar[@name='etisalatWallet.WalletView']"),
    XPATH_SAVED_CARDS_HEADING("//XCUIElementTypeStaticText[@name='Saved cards' and @visible='true']"),
    XPATH_SAVED_BANKS_HEADING("//XCUIElementTypeStaticText[@name='Saved bank accounts' and @visible='true']"),
    XPATH_PROFILE_HEADING("//XCUIElementTypeNavigationBar[@name='etisalatWallet.ProfileNewView']"),
    XPATH_MY_DOCUMENTS_HEADING("//XCUIElementTypeStaticText[@value='My Documents']"),
    XPATH_BANK_ACCOUNTS_HEADING("//XCUIElementTypeStaticText[@value='Bank accounts']"),
    XPATH_ACCOUNT_ACCESS_HEADING("//XCUIElementTypeStaticText[@value='Account Access']"),
    XPATH_IMT_HEADING("//XCUIElementTypeStaticText[@value='Intl. Remittance Beneficiaries']"),
    XPATH_DIRECT_PAY_HEADING("//XCUIElementTypeStaticText[@value='Direct Pay']"),
    XPATH_SERVICES_AND_UTILITIES_HEADING("//XCUIElementTypeStaticText[@value='Services and Utilities']"),
    XPATH_FAQ_HEADING("//XCUIElementTypeStaticText[@value='FAQ']"),
    XPATH_MOBILE_NUMBER_FIELD("//XCUIElementTypeStaticText[contains(@value,'Call')]"),
    XPATH_AGENTS_DISTANCE_IN_TABLE("//XCUIElementTypeOther[@name='Agents']/following-sibling::XCUIElementTypeCell//XCUIElementTypeStaticText[contains(@value,'KMs')]"),
    XPATH_AGENT_NAME_IN_TABLE("//XCUIElementTypeOther[@name='Agents']/following-sibling::XCUIElementTypeCell//XCUIElementTypeStaticText[1]"),
    XPATH_AGENTS_IN_LIST_VIEW("//XCUIElementTypeTable/XCUIElementTypeCell//XCUIElementTypeStaticText[contains(@value,'KMs')]"),
    XPATH_AGENTS_NAME_IN_LIST_VIEW("//XCUIElementTypeImage/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeStaticText[1]"),
    XPATH_MERCHANT_NAME_IN_TABLE("//XCUIElementTypeOther[@name='Merchants']/following-sibling::XCUIElementTypeCell//XCUIElementTypeStaticText[1]"),
    XPATH_MERCHANTS_DISTANCE_IN_TABLE("//XCUIElementTypeOther[@name='Merchants']/following-sibling::XCUIElementTypeCell//XCUIElementTypeStaticText[contains(@value,'KMs')]"),
    XPATH_MERCHANTS_IN_LIST_VIEW("//XCUIElementTypeTable/XCUIElementTypeCell//XCUIElementTypeStaticText[contains(@value,'KMs')]"),
    XPATH_MERCHANTS_NAME_IN_LIST_VIEW("//XCUIElementTypeImage/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeStaticText[1]"),
    XPATH_BANK_ADD_NEW_BUTTON("//XCUIElementTypeStaticText[@name='Saved bank accounts']/following-sibling::XCUIElementTypeButton[@name='Add new']"),
    XPATH_BOTTOM_NAVIGATION_OPTION_START("//XCUIElementTypeButton[@name='"),
    XPATH_BOTTOM_NAVIGATION_OPTION_END("']"),
    XPATH_PROFILE_OPTION_START("//XCUIElementTypeStaticText[@value='"),
    XPATH_PROFILE_OPTION_END("']"),
    XPATH_SAVED_BANK_START("//XCUIElementTypeCell//XCUIElementTypeStaticText[@name='"),
    XPATH_SAVED_BANK_END("']"),
    XPATH_BANK_DELETE_BUTTON("//XCUIElementTypeButton[@name='Delete']"),
    XPATH_TRANSFER_ENTITY("//XCUIElementTypeStaticText[@value='Transfer']"),
    XPATH_RESEND_BUTTON("//XCUIElementTypeButton[@name='Resend']"),
    XPATH_TABLE_LOADER("//XCUIElementTypeTable[@name='Empty list']"),
    XPATH_CARD_ADD_NEW_BUTTON("//XCUIElementTypeOther[@name='Saved cards']//XCUIElementTypeButton[@name='Add new']"),
    XPATH_SAVED_CARD_START("//XCUIElementTypeStaticText[contains(@value,'****')]/following-sibling::XCUIElementTypeStaticText[not(@name='"),
    XPATH_SAVED_CARD_END("')]"),
    XPATH_CARD_DELETE_BUTTON("//XCUIElementTypeButton[@name='Delete']"),
    XPATH_EXPANDABLE_BUTTON_START("//XCUIElementTypeStaticText[@value='"),
    XPATH_EXPANDABLE_BUTTON_END("']"),
    XPATH_NAVIGATION_OPTION_START("//XCUIElementTypeStaticText[@value='"),
    XPATH_NAVIGATION_OPTION_END("']");

    private String pageVariables;

    private DashboardPageEnumIOS(String pageVariables) {
        this.pageVariables = pageVariables;
    }

    public String getValue() {
        return this.pageVariables;
    }
}
