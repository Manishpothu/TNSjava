package com.tns.Interface;

public class InterfaceMian {

	public static void main(String[] args) {
		JioPhone j = new JioPhone();
		j.call();
		j.sms();
		SamsungPhone s = new SamsungPhone();
		s.call();
		s.sms();

	}

}
