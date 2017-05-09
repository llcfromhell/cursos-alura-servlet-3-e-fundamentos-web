package br.com.alura.gerenciador.web;

import java.util.Collection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.Empresa;
import br.com.alura.gerenciador.dao.EmpresaDAO;

//@WebServlet(urlPatterns="/busca")
//public class BuscaEmpresa extends HttpServlet  {

public class BuscaEmpresa implements Tarefa {

//	private static final long serialVersionUID = 1L;
//	
//	public BuscaEmpresa() {
//		System.out.println("Instanciando uma Servlet do tipo BuscaEmpresa " + this);
//	}
//	
//	@Override
//	public void init() throws ServletException {
//	    super.init();
//	    System.out.println("Inicializando a Servlet " + this);
//	}
//
//	@Override
//	public void destroy() {
//	    super.destroy();
//	    System.out.println("Destruindo a Servlet " + this);
//	}
//
//
//
//	@Override
//	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		
//		PrintWriter writer = resp.getWriter();
//	    
//	    String filtro = req.getParameter("filtro");
//	    Collection<Empresa> empresas = new EmpresaDAO().buscaPorSimilaridade(filtro);
//
//	    req.setAttribute("empresas", empresas);
//	    RequestDispatcher disp = req.getRequestDispatcher("WEB-INF/pages/buscaEmpresa.jsp");
//	    disp.forward(req, resp);
//		
//	}

	@Override
	public String executa(HttpServletRequest req, HttpServletResponse res) {

	    String filtro = req.getParameter("filtro");
	    Collection<Empresa> empresas = new EmpresaDAO().buscaPorSimilaridade(filtro);

	    req.setAttribute("empresas", empresas);
	    
	    return "WEB-INF/pages/buscaEmpresa.jsp";
	
	}

	
	
}
