package br.unitins.unijato.application;

import javax.faces.application.FacesMessage;
import javax.faces.application.FacesMessage.Severity;
import javax.faces.context.FacesContext;

public class Util {
	
	public static void addInfoMessage(String message) {
		addMessage(message, FacesMessage.SEVERITY_INFO);
	}
	public static void addWarnMessage(String message) {
		addMessage(message, FacesMessage.SEVERITY_WARN);
	}
	public static void addErroMessage(String message) {
		addMessage(message, FacesMessage.SEVERITY_ERROR);
	}
	private static void addMessage(String message, Severity type) {
		FacesContext.getCurrentInstance().addMessage(" ", 
				new FacesMessage(type, message, message));
	}
	
}
