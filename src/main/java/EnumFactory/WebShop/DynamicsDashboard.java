package EnumFactory.WebShop;

public enum DynamicsDashboard {
    XPATH_SALES_ORDER("//span[contains(text(),'Sales order processing and inquiry')]");
    private String pageVariables;
    private DynamicsDashboard(String pageVariables) {

        this.pageVariables = pageVariables;
    }

    public String getValue() {
        return this.pageVariables;
    }

    public String getPageVariables(){return this.pageVariables;}
}
