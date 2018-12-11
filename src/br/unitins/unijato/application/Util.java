package br.unitins.unijato.application;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

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
		FacesContext.getCurrentInstance().addMessage(" ", new FacesMessage(type, message, message));
	}
	
	public static String encrypt(String value) {
		try {
			// Classe utilizada para gerar a criptografia em hash
			MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
			byte[] digest = messageDigest.digest(value.getBytes("UTF-8"));
			
			// convertendo um array bite em hexadecimal
			StringBuilder stringBuilder = new StringBuilder();
			for (byte b : digest) {
				stringBuilder.append(String.format("%02X", 0xFF & b));
			}
			String valueHexadecimal = stringBuilder.toString();
			
			return valueHexadecimal;
			
		} catch (NoSuchAlgorithmException | UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		
		return "Erro ao encriptar";
	}
	
	public static void redirect(String page) {
		FacesContext context = FacesContext.getCurrentInstance();
         try {
        	 context.getExternalContext().redirect(page);
		 } catch (IOException e) {
			 e.printStackTrace();
		 }
	}

}
