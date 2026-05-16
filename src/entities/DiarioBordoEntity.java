package entities;

import java.time.LocalDate;

public final class DiarioBordoEntity {
    //atributos
    private Integer codigo;
    private LocalDate dataRegistro;
    private Byte compareceu;
    private String alimentacao;
    private String sono;
    private String humor;
    private String banheiroFralda;
    private String observacoes;

    private MatriculaEntity matricula;
    private ProfessorEntity professor;

    //construtor de iniciazação
    public DiarioBordoEntity()  {
        codigo         = 0;
        dataRegistro   = LocalDate.now();
        compareceu     = 0;
        alimentacao    = new String();
        sono           = new String();
        banheiroFralda = new String();
        observacoes    = new String();
        matricula      = new MatriculaEntity();
        professor      = new ProfessorEntity();
    }

     //construtor para valores definidos
    public DiarioBordoEntity(Integer codigo, LocalDate dataRegistro, Byte compareceu, String alimentacao, String sono,
            String humor, String banheiroFralda, String observacoes, MatriculaEntity matricula, ProfessorEntity professor) {
        this.codigo = codigo;
        this.dataRegistro = dataRegistro;
        this.compareceu = compareceu;
        this.alimentacao = alimentacao;
        this.sono = sono;
        this.humor = humor;
        this.banheiroFralda = banheiroFralda;
        this.observacoes = observacoes;
        this.matricula = matricula;
        this.professor = professor;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public LocalDate getDataRegistro() {
        return dataRegistro;
    }

    public void setDataRegistro(LocalDate dataRegistro) {
        this.dataRegistro = dataRegistro;
    }

    public Byte getCompareceu() {
        return compareceu;
    }

    public void setCompareceu(Byte compareceu) {
        this.compareceu = compareceu;
    }

    public String getAlimentacao() {
        return alimentacao;
    }

    public void setAlimentacao(String alimentacao) {
        this.alimentacao = alimentacao;
    }

    public String getSono() {
        return sono;
    }

    public void setSono(String sono) {
        this.sono = sono;
    }

    public String getHumor() {
        return humor;
    }

    public void setHumor(String humor) {
        this.humor = humor;
    }

    public String getBanheiroFralda() {
        return banheiroFralda;
    }

    public void setBanheiroFralda(String banheiroFralda) {
        this.banheiroFralda = banheiroFralda;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public MatriculaEntity getMatricula() {
        return matricula;
    }

    public void setMatricula(MatriculaEntity matricula) {
        this.matricula = matricula;
    }

    public ProfessorEntity getProfessor() {
        return professor;
    }

    public void setProfessor(ProfessorEntity professor) {
        this.professor = professor;
    }
}
