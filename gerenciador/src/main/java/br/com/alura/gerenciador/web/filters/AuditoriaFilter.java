package br.com.alura.gerenciador.web.filters;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.alura.gerenciador.Usuario;

@WebFilter(urlPatterns = "/*")
public class AuditoriaFilter implements Filter {

//	private static final String URL_GERENCIADOR_LOGIN = "/gerenciador/login";
//	private static final String URL_GERENCIADOR = "/gerenciador/";

	@Override
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
			throws IOException, ServletException {

		HttpServletRequest request = (HttpServletRequest) req;
		HttpServletResponse response = (HttpServletResponse) res;
		HttpSession session = request.getSession();

//		String uri = request.getRequestURI();
		
//		Cookie userCookie = new Cookies(request.getCookies()).getUserCookie();

//		String usuarioLogado = userCookie == null ? null : userCookie.getValue();
		
		Usuario usuarioLogado = (Usuario) session.getAttribute("usuarioLogado");
		
//		if (usuarioLogado == null && ! (uri.equals(URL_GERENCIADOR_LOGIN) || uri.equals(URL_GERENCIADOR))) {
//			
//			PrintWriter w = res.getWriter();
//			
//			w.write("<p>");
//			w.write("Sessão expirou");
//			w.write("</p>");
//			
//			w.write("<a href='login'>");
//			w.write("Clique aqui para logar novamente");
//			w.write("</a>");
//			
//		} else {
			
//			userCookie.setMaxAge(10 * 60);
//			response.addCookie(userCookie);
			
		
			
//		}
		
		String printUser = usuarioLogado == null ? "<deslogado>" : usuarioLogado.getEmail() ;
		System.out.println("Usuario " + printUser + " acessando a URI " + request.getRequestURI());
		
		chain.doFilter(request, response);

	}

	@Override
	public void destroy() {
		System.out.println("Destruindo filtro");
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		System.out.println("Inicializando filtro");
	}


}
