package entities;

import java.time.LocalDate;

public abstract class PessoaEntity {

    //atributos
    private Integer codigo;
    private String nome;
    private String cpf;
    private String rg;
    private LocalDate dataNascimento;
    private String senha;
    private String cep;
    private String cidade;
    private String uf;
    private String email;
    private String telefone;

    //construtor de inicialização
    public PessoaEntity() {
        codigo             =  0;
        nome               =  new String();
        cpf                =  new String();
        dataNascimento     =  LocalDate.now();
        senha              =  new String();
        cep                =  new String();
        cidade             =  new String();
        uf                 =  new String();
        email              =  new String();
        telefone           =  new String();
    }

    //construtor para valores definidos a partir da herança
    public PessoaEntity(Integer codigo, String nome, String cpf, String rg, LocalDate dataNascimento, String senha,
            String cep, String cidade, String uf, String email, String telefone) {
        this.codigo = codigo;
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.dataNascimento = dataNascimento;
        this.senha = senha;
        this.cep = cep;
        this.cidade = cidade;
        this.uf = uf;
        this.email = email;
        this.telefone = telefone;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
        
}
