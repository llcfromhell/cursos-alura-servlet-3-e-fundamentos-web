package br.com.alura.gerenciador.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/FazTudo")
public class FazTudo extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		try {
		
			String tarefaChamada = req.getParameter("tarefa");
			String nomeDaClasse = "br.com.alura.gerenciador.web.servlets." + tarefaChamada;
			Tarefa tarefa = (Tarefa) Class.forName(nomeDaClasse).newInstance();
		
			req.getRequestDispatcher(tarefa.executa(req, res)).forward(req, res);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	
}
