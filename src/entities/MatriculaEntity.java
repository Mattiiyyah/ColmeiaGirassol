package entities;

import java.time.LocalDate;
import java.util.ArrayList;

public final class MatriculaEntity {
    //atributos
    private Integer nr;
    private LocalDate dataMatricula;
    private Integer status;

    private AlunoEntity aluno;
    private ArrayList<MatriculaAulasEntity> aulas;

    //construtor de inicializção
    public MatriculaEntity() {
        nr = 0;
        dataMatricula = LocalDate.now();
        status = 0;
        aluno = new AlunoEntity();
        aulas = new ArrayList<>();
    }

    public MatriculaEntity(Integer nr, LocalDate dataMatricula, Integer status, AlunoEntity aluno,
            ArrayList<MatriculaAulasEntity> aulas) {
        this.nr = nr;
        this.dataMatricula = dataMatricula;
        this.status = status;
        this.aluno = aluno;
        this.aulas = aulas;
    }

    public Integer getNr() {
        return nr;
    }

    public void setNr(Integer nr) {
        this.nr = nr;
    }

    public LocalDate getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(LocalDate dataMatricula) {
        this.dataMatricula = dataMatricula;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public AlunoEntity getAluno() {
        return aluno;
    }

    public void setAluno(AlunoEntity aluno) {
        this.aluno = aluno;
    }

    public ArrayList<MatriculaAulasEntity> getAulas() {
        return aulas;
    }

     public void adicionarAulas(MatriculaAulasEntity aula) {
        aulas.add(aula);
    }

    public void removerAulas(MatriculaAulasEntity aula) {
        aulas.remove(aula);
    }

    public String getStatusDescricao() {
        return StatusUntil.getDescricaoGeral(this.status);
    }
   
}
