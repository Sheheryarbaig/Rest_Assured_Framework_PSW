package EnumFactory.WebShop;

public enum SalesOrder {
    XPATH_SALES_ORDER_HEADING("//h1//span[contains(text(),'Sales order processing and inquiry')]"),
    XPATH_SALES_ORDER_SEARCH_BOX("//input[@name='QuickFilter_Input']"),
    XPATH_SALES_ORDER_AUTO_COMPLETE_LIST("(//li[@class='quickFilter-listItem flyout-menuItem'])[1]"),
    XPATH_SALES_ORDER_BOX("//div[@id='SalesOrdersWithRecentlyChangedDatesPart_3_MCROrderEventTable_SalesId_input']");
    private String pageVariables;
    private SalesOrder(String pageVariables) {

        this.pageVariables = pageVariables;
    }

    public String getValue() {
        return this.pageVariables;
    }

    public String getPageVariables(){return this.pageVariables;}
}
