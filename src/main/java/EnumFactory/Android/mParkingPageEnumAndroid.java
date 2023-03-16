package EnumFactory.Android;

public enum mParkingPageEnumAndroid {

    XPATH_PLATE_NUMBER_FIELD("//android.widget.EditText[@text='Plate number']"),
    XPATH_DURATION_HOUR_START("//android.widget.TextView[@resource-id='com.etisalat.ewallet:id/tv_amount' and contains(@text,'"),
    XPATH_DURATION_HOUR_END("')]"),
    XPATH_CITY_LIST_START("//android.widget.TextView[@resource-id='com.etisalat.ewallet:id/tv_mparking_type' and @text='"),
    XPATH_CITY_LIST_END("']"),
    XPATH_PARKING_ZONE_FIELD("//android.widget.EditText[@text='Parking zone']"),
    XPATH_LICENSE_PLATE_SOURCE_FIELD("//android.widget.LinearLayout[@resource-id='com.etisalat.ewallet:id/til_license_plate_source']"),
    XPATH_LICENSE_PLATE_SOURCE_VALUE_START("//android.widget.TextView[@text='"),
    XPATH_LICENSE_PLATE_SOURCE_VALUE_END("']"),
    XPATH_PAY_PARKING_BUTTON("//android.widget.TextView[@resource-id='com.etisalat.ewallet:id/btn_pay']");


    private String pageVariables;

    private mParkingPageEnumAndroid(String pageVariables) {
        this.pageVariables = pageVariables;
    }

    public String getValue() {
        return this.pageVariables;
    }
}
