import java.util.ArrayList;
import java.util.List;

public class Secretaria extends Usuario {
    private List<Disciplina> disciplinas;
    private List<Aluno> alunos;
    private List<Professor> professores;


    public Secretaria(int id, String nome, String email, String senha) {
        super(id, nome, email, senha);
        this.disciplinas = new ArrayList<>();
        this.alunos = new ArrayList<>();
        this.professores = new ArrayList<>();
    }

    public void cadastrarDisciplina(int codigo, String nome, int creditos, int maxAlunos, int minAlunos) {
        Disciplina disciplina = new Disciplina(codigo, nome, creditos, maxAlunos, minAlunos);
        disciplinas.add(disciplina);
        System.out.println("Disciplina " + nome + " cadastrada com sucesso.");
    }

    public void gerarCurriculo() {
        System.out.println("Currículo gerado para o semestre com as seguintes disciplinas:");
        for (Disciplina disciplina : disciplinas) {
            System.out.println("- " + disciplina.getNome() + " (Código: " + disciplina.getCodigo() + ")");
        }
    }

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
        System.out.println("Aluno " + aluno.getNome() + " adicionado ao sistema.");
    }

    public void adicionarProfessor(Professor professor) {
        professores.add(professor);
        System.out.println("Professor " + professor.getNome() + " adicionado ao sistema.");
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    public List<Professor> getProfessores() {
        return professores;
    }

    public void setProfessores(List<Professor> professores) {
        this.professores = professores;
    }
}