package by.test.java.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AccountsLogic {

	public List<Account> accNegBalance(List<Account> accounts) {
		List<Account> result = new ArrayList<Account>();
		for (Account account : accounts) {
			if (account.getSum() < 0) {
				result.add(account);
			}
		}
		return result;
	}

	public List<Account> accPosBalance(List<Account> accounts) {
		List<Account> result = new ArrayList<Account>();
		for (Account account : accounts) {
			if (account.getSum() >= 0) {
				result.add(account);
			}
		}
		return result;
	}
	
	
	

	public List<Account> accBlocked(List<Account> accounts) {
		List<Account> result = new ArrayList<Account>();
		for (Account account : accounts) {
			if (account.getIsopen() == 1) {
				result.add(account);
			}
		}
		return result;
	}

	public List<Account> searchByAccNum(List<Account> accounts, int accNum) {
		List<Account> result = new ArrayList<Account>();
		for (Account account : accounts) {
			if (account.getAccNum() == accNum) {
				result.add(account);
			}
		}
		return result;
	}

	public double accSum(List<Account> accounts) {
		double sum = 0;
		for (Account account : accounts) {
			sum = sum + account.getSum();
		}
		return sum;
	}

	public double sumPositiveAccs(List<Account> accounts) {
		double sum = 0;
		List<Account> result;
		result = accPosBalance(accounts);
		for (Account account : result) {
			sum = sum + account.getSum();
		}
		return sum;

	}

	public double sumNegativeAccs(List<Account> accounts) {
		double sum = 0;
		List<Account> result;
		result = accNegBalance(accounts);
		for (Account account : result) {
			sum = sum + account.getSum();
		}
		return sum;

	}

	public double sumAccounts(List<Account> accounts) {
		double sum = 0;
		for (Account account : accounts) {
			sum = sum + account.getSum();
		}
		return sum;
	}

/*	public String getClientName(List<Account> accounts, int id) {
		List<Account> result = new ArrayList<Account>();
		
		for (Account account : accounts) {	
			String s;
			Client cl = new Client();
			if (account.getClientId() == cl.getId()) {
				s == cl.getClientName();
			}
		return s;
		
	} */
	
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

	public List<Account> sortBySum(List<Account> accounts) {
		List<Account> result = new ArrayList<Account>();
		result.addAll(accounts);
		boolean isSorted = false;
		while (!isSorted) {
			isSorted = true;
			for (int i = 1; i < result.size(); i++) {
				Account acc1 = result.get(i);
				Account acc2 = result.get(i - 1);
				if (acc1.getSum() > acc2.getSum()) {
					Collections.swap(result, i, i - 1);
					isSorted = false;
				}
			}
		}
		return result;
	}

}
