package entities;

import java.time.LocalDate;

public final class AulasPlanejamentoEntity {
    //atributos
    private Integer codigo;
    private LocalDate dataAula;
    private String atividadeDinamica;
    private String descricao;
    private Integer status;
    
    private ProfessorEntity professor;
    private TurmaEntity turma;

    //construtor de inicialização
    public AulasPlanejamentoEntity() {
        codigo = 0;
        dataAula = LocalDate.now();
        atividadeDinamica = new String();
        descricao = new String();
        status = 0;
        professor = new ProfessorEntity();
        turma = new TurmaEntity();
    }

    public AulasPlanejamentoEntity(Integer codigo, LocalDate dataAula, String atividadeDinamica, String descricao,
            Integer status, ProfessorEntity professor, TurmaEntity turma) {
        this.codigo = codigo;
        this.dataAula = dataAula;
        this.atividadeDinamica = atividadeDinamica;
        this.descricao = descricao;
        this.status = status;
        this.professor = professor;
        this.turma = turma;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public LocalDate getDataAula() {
        return dataAula;
    }

    public void setDataAula(LocalDate dataAula) {
        this.dataAula = dataAula;
    }

    public String getAtividadeDinamica() {
        return atividadeDinamica;
    }

    public void setAtividadeDinamica(String atividadeDinamica) {
        this.atividadeDinamica = atividadeDinamica;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public ProfessorEntity getProfessor() {
        return professor;
    }

    public void setProfessor(ProfessorEntity professor) {
        this.professor = professor;
    }

    public TurmaEntity getTurma() {
        return turma;
    }

    public void setTurma(TurmaEntity turma) {
        this.turma = turma;
    }

    public String getStatusDescricao() {
        return StatusUntil.getDescricaoGeral(this.status);
    }
}
