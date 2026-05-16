package entities;

public final class AutorizadoBuscarAlunoEntity {
    //atributos
    private AutorizadoBuscarEntity autorizado;
    private AlunoEntity aluno;

    //construtor de incialização
    public AutorizadoBuscarAlunoEntity() {
        autorizado = new AutorizadoBuscarEntity();
        aluno  = new AlunoEntity();
    }

    //construtor para valores definidos
    public AutorizadoBuscarAlunoEntity(AutorizadoBuscarEntity autorizado, AlunoEntity aluno) {
        this.autorizado = autorizado;
        this.aluno = aluno;
    }


    public AutorizadoBuscarEntity getAutorizado() {
        return autorizado;
    }

    public void setAutorizado(AutorizadoBuscarEntity autorizado) {
        this.autorizado = autorizado;
    }

    public AlunoEntity getAluno() {
        return aluno;
    }

    public void setAluno(AlunoEntity aluno) {
        this.aluno = aluno;
    }

    
}
