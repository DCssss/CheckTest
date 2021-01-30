package by.test.java.version2;

import java.util.List;

public class Print implements Info {

	public Print() {
	};

	public void showInfo() {

	};

	public void printSortList(List<Account> accounts) {

		System.out.println("\n[SortList by Account number]");
		for (Account account : accounts) {
			if (account.isIsopen() == true) {
				String mes = "[Card blocked]";
				System.out.print("[Bank Account Name] = " + account.getName() + " | " + "[Bank Account number]= "
						+ account.getAccNum() + "] |[Balance]= " + account.getBalance() + " | " + mes  +"\n");
			} else {
				String mes = "[Card opened]";
				System.out.print("[Bank Account Name] = " + account.getName() + " | " + "[Bank Account number]= "
						+ account.getAccNum() + "] |[Balance]= " + account.getBalance() + "|" + mes  +"\n");
			}
		}
	}

	public void print(List<Account> accounts) {
		System.out.println("\n[UnSortList]");
		for (Account account : accounts) {
			if (account.isIsopen() == true) {
				String mes = "[Card blocked]";
				System.out.print("[Bank Account Name] = " + account.getName() + " | " + "[Bank Account number]= "
						+ account.getAccNum() + "] |[Balance]= " + account.getBalance() + " | " + mes  +"\n");
			} else {
				String mes = "[Card opened]";
				System.out.print("[Bank Account Name] = " + account.getName() + " | " + "[Bank Account number]= "
						+ account.getAccNum() + "] |[Balance]= " + account.getBalance() + " | " + mes  +"\n");
			}
			
			
		}

	}

}
