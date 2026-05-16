package entities;

public final class ResponsavelAlunoEntity {
    //atributos
    private ResponsavelEntity responsavel;
    private AlunoEntity  aluno;
    private String grauParentesco;
    private Double espFinanceiro;
    private Integer ordemContato;

    //construtor de inicialização
    public ResponsavelAlunoEntity() {
        responsavel    = new ResponsavelEntity();
        aluno          = new AlunoEntity();
        grauParentesco = new String();
        espFinanceiro  = 0.0;
        ordemContato   =   0;
    }

    //construtor para valores definidos
    public ResponsavelAlunoEntity(ResponsavelEntity responsavel, AlunoEntity aluno, String grauParentesco,
            Double espFinanceiro, Integer ordemContato) {
        this.responsavel = responsavel;
        this.aluno = aluno;
        this.grauParentesco = grauParentesco;
        this.espFinanceiro = espFinanceiro;
        this.ordemContato = ordemContato;
    }

    public ResponsavelEntity getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(ResponsavelEntity responsavel) {
        this.responsavel = responsavel;
    }

    public AlunoEntity getAluno() {
        return aluno;
    }

    public void setAluno(AlunoEntity aluno) {
        this.aluno = aluno;
    }

    public String getGrauParentesco() {
        return grauParentesco;
    }

    public void setGrauParentesco(String grauParentesco) {
        this.grauParentesco = grauParentesco;
    }

    public Double getEspFinanceiro() {
        return espFinanceiro;
    }

    public void setEspFinanceiro(Double espFinanceiro) {
        this.espFinanceiro = espFinanceiro;
    }

    public Integer getOrdemContato() {
        return ordemContato;
    }

    public void setOrdemContato(Integer ordemContato) {
        this.ordemContato = ordemContato;
    }
    
}
