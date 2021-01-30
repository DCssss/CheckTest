package by.test.java.version2;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		Account acc1 = new Account("Sergey", 123456789, 100.22, false);
		Account acc2 = new Account("Sergey", 987654321, 1010.0, false);
		Account acc3 = new Account("Alex", 179999999, -150.00, true);
		Account acc4 = new Account("Alex", 134567111, -150.00, true);
		Account acc5 = new Account("Alex", 111111111, -150.00, true);
		List<Account> acc = Arrays.asList(acc1, acc2, acc3, acc4, acc5);
		BankCustomer bc = new BankCustomer();
		bc.addAccount(acc1);
		bc.addAccount(acc2);
		bc.addAccount(acc3);
		bc.addAccount(acc4);
		bc.addAccount(acc5);
		BankAccountLogic bl = new BankAccountLogic();
		Print pr = new Print();
		System.out.println("Общая сумма на счетах клиентов: " + bl.sumAccount(acc));
		System.out.println("Общая сумма на положительных счетах клиентов: " + bl.sumPosAccounts(acc));
		System.out.println("Общая сумма на положительных счетах клиентов: " + bl.sumNegAccounts(acc));

		{
			pr.print(acc);
			pr.printSortList(bl.sortByAccNumber(acc));
			System.out.println();
		}

		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Введите номер счета для поиска : ");
			int accNum = sc.nextInt();
			sc.close();
			System.out.println(bl.findAccByNum(acc, accNum));

		}

	}
}
