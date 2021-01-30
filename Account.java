package by.test.java.main;

public class Account {
	private int clientId;
	private int accNum;
	private double sum;
	private int isopen;

	public Account() {
	}

	public Account(int clientId, int accNum, double sum, int isopen) {
		this.clientId = clientId;
		this.accNum = accNum;
		this.sum = sum;
		this.isopen = isopen;
	}

	public int getClientId() {
		return clientId;
	}

	public void setClientId(int clientId) {
		this.clientId = clientId;
	}

	public int getAccNum() {
		return accNum;
	}

	public void setAccNum(int accNum) {
		this.accNum = accNum;
	}

	public double getSum() {
		return sum;
	}

	public void setSum(double sum) {
		this.sum = sum;
	}

	public int getIsopen() {
		return isopen;
	}

	public void setIsopen(int isopen) {
		this.isopen = isopen;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + accNum;
		result = prime * result + clientId;
		result = prime * result + isopen;
		long temp;
		temp = Double.doubleToLongBits(sum);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		if (clientId != other.clientId)
			return false;
		if (isopen != other.isopen)
			return false;
		if (Double.doubleToLongBits(sum) != Double.doubleToLongBits(other.sum))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "\nclientId=" + clientId + ", accNum=" + accNum + ", sum=" + sum + ", isopen=" + isopen;
	}

}
