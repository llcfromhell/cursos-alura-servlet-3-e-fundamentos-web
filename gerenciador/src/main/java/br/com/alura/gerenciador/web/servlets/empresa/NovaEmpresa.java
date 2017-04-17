package br.com.alura.gerenciador.web.servlets.empresa;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.Empresa;
import br.com.alura.gerenciador.dao.EmpresaDAO;

@WebServlet(urlPatterns="/novaEmpresa")
public class NovaEmpresa extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		EmpresaDAO dao = new EmpresaDAO();
		String nome = req.getParameter("nome");
		dao.adiciona(new Empresa(nome));
		
		PrintWriter writer = resp.getWriter();
	    writer.println("<html><body>Empresa " + nome + " adicionada!<br/><br/><a href='busca'>Lista</a></body></html>");
		
	}
	
	

}
