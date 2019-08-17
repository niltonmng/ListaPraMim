package com.daca.listapramim.api.item.model;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name="id")
public class ProdutoQuantidadeFixa extends Item {

	public ProdutoQuantidadeFixa(String nome, Categoria categoria) {
		super(nome, categoria);
	}
}
