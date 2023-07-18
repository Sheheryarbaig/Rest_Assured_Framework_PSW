package EnumFactory.WebShop;

public enum OnlineStoreTransaction {

    XPATH_DATE_FILTER("//div[@class='dyn-headerCell _8y6pgc isFilterable isFiltered']"),
    XPATH_CLEAR("(//span[contains(text(),'Clear')])"),
    XPATH_CHANNEL_REFERENCE_ID("//div[@class='dyn-headerCell _edgl5a isFilterable']//div"),
    XPATH_CHANNEL_REFERENCE_SEARCH("(//input[@class='textbox field displayoption viewMarker alignmentLeft'])[12]"),
    XPATH_APPLY("(//span[contains(text(),'Apply')])[2]"),
    XPATH_SALES_ORDER_NUMBER("(//div[@class='dyn-container _1xz16d8']//input)[3]"),
    XPATH_SYNCHRONIZE_ORDER("//span[contains(text(),'Synchronize order')]"),
    XPATH_REFRESH("//span[contains(@class,'button-commandRing Refresh-symbol')]"),
    XPATH_SALES_ORDER_ID("(//div[@class='viewModeTextControl-link field viewMarker textbox alignmentLeft link-content-validLink'])[1]");
    private String pageVariables;
    private OnlineStoreTransaction(String pageVariables) {

        this.pageVariables = pageVariables;
    }

    public String getValue() {
        return this.pageVariables;
    }

    public String getPageVariables(){return this.pageVariables;}
}
