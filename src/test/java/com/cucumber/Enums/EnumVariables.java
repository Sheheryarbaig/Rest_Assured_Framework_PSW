package com.cucumber.Enums;

import UtilitiesFactory.PropertyLoaderFactory;

public enum EnumVariables {

	SAVED_CARD(""),
	SUCCESSFUL_CASH_GIFT_MSG(""),
	SUCCESSFUL_ADD_MONEY_MSG(""),
	SUCCESSFUL_VOUCHER_PURCHASE_MSG(""),
	SUCCESSFUL_ADD_ACCOUNT_MSG(""),
	SUCCESSFUL_DELETE_ACCOUNT_MSG(""),
	SUCCESSFUL_DIRECT_PAY_TRANSFER_MSG(""),
	CONTACT_US_MOBILE_NUMBER(""),
	PAYMENT_MACHINES_TEXT(""),
	SEND_MONEY_FEE(""),
	SEND_MONEY_VAT(""),
	SUCCESSFUL_SEND_MONEY_AGENT_MSG(""),
	SUCCESSFUL_TOP_UP_ETISALAT_MSG(""),
	SUCCESSFUL_TOP_UP_DU_MSG(""),
	SUCCESSFUL_TOP_UP_NATIONAL_BOND_MSG(""),
	SUCCESSFUL_TOP_UP_SALIK_MSG(""),
	SUCCESSFUL_PAY_BILLS_AJMAN_MSG(""),
	SEND_TO_BANK_VAT(""),
	SEND_TO_BANK_FEE(""),
	SUCCESSFUL_SEND_TO_BANK_MSG(""),
	SUCCESSFUL_ADD_MONEY_FROM_BANK_MSG(""),
	SUCCESSFUL_LINKED_BANK_MSG(""),
	SUCCESSFUL_UNLINKED_BANK_MSG(""),
	SUCCESSFUL_LINKED_CARD_MSG(""),
	SUCCESSFUL_UNLINKED_CARD_MSG(""),
	SUCCESSFUL_TRANSFER_MSG(""),
	SUCCESSFUL_PAY_BILLS_ADDC_MSG(""),
	SUCCESSFUL_PAY_BILLS_AADC_MSG(""),
	UPGRADE_ACCOUNT_FLOW_MSG(""),
	SUCCESSFUL_INVITE_MSG(""),
	ALREADY_REGISTERED_INVITE_MSG(""),
	SUCCESSFUL_REQUEST_MONEY_MSG("");

    private String enumVariable;

	private EnumVariables(String enumVariable)
	{
		this.enumVariable = enumVariable;
	}

	public String getValue()
	{
		return this.enumVariable;
	}

	static {
	    try {
	    	String dataFile = "testData.properties";

			SAVED_CARD.enumVariable = new PropertyLoaderFactory().getPropertyFile(dataFile).getProperty("saved.card");
			SUCCESSFUL_CASH_GIFT_MSG.enumVariable = new PropertyLoaderFactory().getPropertyFile(dataFile).getProperty("successful.cash.gift");
			SUCCESSFUL_ADD_MONEY_MSG.enumVariable = new PropertyLoaderFactory().getPropertyFile(dataFile).getProperty("successful.add.money");
			SUCCESSFUL_VOUCHER_PURCHASE_MSG.enumVariable = new PropertyLoaderFactory().getPropertyFile(dataFile).getProperty("successful.voucher.purchase");
			SUCCESSFUL_ADD_ACCOUNT_MSG.enumVariable = new PropertyLoaderFactory().getPropertyFile(dataFile).getProperty("successful.add.account");
			SUCCESSFUL_DELETE_ACCOUNT_MSG.enumVariable = new PropertyLoaderFactory().getPropertyFile(dataFile).getProperty("successful.delete.account");
			SUCCESSFUL_DIRECT_PAY_TRANSFER_MSG.enumVariable = new PropertyLoaderFactory().getPropertyFile(dataFile).getProperty("successful.direct.pay.transfer");
			CONTACT_US_MOBILE_NUMBER.enumVariable = new PropertyLoaderFactory().getPropertyFile(dataFile).getProperty("contact.us.number");
			PAYMENT_MACHINES_TEXT.enumVariable = new PropertyLoaderFactory().getPropertyFile(dataFile).getProperty("payment.machines.steps");
			SEND_MONEY_FEE.enumVariable = new PropertyLoaderFactory().getPropertyFile(dataFile).getProperty("send.money.fee");
			SEND_MONEY_VAT.enumVariable = new PropertyLoaderFactory().getPropertyFile(dataFile).getProperty("send.money.vat");
			SUCCESSFUL_SEND_MONEY_AGENT_MSG.enumVariable = new PropertyLoaderFactory().getPropertyFile(dataFile).getProperty("successful.send.money.agent");
			SUCCESSFUL_TOP_UP_ETISALAT_MSG.enumVariable = new PropertyLoaderFactory().getPropertyFile(dataFile).getProperty("successful.top.up.etisalat");
			SUCCESSFUL_TOP_UP_DU_MSG.enumVariable = new PropertyLoaderFactory().getPropertyFile(dataFile).getProperty("successful.top.up.du");
			SUCCESSFUL_TOP_UP_NATIONAL_BOND_MSG.enumVariable = new PropertyLoaderFactory().getPropertyFile(dataFile).getProperty("successful.top.up.national.bond");
			SUCCESSFUL_TOP_UP_SALIK_MSG.enumVariable = new PropertyLoaderFactory().getPropertyFile(dataFile).getProperty("successful.top.up.salik");
			SUCCESSFUL_PAY_BILLS_AJMAN_MSG.enumVariable = new PropertyLoaderFactory().getPropertyFile(dataFile).getProperty("successful.pay.bills.ajman");
			SEND_TO_BANK_VAT.enumVariable = new PropertyLoaderFactory().getPropertyFile(dataFile).getProperty("successful.send.to.bank.vat");
			SEND_TO_BANK_FEE.enumVariable = new PropertyLoaderFactory().getPropertyFile(dataFile).getProperty("successful.send.to.bank.fee");
			SUCCESSFUL_SEND_TO_BANK_MSG.enumVariable = new PropertyLoaderFactory().getPropertyFile(dataFile).getProperty("successful.send.to.bank.msg");
			SUCCESSFUL_ADD_MONEY_FROM_BANK_MSG.enumVariable = new PropertyLoaderFactory().getPropertyFile(dataFile).getProperty("successful.add.money.from.bank.msg");
			SUCCESSFUL_LINKED_BANK_MSG.enumVariable = new PropertyLoaderFactory().getPropertyFile(dataFile).getProperty("successful.linked.bank.msg");
			SUCCESSFUL_UNLINKED_BANK_MSG.enumVariable = new PropertyLoaderFactory().getPropertyFile(dataFile).getProperty("successful.unlinked.bank.msg");
			SUCCESSFUL_LINKED_CARD_MSG.enumVariable = new PropertyLoaderFactory().getPropertyFile(dataFile).getProperty("successful.linked.card.msg");
			SUCCESSFUL_UNLINKED_CARD_MSG.enumVariable = new PropertyLoaderFactory().getPropertyFile(dataFile).getProperty("successful.unlinked.card.msg");
			SUCCESSFUL_TRANSFER_MSG.enumVariable = new PropertyLoaderFactory().getPropertyFile(dataFile).getProperty("successful.transfer.msg");
			SUCCESSFUL_PAY_BILLS_ADDC_MSG.enumVariable = new PropertyLoaderFactory().getPropertyFile(dataFile).getProperty("successful.pay.bills.addc.msg");
			SUCCESSFUL_PAY_BILLS_AADC_MSG.enumVariable = new PropertyLoaderFactory().getPropertyFile(dataFile).getProperty("successful.pay.bills.aadc.msg");
			UPGRADE_ACCOUNT_FLOW_MSG.enumVariable = new PropertyLoaderFactory().getPropertyFile(dataFile).getProperty("upgrade.account.flow.msg");
			SUCCESSFUL_INVITE_MSG.enumVariable = new PropertyLoaderFactory().getPropertyFile(dataFile).getProperty("successful.invite.msg");
			ALREADY_REGISTERED_INVITE_MSG.enumVariable = new PropertyLoaderFactory().getPropertyFile(dataFile).getProperty("already.registered.invite.msg");
			SUCCESSFUL_REQUEST_MONEY_MSG.enumVariable = new PropertyLoaderFactory().getPropertyFile(dataFile).getProperty("successful.request.money.msg");
			} catch (Exception e) {

            e.printStackTrace();
        }
    }
}
