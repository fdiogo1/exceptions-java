package model.exceptions;

/*
 * Exception - obligate the developer to solve
 * RuntimeException - don't obligate.
 * 
 * */
public class DomainException extends Exception { 
	
	private static final long serialVersionUID = 1L;
	
	public DomainException(String message) {
		super(message);
	}
}
