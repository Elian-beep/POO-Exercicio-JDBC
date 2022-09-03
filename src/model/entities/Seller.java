package model.entities;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

public class Seller implements Serializable{
	private static final long serialVersionUID = 1L;
	
//	--------------ATRIBUTOS
	private Integer id;
	private String nome;
	private String email;
	private LocalDate dataAniversario;
	private double salarioBase;
	
	private Department departamento;
	
//	--------------CONSTRUTORES
	public Seller() {}

	public Seller(Integer id, String nome, String email, LocalDate dataAniversario, double salarioBase, Department departamento) {
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.dataAniversario = dataAniversario;
		this.salarioBase = salarioBase;
		this.departamento = departamento;
	}

//	--------------GETTERS E SETTERS
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDate getDataAniversario() {
		return dataAniversario;
	}

	public void setDataAniversario(LocalDate dataAniversario) {
		this.dataAniversario = dataAniversario;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public Department getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Department departamento) {
		this.departamento = departamento;
	}

//	--------------MÉTODOS HASH, EQUALS E TOSTRING
	@Override
	public int hashCode() {
		return Objects.hash(dataAniversario, departamento, email, id, nome, salarioBase);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Seller other = (Seller) obj;
		return Objects.equals(dataAniversario, other.dataAniversario)
				&& Objects.equals(departamento, other.departamento) && Objects.equals(email, other.email)
				&& Objects.equals(id, other.id) && Objects.equals(nome, other.nome)
				&& Double.doubleToLongBits(salarioBase) == Double.doubleToLongBits(other.salarioBase);
	}

	@Override
	public String toString() {
		return "Seller [id=" + id + ", nome=" + nome + ", email=" + email + ", dataAniversario=" + dataAniversario
				+ ", salarioBase=" + salarioBase + ", departamento=" + departamento + "]";
	}
	
	
	
}
