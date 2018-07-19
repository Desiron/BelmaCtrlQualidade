package negocio;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;

import beans.Pessoa;
import persistencia.PessoaDAO;

@ManagedBean
@SessionScoped
public class PessoaCtrl implements Serializable {

	private static final long serialVersionUID = 1L;
	private Pessoa pessoa;
	private List<Pessoa> list = new ArrayList<Pessoa>();
	private String filtro = "";

	public String getFiltro() {
		return filtro;
	}

	public void setFiltro(String filtro) {
		this.filtro = filtro;
	}

	public List<Pessoa> getList() {
		return PessoaDAO.listagem(filtro);
	}

	public void setList(List<Pessoa> list) {
		this.list = list;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	
	public String actionGravarCadastro() {
		PessoaDAO.inserir(pessoa);
		return "/publico/login.xhtml";
	}
	
	public String actionExcluir(Pessoa pes) {
		PessoaDAO.excluir(pes);
		return "form_pessoa";
	}
	
	public static String usuarioLogado() {
		String usuario="";
		UserDetails user = ((UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal());
		usuario = user.getUsername();
		return usuario;
	}
	
}
