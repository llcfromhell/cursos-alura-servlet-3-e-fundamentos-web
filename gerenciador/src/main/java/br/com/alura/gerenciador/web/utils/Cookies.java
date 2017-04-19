package br.com.alura.gerenciador.web.utils;

import java.util.Arrays;

import javax.servlet.http.Cookie;

public class Cookies {

	private Cookie[] cookies;

	public Cookies(Cookie[] cookies) {
		this.cookies = cookies;
	}

	public Cookie getUserCookie() {
		if (cookies == null)
			return null;

		return Arrays.asList(cookies).stream()
				.filter(c -> c.getName().equals("usuario"))
				.findFirst()
				.orElse(null);
	}

}
