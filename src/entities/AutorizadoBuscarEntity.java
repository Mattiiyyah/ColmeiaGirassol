package entities;

import java.time.LocalDate;

public final class AutorizadoBuscarEntity extends PessoaEntity {
    //atributos
    private String grauParentesco;
    
    //construtor de inicialização
    public AutorizadoBuscarEntity() {
        grauParentesco = new String();
    }

    //construtor para valores definidos
    public AutorizadoBuscarEntity(Integer codigo, String nome, String cpf, String rg, LocalDate dataNascimento, String senha,
            String cep, String cidade, String uf, String email, String telefone, String grauParentesco) {
        super(codigo, nome, cpf, rg, dataNascimento, senha, cep, cidade, uf, email, telefone);
        this.grauParentesco = grauParentesco;
    }

    public String getGrauParentesco() {
        return grauParentesco;
    }

    public void setGrauParentesco(String grauParentesco) {
        this.grauParentesco = grauParentesco;
    }
    
}
