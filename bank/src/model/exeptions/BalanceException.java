package model.exeptions;

public class BalanceException extends Exception{

	private static final long serialVersionUID = 1L;

	public BalanceException() {
		super("Not enough balance");
	}

}
