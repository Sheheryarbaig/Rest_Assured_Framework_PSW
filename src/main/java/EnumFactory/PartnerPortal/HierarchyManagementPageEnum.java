package EnumFactory.PartnerPortal;

public enum HierarchyManagementPageEnum {

    XPATH_HIERARCHY_MANAGEMENT_HEADING("//h1[text()='Hierarchy Management']"),
    XPATH_NODE_NAME_START("//mat-tree-node//a[text()='"),
    XPATH_NODE_NAME_END("']"),
    XPATH_NODE_CSS_START("//a[text()='"),
    XPATH_NODE_CSS_END("']/ancestor::mat-tree-node"),
    XPATH_REGISTER_BRANCH_BUTTON("//button[text()='Register Branch']"),
    XPATH_TEXT_FIELD_START("//input[@ng-reflect-placeholder='"),
    XPATH_TEXT_FIELD_END("']"),
    XPATH_DROPDOWN_FIELD_START("//mat-select//span[text()='"),
    XPATH_DROPDOWN_FIELD_END("']"),
    XPATH_DROPDOWN_VALUE_START("//mat-option[@ng-reflect-value='"),
    XPATH_DROPDOWN_VALUE_END("']"),
    XPATH_FILE_UPLOAD_FIELD_START("//input[@id='"),
    XPATH_FILE_UPLOAD_FIELD_END("']"),
    XPATH_REGISTER_BUTTON("//button[@ng-reflect-disabled='false']/span[text()='Register' or text()='Register ']"),
    XPATH_NODE_DROPDOWN_START("//a[text()='"),
    XPATH_NODE_DROPDOWN_END("']/preceding-sibling::button"),
    XPATH_IDENTIFICATION_NUMBER_ALTERNATE("(//input[@id='identificationNumber'])[2]"),
    XPATH_REGISTER_EMPLOYEE_BUTTON("//button[text()='Register Employee']"),
    XPATH_REGISTER_TILL_BUTTON("//button[text()='Register Till']"),
    XPATH_REMOVE_BUTTON("//button[text()='Remove']"),
    XPATH_UNDER_NODE("//following::mat-tree-node/a"),
    XPATH_UNDER_NODE_CHECK("//following::mat-tree-node"),
    XPATH_BLOCK_BUTTON("//button[text()='Block']"),
    XPATH_UNBLOCK_BUTTON("//button[text()='Un Block']"),
    XPATH_UPDATE_BUTTON("//button[text()='Update']"),
    XPATH_FIELD_UPDATE_BUTTON_START("(//input[@ng-reflect-placeholder='"),
    XPATH_FIELD_UPDATE_BUTTON_END("']/following::button//span[text()='Update'])[1]"),
    XPATH_NAME_VALUE("(//div[contains(text(),'Name:')]/label)[1]");

    private String pageVariables;

    private HierarchyManagementPageEnum(String pageVariables) {
        this.pageVariables = pageVariables;
    }

    public String getValue() {
        return this.pageVariables;
    }
}
