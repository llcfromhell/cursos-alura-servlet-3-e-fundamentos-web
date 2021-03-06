package br.com.alura.gerenciador.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

//@WebServlet(urlPatterns="/logout")
//public class Logout extends HttpServlet{
public class Logout implements Tarefa {

//	@Override
//	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
				
//		Cookie userCookie = new Cookies(req.getCookies()).getUserCookie();
//		
//		if (userCookie != null) {
//			userCookie.setMaxAge(0);
//		}
//		
//		resp.addCookie(userCookie);
//
//		HttpSession session = req.getSession();
//		session.removeAttribute("usuarioLogado");
//		
//		RequestDispatcher dispatcher = req.getRequestDispatcher("WEB-INF/pages/logout.html");
//		dispatcher.forward(req, resp);
//		
//	}
//
//	private static final long serialVersionUID = 1L;

	@Override
	public String executa(HttpServletRequest req, HttpServletResponse res) {
		
		HttpSession session = req.getSession();
		session.removeAttribute("usuarioLogado");
		
		return "WEB-INF/pages/logout.html";
		
		
	}

	
}
