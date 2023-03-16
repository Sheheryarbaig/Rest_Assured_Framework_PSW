package com.cucumber.Enums;

import UtilitiesFactory.PropertyLoaderFactory;

public enum APIEnumVariables {

	BUILD_NUMBER("");

    private String enumVariable;

	private APIEnumVariables(String enumVariable)
	{
		this.enumVariable = enumVariable;
	}

	public String getValue()
	{
		return this.enumVariable;
	}

	static {
	    try {
	    	String dataFile = "run.properties";
			BUILD_NUMBER.enumVariable = new PropertyLoaderFactory().getPropertyFile(dataFile).getProperty("api.build.number");
			} catch (Exception e) {

            e.printStackTrace();
        }
    }
}
