package entities;

public final class MatriculaAulasEntity {
    //atributos
    private AulasPlanejamentoEntity aulas;
    private MatriculaEntity matricula;
    private Integer statusPresenca;

    //construtor de inicialização
    public MatriculaAulasEntity() {
        aulas = new AulasPlanejamentoEntity();
        matricula = new MatriculaEntity();
        statusPresenca = 0;
    }

     //construtor para valores definidos
    public MatriculaAulasEntity(AulasPlanejamentoEntity aulas, MatriculaEntity matricula, Integer statusPresenca) {
        this.aulas = aulas;
        this.matricula = matricula;
        this.statusPresenca = statusPresenca;
    }

    public AulasPlanejamentoEntity getAulas() {
        return aulas;
    }

    public void setAulas(AulasPlanejamentoEntity aulas) {
        this.aulas = aulas;
    }

    public MatriculaEntity getMatricula() {
        return matricula;
    }

    public void setMatricula(MatriculaEntity matricula) {
        this.matricula = matricula;
    }

    public Integer getStatusPresenca() {
        return statusPresenca;
    }

    public void setStatusPresenca(Integer statusPresenca) {
        this.statusPresenca = statusPresenca;
    }

    public String getStatusPresencaDescricao() {
        return StatusUntil.getDescricaoPresenca(this.statusPresenca);
    }
    
}
