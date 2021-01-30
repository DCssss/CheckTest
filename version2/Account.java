package by.test.java.version2;

public class Account implements Info {
	private String name;
	private int accNum;
	private double balance;
	private boolean isopen;

	public Account(String name,int accNum, double balance, boolean isopen) {
		this.name = name;
		this.accNum = accNum;
		this.balance = balance;
		this.isopen = isopen;
	}

	public Account() {
	};

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAccNum() {
		return accNum;
	}

	public void setAccNum(int accNum) {
		this.accNum = accNum;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public boolean isIsopen() {
		return isopen;
	}

	public void setIsopen(boolean isopen) {
		this.isopen = isopen;
	}

	public void showInfo() {
		System.out.println("Account name: " + this.name + "Account number: " + this.accNum + " Balance: " + this.balance + " Blocked: " + this.isopen);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + accNum;
		long temp;
		temp = Double.doubleToLongBits(balance);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + (isopen ? 1231 : 1237);
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
		Account other = (Account) obj;
		if (accNum != other.accNum)
			return false;
		if (Double.doubleToLongBits(balance) != Double.doubleToLongBits(other.balance))
			return false;
		if (isopen != other.isopen)
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
		return "Account [name=" + name + ", accNum=" + accNum + ", balance=" + balance + ", isopen=" + isopen + "]";
	}

	

}
