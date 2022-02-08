package com.study.ocp.day09;

public class USCurrencyFactory {

	public static void main(String[] args) {
		// 製造 5 美分的硬幣
//		USCurrency usCoin = new USCurrency(5);
		USCurrency usCoin = USCurrency.NICKLE;
		// 驗證 enum 被 setValue() 給改變，使 enum 沒有防呆功能
		usCoin.setValue(50); 
		System.out.println(usCoin.getValue());
		System.out.println(usCoin.getValue());
	}
}
