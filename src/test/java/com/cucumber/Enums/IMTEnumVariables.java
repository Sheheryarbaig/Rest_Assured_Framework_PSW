package com.cucumber.Enums;

import UtilitiesFactory.PropertyLoaderFactory;

public enum IMTEnumVariables {

	IMT_TRANSACTION_FEE(""),
	IMT_VAT(""),
	IMT_CASH_PICKUP(""),
	IMT_SEND_TO_BANK(""),
	IMT_SEND_TO_MOBILE_WALLET(""),
	IMT_PAKISTAN(""),
	IMT_GHANA(""),
	IMT_PHILIPPINES(""),
	RECEIVER_FIRST_NAME_FIELD(""),
	RECEIVER_FIRST_NAME_WITHOUT_SLASH_FIELD(""),
	RECEIVER_LAST_NAME_WITHOUT_SLASH_FIELD(""),
	RECEIVER_LAST_NAME_FIELD(""),
	SENDER_OCCUPATION_FIELD(""),
	PURPOSE_OF_TRANSACTION_FIELD(""),
	SOURCE_OF_FUNDS_FIELD(""),
	RELATIONSHIP_TO_RECEIVER_FIELD(""),
	ACCOUNT_NUMBER_FIELD(""),
	BANK_NAME_FIELD(""),
	MOBILE_WALLET_FIELD(""),
	MOBILE_WALLET_FIELD_WU(""),
	RECEIVER_WALLET_NUMBER_FIELD(""),
	RECEIVER_MOBILE_NUMBER_FIELD(""),
	PURPOSE_OF_REMITTANCE_FIELD(""),
	SENDER_OCCUPATION_VALUE(""),
	PURPOSE_OF_TRANSACTION_VALUE(""),
	SOURCE_OF_FUNDS_VALUE(""),
	RELATIONSHIP_TO_RECEIVER_VALUE(""),
	BANK_NAME_VALUE(""),
	BANK_NAME_VALUE_WU(""),
	BANK_ACCOUNT_NUMBER_VALUE(""),
	MOBILE_WALLET_VALUE(""),
	MOBILE_WALLET_VALUE_WU(""),
	RECEIVER_WALLET_NUMBER_VALUE(""),
	RECEIVER_MOBILE_NUMBER_VALUE(""),
	PURPOSE_OF_REMITTANCE_VALUE(""),
	SUCCESSFUL_IMT_TRANSFER_MSG("");

    private String enumVariable;

	private IMTEnumVariables(String enumVariable)
	{
		this.enumVariable = enumVariable;
	}

	public String getValue()
	{
		return this.enumVariable;
	}

	static {
	    try {
	    	String dataFile = "imtData.properties";

			IMT_TRANSACTION_FEE.enumVariable = new PropertyLoaderFactory().getPropertyFile(dataFile).getProperty("imt.transaction.fee");
			IMT_VAT.enumVariable = new PropertyLoaderFactory().getPropertyFile(dataFile).getProperty("imt.vat");
			IMT_CASH_PICKUP.enumVariable = new PropertyLoaderFactory().getPropertyFile(dataFile).getProperty("imt.cash.pickup.option");
			IMT_SEND_TO_BANK.enumVariable = new PropertyLoaderFactory().getPropertyFile(dataFile).getProperty("imt.send.to.bank.option");
			IMT_SEND_TO_MOBILE_WALLET.enumVariable = new PropertyLoaderFactory().getPropertyFile(dataFile).getProperty("imt.send.to.mobile.wallet.option");
			IMT_PAKISTAN.enumVariable = new PropertyLoaderFactory().getPropertyFile(dataFile).getProperty("imt.country.pakistan");
			IMT_GHANA.enumVariable = new PropertyLoaderFactory().getPropertyFile(dataFile).getProperty("imt.country.ghana");
			IMT_PHILIPPINES.enumVariable = new PropertyLoaderFactory().getPropertyFile(dataFile).getProperty("imt.country.philippines");
			RECEIVER_FIRST_NAME_FIELD.enumVariable = new PropertyLoaderFactory().getPropertyFile(dataFile).getProperty("receiver.first.name.field");
			RECEIVER_FIRST_NAME_WITHOUT_SLASH_FIELD.enumVariable = new PropertyLoaderFactory().getPropertyFile(dataFile).getProperty("receiver.first.name.without.slash.field");
			RECEIVER_LAST_NAME_FIELD.enumVariable = new PropertyLoaderFactory().getPropertyFile(dataFile).getProperty("receiver.last.name.field");
			RECEIVER_LAST_NAME_WITHOUT_SLASH_FIELD.enumVariable = new PropertyLoaderFactory().getPropertyFile(dataFile).getProperty("receiver.last.name.without.slash.field");
			SENDER_OCCUPATION_FIELD.enumVariable = new PropertyLoaderFactory().getPropertyFile(dataFile).getProperty("sender.occupation.field");
			PURPOSE_OF_TRANSACTION_FIELD.enumVariable = new PropertyLoaderFactory().getPropertyFile(dataFile).getProperty("purpose.of.transaction.field");
			SOURCE_OF_FUNDS_FIELD.enumVariable = new PropertyLoaderFactory().getPropertyFile(dataFile).getProperty("source.of.funds.field");
			RELATIONSHIP_TO_RECEIVER_FIELD.enumVariable = new PropertyLoaderFactory().getPropertyFile(dataFile).getProperty("relationship.to.receiver.field");
			ACCOUNT_NUMBER_FIELD.enumVariable = new PropertyLoaderFactory().getPropertyFile(dataFile).getProperty("account.number.field");
			BANK_NAME_FIELD.enumVariable = new PropertyLoaderFactory().getPropertyFile(dataFile).getProperty("bank.name.field");
			MOBILE_WALLET_FIELD.enumVariable = new PropertyLoaderFactory().getPropertyFile(dataFile).getProperty("mobile.wallet.field");
			MOBILE_WALLET_FIELD_WU.enumVariable = new PropertyLoaderFactory().getPropertyFile(dataFile).getProperty("mobile.wallet.field.wu");
			RECEIVER_WALLET_NUMBER_FIELD.enumVariable = new PropertyLoaderFactory().getPropertyFile(dataFile).getProperty("receiver.wallet.number.field");
			RECEIVER_MOBILE_NUMBER_FIELD.enumVariable = new PropertyLoaderFactory().getPropertyFile(dataFile).getProperty("receiver.mobile.number.field");
			PURPOSE_OF_REMITTANCE_FIELD.enumVariable = new PropertyLoaderFactory().getPropertyFile(dataFile).getProperty("purpose.of.remittance.field");
			SENDER_OCCUPATION_VALUE.enumVariable = new PropertyLoaderFactory().getPropertyFile(dataFile).getProperty("sender.occupation.value");
			PURPOSE_OF_TRANSACTION_VALUE.enumVariable = new PropertyLoaderFactory().getPropertyFile(dataFile).getProperty("purpose.of.transaction.value");
			SOURCE_OF_FUNDS_VALUE.enumVariable = new PropertyLoaderFactory().getPropertyFile(dataFile).getProperty("source.of.funds.value");
			RELATIONSHIP_TO_RECEIVER_VALUE.enumVariable = new PropertyLoaderFactory().getPropertyFile(dataFile).getProperty("relationship.to.receiver.value");
			BANK_NAME_VALUE.enumVariable = new PropertyLoaderFactory().getPropertyFile(dataFile).getProperty("bank.name.value");
			BANK_NAME_VALUE_WU.enumVariable = new PropertyLoaderFactory().getPropertyFile(dataFile).getProperty("bank.name.value.wu");
			BANK_ACCOUNT_NUMBER_VALUE.enumVariable = new PropertyLoaderFactory().getPropertyFile(dataFile).getProperty("account.number.value");
			MOBILE_WALLET_VALUE.enumVariable = new PropertyLoaderFactory().getPropertyFile(dataFile).getProperty("mobile.wallet.value");
			MOBILE_WALLET_VALUE_WU.enumVariable = new PropertyLoaderFactory().getPropertyFile(dataFile).getProperty("mobile.wallet.value.wu");
			RECEIVER_WALLET_NUMBER_VALUE.enumVariable = new PropertyLoaderFactory().getPropertyFile(dataFile).getProperty("receiver.wallet.number.value");
			RECEIVER_MOBILE_NUMBER_VALUE.enumVariable = new PropertyLoaderFactory().getPropertyFile(dataFile).getProperty("receiver.mobile.number.value");
			PURPOSE_OF_REMITTANCE_VALUE.enumVariable = new PropertyLoaderFactory().getPropertyFile(dataFile).getProperty("purpose.of.remittance.value");
			SUCCESSFUL_IMT_TRANSFER_MSG.enumVariable = new PropertyLoaderFactory().getPropertyFile(dataFile).getProperty("successful.imt.transfer.msg");
		} catch (Exception e) {

            e.printStackTrace();
        }
    }
}
