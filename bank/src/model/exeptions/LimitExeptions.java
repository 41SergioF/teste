package model.exeptions;

public class LimitExeptions extends Exception{

	private static final long serialVersionUID = 1L;

	public LimitExeptions() {
		super("The amount exceeds withdraw limit");
	}

}
