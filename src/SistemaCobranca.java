import java.util.ArrayList;
import java.util.List;

public class SistemaCobranca {
    private List<Matricula> matriculas;

    public SistemaCobranca() {
        this.matriculas = new ArrayList<>();
    }

    public void adicionarMatricula(Matricula matricula) {
        matriculas.add(matricula);
        System.out.println("Matrícula do aluno " + matricula.getAluno().getNome() + " adicionada ao sistema de cobranças.");
    }

    public void gerarCobrancas() {
        System.out.println("Gerando cobranças para os alunos:");
        for (Matricula matricula : matriculas) {
            Aluno aluno = matricula.getAluno();
            Disciplina disciplina = matricula.getDisciplina();
            double valorCobranca = disciplina.getCreditos() * 100.0;
            System.out.println("- Aluno: " + aluno.getNome() + ", Disciplina: " + disciplina.getNome() + ", Valor: R$ " + valorCobranca);
        }
    }

    public List<Matricula> getMatriculas() {
        return matriculas;
    }

    public void setMatriculas(List<Matricula> matriculas) {
        this.matriculas = matriculas;
    }
}