package by.test.java.main;

import java.util.List;

public class AccountsList {

	public void print(List<Account> accounts, String message) {
		System.out.println("���������� �� ������ ��������: " + message);
		for (Account account : accounts) {
			if (account.getIsopen() == 1) {
				message = "�������������";
			}
			else {
				message = "�����������";
			}
			
			System.out.print(
					"Bank Account Number = " + account.getAccNum() + " | Balance = " + account.getSum() + " | " + message + "| \n");

		}
	}

}