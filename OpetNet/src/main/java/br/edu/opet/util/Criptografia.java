package br.edu.opet.util;

import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.jboss.security.Base64Encoder;

public class Criptografia {
	
	public String criptografa(String senha) {
		try {
			MessageDigest digest = MessageDigest.getInstance("MD5");
			digest.update(senha.getBytes());

			// Base64Encoder encoder = new Base64Encoder();
			return Base64Encoder.encode(digest.digest());

		} catch (NoSuchAlgorithmException e) {
			System.err.println("Erro do Digest : " + e.getMessage());

		} catch (IOException e1) {
			System.err.println("Erro do Encoder : " + e1.getMessage());
		}

		return senha;
	}

}
