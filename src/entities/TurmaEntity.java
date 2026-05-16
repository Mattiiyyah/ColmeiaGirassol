package entities;

import java.util.ArrayList;

public final class TurmaEntity {
    //atributos
    private Integer codigo;
    private String nomeTurma;
    private String ano;
    private String grau;

    private ArrayList<MatriculaEntity> matriculas;
    private ProfessorEntity professor;

    //construtor de inicialização
    public TurmaEntity() {
        codigo = 0;
        nomeTurma = new String();
        ano       = new String();
        grau      = new String();
        matriculas = new ArrayList<>();
        professor = new ProfessorEntity();
    }

    //construtor para valores definidos
    public TurmaEntity(Integer codigo, String nomeTurma, String ano, String grau, ArrayList<MatriculaEntity> matriculas, ProfessorEntity professor) {
        this.codigo = codigo;
        this.nomeTurma = nomeTurma;
        this.ano = ano;
        this.grau = grau;
        this.matriculas = matriculas;
        this.professor = professor;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNomeTurma() {
        return nomeTurma;
    }

    public void setNomeTurma(String nomeTurma) {
        this.nomeTurma = nomeTurma;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getGrau() {
        return grau;
    }

    public void setGrau(String grau) {
        this.grau = grau;
    }

    public ArrayList<MatriculaEntity> getMatriculas() {
        return matriculas;
    }

    public void setMatriculas(ArrayList<MatriculaEntity> matriculas) {
        this.matriculas = matriculas;
    }

    public ProfessorEntity getProfessor() {
        return professor;
    }

    public void setProfessor(ProfessorEntity professor) {
        this.professor = professor;
    }

    public void adicionarMatricula(MatriculaEntity matricula) {
        this.matriculas.add(matricula);
    }

    public void removerMatricula(MatriculaEntity matricula) {
        this.matriculas.remove(matricula);
    }
}

