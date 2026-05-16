package entities;

import java.time.LocalDate;
import java.util.ArrayList;

public final class AlunoEntity {
    //atributos
    private Integer codigo;
    private String nome;
    private LocalDate dataNascimento;
    private String alergias;
    private String restricoesAlimentares;
    private String necessidadesEspeciais;
    
    private ArrayList<ResponsavelAlunoEntity> responsaveis;
    private ArrayList<AutorizadoBuscarAlunoEntity> autorizados;

    //construtor de inicialização
    public AlunoEntity() {
        codigo = 0;
        nome = new String();
        dataNascimento = LocalDate.now();
        alergias = new String();
        restricoesAlimentares = new String();
        necessidadesEspeciais = new String();
        responsaveis = new ArrayList<>();
        autorizados = new ArrayList<>();
    }

    //construtor para valores definidos
    public AlunoEntity(Integer codigo, String nome, LocalDate dataNascimento, String alergias,
            String restricoesAlimentares, String necessidadesEspeciais, ArrayList<ResponsavelAlunoEntity> responsaveis,
            ArrayList<AutorizadoBuscarAlunoEntity> autorizados) {
        this.codigo = codigo;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.alergias = alergias;
        this.restricoesAlimentares = restricoesAlimentares;
        this.necessidadesEspeciais = necessidadesEspeciais;
        this.responsaveis = responsaveis;
        this.autorizados = autorizados;
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

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getAlergias() {
        return alergias;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }

    public String getRestricoesAlimentares() {
        return restricoesAlimentares;
    }

    public void setRestricoesAlimentares(String restricoesAlimentares) {
        this.restricoesAlimentares = restricoesAlimentares;
    }

    public String getNecessidadesEspeciais() {
        return necessidadesEspeciais;
    }

    public void setNecessidadesEspeciais(String necessidadesEspeciais) {
        this.necessidadesEspeciais = necessidadesEspeciais;
    }

    public ArrayList<ResponsavelAlunoEntity> getResponsavel() {
        return responsaveis;
    }

    public ArrayList<AutorizadoBuscarAlunoEntity> getAutorizado() {
        return autorizados;
    }

    public void adicionarResponsavel(ResponsavelAlunoEntity responsavel) {
        responsaveis.add(responsavel);
    }

    public void removerResponsavel(ResponsavelAlunoEntity responsavel) {
        responsaveis.remove(responsavel);
    }

    public void adicionarAutorizado(AutorizadoBuscarAlunoEntity autorizado) {
        autorizados.add(autorizado);
    }

    public void removerAutorizado(AutorizadoBuscarAlunoEntity autorizado) {
        autorizados.remove(autorizado);
    }
}
