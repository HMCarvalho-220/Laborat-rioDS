import java.util.ArrayList;
import java.util.List;

public class Aluno extends Usuario {
    private int matricula;
    private String curso;
    private List<Matricula> matriculas;

    public Aluno(int id, String nome, String email, String senha, int matricula, String curso) {
        super(id, nome, email, senha);
        this.matricula = matricula;
        this.curso = curso;
        this.matriculas = new ArrayList<>();
    }


    public void matricular(Disciplina disciplina) {
        if (matriculas.size() < 6) {
            Matricula matricula = new Matricula(this, disciplina);
            matriculas.add(matricula);
            System.out.println("Matrícula realizada com sucesso na disciplina: " + disciplina.getNome());
        } else {
            System.out.println("Limite de matrículas atingido (6 disciplinas).");
        }
    }

    public void cancelarMatricula(Disciplina disciplina) {
        Matricula matriculaParaRemover = null;
        for (Matricula matricula : matriculas) {
            if (matricula.getDisciplina().equals(disciplina)) {
                matriculaParaRemover = matricula;
                break;
            }
        }
        if (matriculaParaRemover != null) {
            matriculas.remove(matriculaParaRemover);
            System.out.println("Matrícula cancelada com sucesso na disciplina: " + disciplina.getNome());
        } else {
            System.out.println("Matrícula não encontrada para a disciplina: " + disciplina.getNome());
        }
    }

    public void verMatriculas() {
        System.out.println("Matrículas do aluno " + this.getNome() + ":");
        for (Matricula matricula : matriculas) {
            System.out.println("- " + matricula.getDisciplina().getNome());
        }
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public List<Matricula> getMatriculas() {
        return matriculas;
    }
}