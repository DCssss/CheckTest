package by.test.java.version2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BankAccountLogic {

	public double sumAccount(List<Account> accounts) {

		double sum = 0;
		for (Account acc : accounts) {
			sum = sum + acc.getBalance();
		}
		return sum;
	}

	public double sumPosAccounts(List<Account> accounts) {
		double sum = 0;
		for (Account acc : accounts) {
			if (acc.getBalance() > 0) {
				sum = sum + acc.getBalance();
			}
		}
		return sum;
	}

	public double sumNegAccounts(List<Account> accounts) {
		double sum = 0;
		for (Account acc : accounts) {
			if (acc.getBalance() < 0) {
				sum = sum + acc.getBalance();
			}
		}
		return sum;
	}

	public List<Account> findAccByNum(List<Account> accounts, int accNum) {
		List<Account> result = new ArrayList<Account>();
		for (Account acc : accounts) {
			if (acc.getAccNum() == accNum) {
				result.add(acc);
			} else {
				System.out.println("—чет не найден!");
			}
		}

		return result;
	}

	public List<Account> sortByAccNumber(List<Account> accounts) {
		List<Account> result = new ArrayList<Account>();
		result.addAll(accounts);
		boolean isSorted = false;
		while (!isSorted) {
			isSorted = true;
			for (int i = 1; i < result.size(); i++) {
				Account acc1 = result.get(i);
				Account acc2 = result.get(i - 1);
				if (acc1.getAccNum() < acc2.getAccNum()) {
					Collections.swap(result, i, i - 1);
					isSorted = false;
				}
			}
		}
		return result;
	}
}
