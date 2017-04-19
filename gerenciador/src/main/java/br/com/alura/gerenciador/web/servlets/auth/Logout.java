package br.com.alura.gerenciador.web.servlets.auth;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.web.utils.Cookies;

@WebServlet(urlPatterns="/logout")
public class Logout extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
				
		Cookie userCookie = new Cookies(req.getCookies()).getUserCookie();
		
		if (userCookie != null) {
			userCookie.setMaxAge(0);
		}
		
		resp.addCookie(userCookie);
		PrintWriter w = resp.getWriter();
		w.append("<html>");
		w.append("<body>");
		w.append("<h2>Logout Success</h2>");
		w.append("</body>");
		w.append("</html>");
		
	}

	private static final long serialVersionUID = 1L;

	
}
