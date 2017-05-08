package br.com.alura.gerenciador.web.servlets;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Tarefa {
	
	public String executa(HttpServletRequest req, HttpServletResponse res);

}
