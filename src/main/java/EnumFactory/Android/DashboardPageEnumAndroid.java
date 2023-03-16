package EnumFactory.Android;

public enum DashboardPageEnumAndroid {

    XPATH_WALLET_BALANCE("//android.widget.TextView[@resource-id='com.etisalat.ewallet:id/tvBalanceAmount']"),
    XPATH_LOGOUT_BUTTON("//android.widget.Button[@resource-id='com.etisalat.ewallet:id/tv_logout']"),
    XPATH_ADD_MONEY_BUTTON("//androidx.appcompat.widget.LinearLayoutCompat[@resource-id='com.etisalat.ewallet:id/tvAddMoney']"),
    XPATH_SEND_MONEY_BUTTON("//androidx.appcompat.widget.LinearLayoutCompat[@resource-id='com.etisalat.ewallet:id/tvSendMoney']"),
    XPATH_BALANCE_CARD("//android.view.ViewGroup[@resource-id='com.etisalat.ewallet:id/cl_wallet_balance']"),
    XPATH_TRANSACTION_HISTORY_HEADING("//android.widget.TextView[@resource-id='com.etisalat.ewallet:id/tvMoneyTransfer' and @text='Transaction history']"),
    XPATH_PROMOTION_BANNER("//android.widget.ImageView[@resource-id='com.etisalat.ewallet:id/iv_icon']"),
    XPATH_AGENT_LISTING("//androidx.recyclerview.widget.RecyclerView[@resource-id='com.etisalat.ewallet:id/rvAgents']"),
    XPATH_MERCHANT_LISTING("//androidx.recyclerview.widget.RecyclerView[@resource-id='com.etisalat.ewallet:id/rvMerchants']"),
    XPATH_LIST_VIEW_TAB("//*[@content-desc='LIST VIEW']"),
    XPATH_MAP_VIEW_TAB("//*[@content-desc='MAP VIEW']"),
    XPATH_AGENT_VIEW_ALL_BUTTON("//android.widget.TextView[@resource-id='com.etisalat.ewallet:id/tvAgentsViewAll']"),
    XPATH_MERCHANTS_VIEW_ALL_BUTTON("//android.widget.TextView[@resource-id='com.etisalat.ewallet:id/tvMerchantsViewAll']"),
    XPATH_WALLET_HEADING("//android.widget.TextView[@resource-id='com.etisalat.ewallet:id/toolbar_title' and @text='Wallet']"),
    XPATH_SAVED_CARDS_HEADING("//android.widget.TextView[@resource-id='com.etisalat.ewallet:id/tv_saved_cards']"),
    XPATH_SAVED_BANKS_HEADING("//android.widget.TextView[@resource-id='com.etisalat.ewallet:id/tv_saved_bank_cards']"),
    XPATH_PROFILE_HEADING("//android.widget.TextView[@resource-id='com.etisalat.ewallet:id/toolbar_title' and @text='Profile']"),
    XPATH_MY_DOCUMENTS_HEADING("//android.widget.TextView[@text='My Documents']"),
    XPATH_BANK_ACCOUNTS_HEADING("//android.widget.TextView[@text='Bank accounts']"),
    XPATH_ACCOUNT_ACCESS_HEADING("//android.widget.TextView[@text='Account Access']"),
    XPATH_IMT_HEADING("//android.widget.TextView[@text='Intl. Remittance Beneficiaries']"),
    XPATH_DIRECT_PAY_HEADING("//android.widget.TextView[@text='Direct Pay']"),
    XPATH_SERVICES_AND_UTILITIES_HEADING("//android.widget.TextView[@text='Services & Utilities']"),
    XPATH_FAQ_HEADING("//android.widget.TextView[@text='FAQs']"),
    XPATH_MOBILE_NUMBER_FIELD("//android.widget.EditText[@resource-id='com.samsung.android.dialer:id/digits']"),
    XPATH_AGENTS_DISTANCE_IN_TABLE("//androidx.recyclerview.widget.RecyclerView[@resource-id='com.etisalat.ewallet:id/rvAgents']//android.widget.TextView[@resource-id='com.etisalat.ewallet:id/tvDistance']"),
    XPATH_AGENT_NAME_IN_TABLE("//androidx.recyclerview.widget.RecyclerView[@resource-id='com.etisalat.ewallet:id/rvAgents']//android.widget.TextView[@resource-id='com.etisalat.ewallet:id/tvName']"),
    XPATH_AGENTS_IN_LIST_VIEW("//android.widget.TextView[@resource-id='com.etisalat.ewallet:id/tv_distance']"),
    XPATH_AGENTS_NAME_IN_LIST_VIEW("//android.widget.TextView[@resource-id='com.etisalat.ewallet:id/tv_name']"),
    XPATH_MERCHANT_NAME_IN_TABLE("//androidx.recyclerview.widget.RecyclerView[@resource-id='com.etisalat.ewallet:id/rvMerchants']//android.widget.TextView[@resource-id='com.etisalat.ewallet:id/tvName']"),
    XPATH_MERCHANTS_DISTANCE_IN_TABLE("//androidx.recyclerview.widget.RecyclerView[@resource-id='com.etisalat.ewallet:id/rvMerchants']//android.widget.TextView[@resource-id='com.etisalat.ewallet:id/tvDistance']"),
    XPATH_MERCHANTS_IN_LIST_VIEW("//android.widget.TextView[@resource-id='com.etisalat.ewallet:id/tv_distance']"),
    XPATH_MERCHANTS_NAME_IN_LIST_VIEW("//android.widget.TextView[@resource-id='com.etisalat.ewallet:id/tv_name']"),
    XPATH_BANK_ADD_NEW_BUTTON("//android.widget.TextView[@resource-id='com.etisalat.ewallet:id/tv_add_bank_card']"),
    XPATH_BOTTOM_NAVIGATION_OPTION_START("//android.widget.TextView[@resource-id='com.etisalat.ewallet:id/smallLabel' and @text='"),
    XPATH_BOTTOM_NAVIGATION_OPTION_END("']"),
    XPATH_PROFILE_OPTION_START("//android.widget.TextView[@text='"),
    XPATH_PROFILE_OPTION_END("']"),
    XPATH_SAVED_BANK_START("//android.widget.TextView[@resource-id='com.etisalat.ewallet:id/tv_card_title' and @text='"),
    XPATH_SAVED_BANK_END("']"),
    XPATH_BANK_DELETE_BUTTON("//androidx.recyclerview.widget.RecyclerView[@resource-id='com.etisalat.ewallet:id/rv_saved_bank_cards']//android.widget.TextView[@text='Delete']"),
    XPATH_TRANSFER_ENTITY("//android.widget.TextView[@resource-id='com.etisalat.ewallet:id/tv_transaction_title' and @text='Transfer']"),
    XPATH_RESEND_BUTTON("//android.widget.Button[@resource-id='com.etisalat.ewallet:id/btn_resend']"),
    XPATH_TABLE_LOADER("//android.widget.ProgressBar[@resource-id='com.etisalat.ewallet:id/spin_kit']"),
    XPATH_CARD_ADD_NEW_BUTTON("//android.widget.TextView[@resource-id='com.etisalat.ewallet:id/tv_add_card']"),
    XPATH_SAVED_CARD_START("//androidx.recyclerview.widget.RecyclerView[@resource-id='com.etisalat.ewallet:id/rv_saved_cards']//android.widget.TextView[@resource-id='com.etisalat.ewallet:id/tv_card_title' and not(@text='"),
    XPATH_SAVED_CARD_END("')]"),
    XPATH_CARD_DELETE_BUTTON("//androidx.recyclerview.widget.RecyclerView[@resource-id='com.etisalat.ewallet:id/rv_saved_cards']//android.widget.TextView[@text='Delete']"),
    XPATH_EXPANDABLE_BUTTON_START("//android.widget.Button[@resource-id='com.etisalat.ewallet:id/btn_show' and @text='"),
    XPATH_EXPANDABLE_BUTTON_END("']"),
    XPATH_NAVIGATION_OPTION_START("//android.widget.TextView[@resource-id='com.etisalat.ewallet:id/tvPayBill' and @text='"),
    XPATH_NAVIGATION_OPTION_END("']/preceding-sibling::android.widget.ImageView[@resource-id='com.etisalat.ewallet:id/ivPayBill']");

    private String pageVariables;

    private DashboardPageEnumAndroid(String pageVariables) {
        this.pageVariables = pageVariables;
    }

    public String getValue() {
        return this.pageVariables;
    }
}
