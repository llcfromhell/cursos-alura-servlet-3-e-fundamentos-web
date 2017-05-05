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
	
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		EmpresaDAO dao = new EmpresaDAO();
		String nome = req.getParameter("nome");
		Empresa empresa = new Empresa(nome);
		dao.adiciona(empresa);
		
		req.setAttribute("empresa", empresa);
		req.getRequestDispatcher("WEB-INF/pages/novaEmpresa.jsp").forward(req, resp);
		
	}
	
	

}
