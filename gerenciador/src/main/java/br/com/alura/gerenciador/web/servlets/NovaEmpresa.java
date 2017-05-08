package br.com.alura.gerenciador.web.servlets;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.Empresa;
import br.com.alura.gerenciador.dao.EmpresaDAO;

//@WebServlet(urlPatterns="/novaEmpresa")
//public class NovaEmpresa extends HttpServlet {

public class NovaEmpresa implements Tarefa {
	
//	private static final long serialVersionUID = 1L;
//
//	@Override
//	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		EmpresaDAO dao = new EmpresaDAO();
//		String nome = req.getParameter("nome");
//		Empresa empresa = new Empresa(nome);
//		dao.adiciona(empresa);
//		
//		req.setAttribute("empresa", empresa);
//		req.getRequestDispatcher("WEB-INF/pages/novaEmpresa.jsp").forward(req, resp);
//		
//	}

	@Override
	public String executa(HttpServletRequest req, HttpServletResponse res) {
		
		EmpresaDAO dao = new EmpresaDAO();
		String nome = req.getParameter("nome");
		Empresa empresa = new Empresa(nome);
		dao.adiciona(empresa);
		
		req.setAttribute("empresa", empresa);
		return "WEB-INF/pages/novaEmpresa.jsp";
		
	}
	
	

}
