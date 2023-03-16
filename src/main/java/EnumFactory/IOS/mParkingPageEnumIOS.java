package EnumFactory.IOS;

public enum mParkingPageEnumIOS {

    XPATH_PLATE_NUMBER_FIELD("//XCUIElementTypeTextField[@value='Plate number']"),
    XPATH_DURATION_HOUR_START("//XCUIElementTypeStaticText[contains(@name,'Hour')]/preceding-sibling::XCUIElementTypeStaticText[@name='"),
    XPATH_DURATION_HOUR_END("']"),
    XPATH_CITY_LIST_START("//XCUIElementTypeStaticText[@name='"),
    XPATH_CITY_LIST_END("']"),
    XPATH_PARKING_ZONE_FIELD("//XCUIElementTypeTextField[@value='Parking Zone']"),
    XPATH_LICENSE_PLATE_SOURCE_FIELD("//XCUIElementTypeTextField[@value='Select']"),
    XPATH_PAY_PARKING_BUTTON("//XCUIElementTypeButton[@name='Pay parking']");

    private String pageVariables;

    private mParkingPageEnumIOS(String pageVariables) {
        this.pageVariables = pageVariables;
    }

    public String getValue() {
        return this.pageVariables;
    }
}
