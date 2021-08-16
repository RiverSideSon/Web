package br.com.isidrocorp.eventdash.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity                    // Classe armazenada em DB
@Table(name="itmn_alarme") // Nome da tabela no DB
public class Alarme {
	@Column(name="id_alarme")                         // Define o nome da coluna
	@Id                                               // Define que a coluna é chave primária
	@GeneratedValue(strategy=GenerationType.IDENTITY) // Define que a coluna é auto-increment
	private int id;
	
	@Column(name="nome", length = 100, nullable = false) // Define o nome da coluna
	private String nome;

	@Column(name="descricao", length = 200, nullable = true) // Define o nome da coluna
	private String descricao;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
