package model.entities;

import java.io.Serializable;
import java.util.Objects;

public class Department implements Serializable{
	private static final long serialVersionUID = 1L;
	
//	--------------ATRIBUTOS
	private Integer id;
	private String nome;
	
//	--------------CONSTRUTORES
	public Department() {}

	public Department(Integer id, String nome) {
		this.id = id;
		this.nome = nome;
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

//	--------------MÉTODOS HASH, EQUALS E TOSTRING
	@Override
	public int hashCode() {
		return Objects.hash(id, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Department other = (Department) obj;
		return Objects.equals(id, other.id) && Objects.equals(nome, other.nome);
	}

	@Override
	public String toString() {
		return "Department [id=" + id + ", nome=" + nome + "]";
	}
	
}
