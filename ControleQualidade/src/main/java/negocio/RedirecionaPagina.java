package negocio;

import java.io.IOException;
import java.util.Set;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

public class RedirecionaPagina implements AuthenticationSuccessHandler {
	@Override
	public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication)
			throws IOException, ServletException {	
		
		Set<String> roles = AuthorityUtils.authorityListToSet(authentication.getAuthorities());
		/*if(CarrinhoCtrl.finalizouCompra) {
			response.sendRedirect("/FormularioCtrlQualidade/usuario/principal.xhtml");
			CarrinhoCtrl.finalizouCompra = false;
		}else {*/
			if(roles.contains("ROLE_ADMINISTRADOR")) {
				response.sendRedirect("/ControleQualidade/admin/principal.xhtml");
			}else if(roles.contains("ROLE_INSPETOR")) {
				response.sendRedirect("/ControleQualidade/inspetor/principal.xhtml");
			}else if(roles.contains("ROLE_GESTOR")) {			
				response.sendRedirect("/ControleQualidade/gestor/principal.xhtml");
		}
	}
}
