package com.shopify.model;

public class ShopifySdkParam {

	private String queryParameter;
	private String value;

	public ShopifySdkParam() {
	}

	public ShopifySdkParam(final String queryParameter, final String value) {
		this.queryParameter = queryParameter;
		this.value = value;
	}

	public String getQueryParameter() {
		return queryParameter;
	}

	public void setQueryParameter(String queryParameter) {
		this.queryParameter = queryParameter;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}
