package by.test.java.main;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {

	/*	Client cl1 = new Client();
		cl1.setClientName("Sergey");
		cl1.setId(1);
		Client cl2 = new Client();
		cl2.setClientName("Alex");
		cl2.setId(2); */

		Account acc1 = new Account(1, 12, 120.00, 1);
		Account acc2 = new Account(1, 31, 220.00, 1);
		Account acc3 = new Account(2, 44, 320.00, 1);
		Account acc4 = new Account(2, 55, -320.00, 1);
		Account acc5 = new Account(3, 33, 120.00, 1);
		Account acc6 = new Account(3, 99, 150.00, 0);
		List<Account> acc = Arrays.asList(acc1, acc2, acc3, acc4, acc5, acc6);
		CustomerAccounts accs = new CustomerAccounts();
		accs.addAccount(acc1);
		accs.addAccount(acc2);
		accs.addAccount(acc3);
		accs.addAccount(acc4);
		accs.addAccount(acc5);
		accs.addAccount(acc6);

		AccountsLogic accSearch = new AccountsLogic();
		AccountsList accountsView = new AccountsList();
		AccountsLogic b5 = new AccountsLogic();

		double sumPos = b5.sumPositiveAccs(acc);
		System.out.println("Общая сумма на положительных счетах = " + sumPos);
		double sumNeg = b5.sumNegativeAccs(acc);
		System.out.println("Общая сумма задолжностей на счетах = " + sumNeg);
		double sumAccs = b5.sumAccounts(acc);
		System.out.println("Общая сумма на счетах = " + sumAccs);
		System.out.println(acc);

		List<Account> result = accs.getAccounts();
		System.out.println(result);
		accountsView.print(result, "Неотсортированный");
		result = accSearch.sortByAccNumber(result);
		accountsView.print(result, "Сортированный по номеру счета");

	}
}