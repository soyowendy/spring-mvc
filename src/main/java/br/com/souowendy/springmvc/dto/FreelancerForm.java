package br.com.souowendy.springmvc.dto;

import java.util.Objects;

public class FreelancerForm {
	private String nome;
	private String telefone;
	private String cpf;

	public FreelancerForm() {

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		FreelancerForm that = (FreelancerForm) o;
		return Objects.equals(cpf, that.cpf);
	}

	@Override
	public int hashCode() {
		return Objects.hash(cpf);
	}

	@Override
	public String toString() {
		return "VendedorForm{" +
				"nome='" + nome + '\'' +
				", telefone='" + telefone + '\'' +
				", cpf='" + cpf + '\'' +
				'}';
	}
}
