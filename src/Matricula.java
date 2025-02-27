import java.time.LocalDate;

public class Matricula {
    private static int proximoId = 1;

    private int id;
    private Aluno aluno;
    private Disciplina disciplina;
    private String data;

    public Matricula(Aluno aluno, Disciplina disciplina) {
        this.id = proximoId++;
        this.aluno = aluno;
        this.disciplina = disciplina;
        this.data = LocalDate.now().toString();
    }

    public Matricula(int id, Aluno aluno, Disciplina disciplina, String data) {
        this.id = id;
        this.aluno = aluno;
        this.disciplina = disciplina;
        this.data = data;
    }

    public void cancelar() {
        disciplina.removerAluno(aluno);
        System.out.println("Matrícula cancelada para o aluno " + aluno.getNome() + " na disciplina " + disciplina.getNome());
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}