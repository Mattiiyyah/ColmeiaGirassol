package entities;

import java.time.LocalDate;

public final class ProfessorEntity extends PessoaEntity {
    //atributos
    private LocalDate dataContratacao;
    private String formacao;
    private Integer status;

    //construtor de incialização
    public ProfessorEntity() {
        dataContratacao  = LocalDate.now();
        formacao         = new String();
        status           =            0;
    }

    //construtor para valores definidos
    public ProfessorEntity(Integer codigo, String nome, String cpf, String rg, LocalDate dataNascimento, String senha,
            String cep, String cidade, String uf, String email, String telefone, LocalDate dataContratacao, String formacao,
            Integer status) {
        super(codigo, nome, cpf, rg, dataNascimento, senha, cep, cidade, uf, email, telefone);
        this.dataContratacao = dataContratacao;
        this.formacao = formacao;
        this.status = status;
    }

    public LocalDate getDataContratacao() {
        return dataContratacao;
    }

    public void setDataContratacao(LocalDate dataContratacao) {
        this.dataContratacao = dataContratacao;
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getStatusDescricao() {
        return StatusUntil.getDescricaoGeral(this.status);
    }
    
}
