package model.exceptions;

public class DomainException extends Exception {

	public final static long serialVersionUID = 1L;
	
	public DomainException(String msg) {
		super(msg);
	}
}
