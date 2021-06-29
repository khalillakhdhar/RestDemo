package com.example.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class RessourceNotFoundException extends RuntimeException {
private String ressourceName;
private String feildName;
private Object feildValue;
public RessourceNotFoundException(String ressourceName, String feildName, Object feildValue) {
	
	super(String.format("%s not found with %s: %s",ressourceName, feildName,feildValue));
	this.ressourceName = ressourceName;
	this.feildName = feildName;
	this.feildValue = feildValue;
}
public String getRessourceName() {
	return ressourceName;
}
public void setRessourceName(String ressourceName) {
	this.ressourceName = ressourceName;
}
public String getFeildName() {
	return feildName;
}
public void setFeildName(String feildName) {
	this.feildName = feildName;
}
public Object getFeildValue() {
	return feildValue;
}
public void setFeildValue(Object feildValue) {
	this.feildValue = feildValue;
}



}
