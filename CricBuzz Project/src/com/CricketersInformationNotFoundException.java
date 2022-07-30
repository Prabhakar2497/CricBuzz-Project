package com;

public class CricketersInformationNotFoundException extends RuntimeException {
private String message;
CricketersInformationNotFoundException(String message){
	this.message=message;
}
@Override
public String getMessage() {
	return message;
}
}
