package modelo;

import java.util.ArrayList;
import java.util.List;

public class Categoria {
	private Integer id;
    private String nome;
    private final List<Produto> produtos = new ArrayList<>();
    
  
	public Categoria(Integer id,String nome) {
		this.nome = nome;

	}
	
	public String getNome() {
        return nome;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    
    public String toString() {
        return String.format("[produto: %d %s]", id, nome);
    }

	public int getId() {
		// TODO Auto-generated method stub
		return id;
	}

	 public List<Produto> getProdutos() {
	        return produtos;
	    }
	 
	public void adiciona(Produto p) {
	   produtos.add(p);
		
	}
}
