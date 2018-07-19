package beans;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="bel_formros800")
public class formRos800 {		
	
		//Cabeçalho formulário
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name="form_id")
		private int id;
		
		@Column(name="form_dataform", nullable = true)
		private Date dataFormulario;
		
		@Column(name="form_datalinha", nullable = true)
		private Date dataLinha;
		
		@Column(name="form_status", nullable = true)		
		private int status;
		
		//Saída do forno
		@Column(name="form_lastro", length = 2, nullable = true)
		private String lastro;
		
		@Column(name="form_teto", length = 2, nullable = true)
		private String teto;
		
		@Column(name="form_pesoassmin", nullable = true)
		private float pesoAssMin;
		
		@Column(name="form_pesoassmax", nullable = true)
		private float pesoAssMax;
		
		@Column(name="form_formamin")
		private float formatoMin;
		
		@Column(name="form_formamax")
		private float formatoMax;
		
		@Column(name="form_compmin")
		private float compriMin;
		
		@Column(name="form_compmax")
		private float compriMax;
		
		@Column(name="form_diammin")
		private float diameMin;
		
		@Column(name="form_diammax")
		private float diamMax;
		
		@Column(name="form_espemin", nullable = true)
		private float espessuraMin;
		
		@Column(name="form_espemax", nullable = true)
		private float espessuraMax;
		
		@Column(name="form_aspvisual", length = 2, nullable = true)
		private String aspectoVisu;
		
		@Column(name="form_obssaidaforno", length = 500)
		private String obsSaidaForno;
		
		//Umidade
		@Column(name="form_horaumidade", nullable = true)
		private Date horaUmidade;
		
		@Column(name="form_porcumidade", nullable = true)
		private float porcUmidade;
		
		@Column(name="form_obsumidade", length = 500)
		private String obsUmidade;
		
		//Pacotes
		@Column(name="form_pesopacote", nullable = true)
		private float pesoPacote;
		
		@Column(name="form_pesopacoteuni")
		private float pesoPacoteUni;
		
		@Column(name="form_pesouni", nullable = true )
		private float pesoUnidade;
		
		@Column(name="form_qtdbisc")
		private float qtdBisco;
		
		@Column(name="form_embalagem", length = 2, nullable = true)
		private String embalagem;
		
		@Column(name="form_soldavert", length = 2, nullable = true)
		private String soldaVert;
		
		@Column(name="form_soldasup", length = 2, nullable = true)
		private String soldaSuperior;
		
		@Column(name="form_soldainf", length = 2, nullable = true)
		private String soldaInferior;		
		
		@Column(name="form_obspacote", length = 500)
		private String obsPacote;
		
		
		//Codificação
		@Column(name="form_lotevalprima", length = 2, nullable = true)
		private String loteValPrima;
		
		@Column(name="form_lotevalsecun", length = 2)
		private String loteValSecun;
		
		@Column(name="form_etiquetasecun", length = 2, nullable = true)
		private String etiquetaSecun;
		
		@Column(name="form_obscodi", length = 500)
		private String obsCodificacao;
		
		
		//Dependências
		@ManyToOne
		@JoinColumn(name="form_pes_id")
		private Pessoa pessoa;
		
		public Pessoa getPessoa() {
			return pessoa;
		}
		public void setPessoa(Pessoa pessoa) {
			this.pessoa = pessoa;
		}
		
		@ManyToOne
		@JoinColumn(name="form_prod_id")
		private Produto produto;

		public Produto getProduto() {
			return produto;
		}
		public void setProduto(Produto produto) {
			this.produto = produto;
		}		
		
		
		//Getters e Setters	
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public Date getDataFormulario() {
			return dataFormulario;
		}
		public void setDataFormulario(Date dataFormulario) {
			this.dataFormulario = dataFormulario;
		}
		public Date getDataLinha() {
			return dataLinha;
		}
		public void setDataLinha(Date dataLinha) {
			this.dataLinha = dataLinha;
		}
		public int getStatus() {
			return status;
		}
		public void setStatus(int status) {
			this.status = status;
		}
		public String getLastro() {
			return lastro;
		}
		public void setLastro(String lastro) {
			this.lastro = lastro;
		}
		public String getTeto() {
			return teto;
		}
		public void setTeto(String teto) {
			this.teto = teto;
		}
		public float getPesoAssMin() {
			return pesoAssMin;
		}
		public void setPesoAssMin(float pesoAssMin) {
			this.pesoAssMin = pesoAssMin;
		}
		public float getPesoAssMax() {
			return pesoAssMax;
		}
		public void setPesoAssMax(float pesoAssMax) {
			this.pesoAssMax = pesoAssMax;
		}
		public float getFormatoMin() {
			return formatoMin;
		}
		public void setFormatoMin(float formatoMin) {
			this.formatoMin = formatoMin;
		}
		public float getFormatoMax() {
			return formatoMax;
		}
		public void setFormatoMax(float formatoMax) {
			this.formatoMax = formatoMax;
		}
		public float getCompriMin() {
			return compriMin;
		}
		public void setCompriMin(float compriMin) {
			this.compriMin = compriMin;
		}
		public float getCompriMax() {
			return compriMax;
		}
		public void setCompriMax(float compriMax) {
			this.compriMax = compriMax;
		}
		public float getDiameMin() {
			return diameMin;
		}
		public void setDiameMin(float diameMin) {
			this.diameMin = diameMin;
		}
		public float getDiamMax() {
			return diamMax;
		}
		public void setDiamMax(float diamMax) {
			this.diamMax = diamMax;
		}
		public float getEspessuraMin() {
			return espessuraMin;
		}
		public void setEspessuraMin(float espessuraMin) {
			this.espessuraMin = espessuraMin;
		}
		public float getEspessuraMax() {
			return espessuraMax;
		}
		public void setEspessuraMax(float espessuraMax) {
			this.espessuraMax = espessuraMax;
		}
		public String getAspectoVisu() {
			return aspectoVisu;
		}
		public void setAspectoVisu(String aspectoVisu) {
			this.aspectoVisu = aspectoVisu;
		}
		public String getObsSaidaForno() {
			return obsSaidaForno;
		}
		public void setObsSaidaForno(String obsSaidaForno) {
			this.obsSaidaForno = obsSaidaForno;
		}
		public Date getHoraUmidade() {
			return horaUmidade;
		}
		public void setHoraUmidade(Date horaUmidade) {
			this.horaUmidade = horaUmidade;
		}
		public float getPorcUmidade() {
			return porcUmidade;
		}
		public void setPorcUmidade(float porcUmidade) {
			this.porcUmidade = porcUmidade;
		}
		public String getObsUmidade() {
			return obsUmidade;
		}
		public void setObsUmidade(String obsUmidade) {
			this.obsUmidade = obsUmidade;
		}
		public float getPesoPacote() {
			return pesoPacote;
		}
		public void setPesoPacote(float pesoPacote) {
			this.pesoPacote = pesoPacote;
		}
		public float getPesoPacoteUni() {
			return pesoPacoteUni;
		}
		public void setPesoPacoteUni(float pesoPacoteUni) {
			this.pesoPacoteUni = pesoPacoteUni;
		}
		public float getPesoUnidade() {
			return pesoUnidade;
		}
		public void setPesoUnidade(float pesoUnidade) {
			this.pesoUnidade = pesoUnidade;
		}
		public float getQtdBisco() {
			return qtdBisco;
		}
		public void setQtdBisco(float qtdBisco) {
			this.qtdBisco = qtdBisco;
		}
		public String getEmbalagem() {
			return embalagem;
		}
		public void setEmbalagem(String embalagem) {
			this.embalagem = embalagem;
		}
		public String getSoldaVert() {
			return soldaVert;
		}
		public void setSoldaVert(String soldaVert) {
			this.soldaVert = soldaVert;
		}
		public String getSoldaSuperior() {
			return soldaSuperior;
		}
		public void setSoldaSuperior(String soldaSuperior) {
			this.soldaSuperior = soldaSuperior;
		}
		public String getSoldaInferior() {
			return soldaInferior;
		}
		public void setSoldaInferior(String soldaInferior) {
			this.soldaInferior = soldaInferior;
		}
		public String getObsPacote() {
			return obsPacote;
		}
		public void setObsPacote(String obsPacote) {
			this.obsPacote = obsPacote;
		}
		public String getLoteValPrima() {
			return loteValPrima;
		}
		public void setLoteValPrima(String loteValPrima) {
			this.loteValPrima = loteValPrima;
		}
		public String getLoteValSecun() {
			return loteValSecun;
		}
		public void setLoteValSecun(String loteValSecun) {
			this.loteValSecun = loteValSecun;
		}
		public String getEtiquetaSecun() {
			return etiquetaSecun;
		}
		public void setEtiquetaSecun(String etiquetaSecun) {
			this.etiquetaSecun = etiquetaSecun;
		}
		public String getObsCodificacao() {
			return obsCodificacao;
		}
		public void setObsCodificacao(String obsCodificacao) {
			this.obsCodificacao = obsCodificacao;
		}		
}
