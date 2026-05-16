package entities;

import java.time.LocalDate;

public final class ResponsavelEntity extends PessoaEntity {

    //atributos
    private String localTrabalho;
    private String telefoneTrabalho;
    private Integer status;
    private String estadoCivil;

    //construtor de incialização
    public ResponsavelEntity() {
        super();
        localTrabalho    = new String();
        telefoneTrabalho = new String();
        status           =    0;
        estadoCivil      = new String();
    }

    //construtor para valores definidos
    public ResponsavelEntity(Integer codigo, String nome, String cpf, String rg, LocalDate dataNascimento, String senha,
            String cep, String cidade, String uf, String email, String telefone, String localTrabalho, String telefoneTrabalho,
            Integer status, String estadoCivil) {
        super(codigo, nome, cpf, rg, dataNascimento, senha, cep, cidade, uf, email, telefone);
        this.localTrabalho = localTrabalho;
        this.telefoneTrabalho = telefoneTrabalho;
        this.status = status;
        this.estadoCivil = estadoCivil;
    }

    public String getLocalTrabalho() {
        return localTrabalho;
    }

    public void setLocalTrabalho(String localTrabalho) {
        this.localTrabalho = localTrabalho;
    }

    public String getTelefoneTrabalho() {
        return telefoneTrabalho;
    }

    public void setTelefoneTrabalho(String telefoneTrabalho) {
        this.telefoneTrabalho = telefoneTrabalho;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getStatusDescricao() {
        return StatusUntil.getDescricaoGeral(this.status);
    }

}
