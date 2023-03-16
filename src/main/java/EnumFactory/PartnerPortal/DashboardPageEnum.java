package EnumFactory.PartnerPortal;

public enum DashboardPageEnum {

    XPATH_NAVIGATION_OPTION_START("//*[@class='tile ng-star-inserted' and text()='"),
    XPATH_NAVIGATION_OPTION_END("']"),
    XPATH_NAVIGATION_START_OPTION_START("//*[@class='tile ng-star-inserted' and text()='"),
    XPATH_NAVIGATION_START_OPTION_END("']//a[text()='Start']"),
    XPATH_YES_BUTTON("//button/span[text()='Yes']"),
    XPATH_CLOSE_BUTTON("//button/span[text()='Close']"),
    XPATH_OK_BUTTON("//button/span[text()='ok']"),
    XPATH_WAIT("//div[@id='loaderM']");

    private String pageVariables;

    private DashboardPageEnum(String pageVariables) {
        this.pageVariables = pageVariables;
    }

    public String getValue() {
        return this.pageVariables;
    }
}
