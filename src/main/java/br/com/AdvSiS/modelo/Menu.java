package br.com.AdvSiS.modelo;

import java.security.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Menu {
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idMenu;
	private String strIdMenu;
	private String nomeMenu;
	private String enderecoMenu;
	private Timestamp dataHoraCriacao;
	private Timestamp dataHoraAlteracao;
	
	public String getStrIdMenu() {
		return strIdMenu;
	}
	public void setStrIdMenu(String strIdMenu) {
		this.strIdMenu = strIdMenu;
	}
	public String getNomeMenu() {
		return nomeMenu;
	}
	public void setNomeMenu(String nomeMenu) {
		this.nomeMenu = nomeMenu;
	}
	public String getEnderecoMenu() {
		return enderecoMenu;
	}
	public void setEnderecoMenu(String enderecoMenu) {
		this.enderecoMenu = enderecoMenu;
	}
	public Timestamp getDataHoraCriacao() {
		return dataHoraCriacao;
	}
	public void setDataHoraCriacao(Timestamp dataHoraCriacao) {
		this.dataHoraCriacao = dataHoraCriacao;
	}
	public Timestamp getDataHoraAlteracao() {
		return dataHoraAlteracao;
	}
	public void setDataHoraAlteracao(Timestamp dataHoraAlteracao) {
		this.dataHoraAlteracao = dataHoraAlteracao;
	}
	
}
