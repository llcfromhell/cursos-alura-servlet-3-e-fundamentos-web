package br.com.alura.gerenciador.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.alura.gerenciador.Usuario;
import br.com.alura.gerenciador.dao.UsuarioDAO;

@WebServlet(urlPatterns="/login")
public class Login extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

//	@Override
//	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		
//		RequestDispatcher rd = req.getRequestDispatcher("login.html");
//		rd.forward(req, resp);
//		
//	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String email = req.getParameter("email");
		String senha = req.getParameter("senha");
		
		Usuario usuario = new UsuarioDAO().buscaPorEmailESenha(email, senha);
		
		PrintWriter w = resp.getWriter();
		
		w.write("<html>");
		w.write("<body>");
		
		if (usuario == null) {
			
			
			w.write("<p>");
			w.write("Usuário/senha inválidos");
			w.write("</p>");
			
//			w.write("<a href='login'>");
//			w.write("Tentar novamente");
//			w.write("</a>");
			
			
		} else {
			
//			Cookie userCookie = new Cookie("usuario", usuario.getEmail());
//			userCookie.setMaxAge(120);
//			
//			resp.addCookie(userCookie);
			
			HttpSession session = req.getSession();
			session.setAttribute("usuarioLogado", usuario);
		
//			RequestDispatcher rd = req.getRequestDispatcher("index.html");
//			rd.forward(req, resp);
			
			w.write("<p>");
			w.write("Usuário: " + usuario.getEmail());
			w.write("</p>");
			
			
		}
		
		w.write("</body>");
		w.write("</html>");
		
	}


}
