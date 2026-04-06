package com.exception;

public class InsufficientException extends RuntimeException{
	
	public InsufficientException(String msg) {
		super(msg);//parent chya constructor la call karn mahnje super keyword
	}

}
