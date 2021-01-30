package by.test.java.version2;

import java.util.ArrayList;
import java.util.List;


public class BankCustomer implements Info {
	private String name;
	private String bank;
	private List<Account> accounts;

	public BankCustomer() {
		accounts = new ArrayList<Account>();
	}

	public boolean addAccount(Account account) {
		return accounts.add(account);
	}

	public List<Account> getAccounts() {
		return accounts;
	}

	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	}

	public BankCustomer(String name, String bank) {
		this.name = name;
		this.bank = bank;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setBank(String bank) {
		this.bank = bank;
	}

	public String getBank() {
		return bank;
	}

	public void showInfo() {
		System.out.println("Client name:" + this.name + " Bank:" + this.bank + " Accounts: " + this.accounts);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bank == null) ? 0 : bank.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BankCustomer other = (BankCustomer) obj;
		if (bank == null) {
			if (other.bank != null)
				return false;
		} else if (!bank.equals(other.bank))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "BankCustomer [name=" + name + ", bank=" + bank + "]";
	}

}
