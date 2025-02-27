import java.util.List;

public class Professor extends Usuario {
    private String departamento;
    private List<Disciplina> disciplinas; // Lista de disciplinas ministradas

    // Construtor
    public Professor(int id, String nome, String email, String senha, String departamento) {
        super(id, nome, email, senha);
        this.departamento = departamento;
    }

    // Métodos
    public void visualizarAlunosMatriculados(Disciplina disciplina) {
        if (disciplinas.contains(disciplina)) {
            System.out.println("Alunos matriculados na disciplina " + disciplina.getNome() + ":");
            for (Matricula matricula : disciplina.getMatriculas()) {
                System.out.println("- " + matricula.getAluno().getNome());
            }
        } else {
            System.out.println("Você não ministra a disciplina " + disciplina.getNome());
        }
    }

    public void adicionarDisciplina(Disciplina disciplina) {
        disciplinas.add(disciplina);
        System.out.println("Disciplina " + disciplina.getNome() + " adicionada ao professor " + this.getNome());
    }

    public void removerDisciplina(Disciplina disciplina) {
        disciplinas.remove(disciplina);
        System.out.println("Disciplina " + disciplina.getNome() + " removida do professor " + this.getNome());
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }
}