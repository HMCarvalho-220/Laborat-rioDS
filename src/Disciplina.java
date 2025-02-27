import java.util.ArrayList;
import java.util.List;

public class Disciplina {
    private int codigo;
    private String nome;
    private int creditos;
    private int vagas;
    private int minAlunos;
    private int maxAlunos;
    private List<Matricula> matriculas;

    public Disciplina(int codigo, String nome, int creditos, int maxAlunos, int minAlunos) {
        this.codigo = codigo;
        this.nome = nome;
        this.creditos = creditos;
        this.maxAlunos = maxAlunos;
        this.minAlunos = minAlunos;
        this.vagas = maxAlunos;
        this.matriculas = new ArrayList<>();
    }

    public boolean adicionarAluno(Aluno aluno) {
        if (vagas > 0) {
            Matricula matricula = new Matricula(aluno, this);
            matriculas.add(matricula);
            vagas--;
            System.out.println("Aluno " + aluno.getNome() + " matriculado na disciplina " + this.nome);
            return true;
        } else {
            System.out.println("Não há vagas disponíveis na disciplina " + this.nome);
            return false;
        }
    }


    public boolean removerAluno(Aluno aluno) {
        Matricula matriculaParaRemover = null;
        for (Matricula matricula : matriculas) {
            if (matricula.getAluno().equals(aluno)) {
                matriculaParaRemover = matricula;
                break;
            }
        }
        if (matriculaParaRemover != null) {
            matriculas.remove(matriculaParaRemover);
            vagas++;
            System.out.println("Aluno " + aluno.getNome() + " removido da disciplina " + this.nome);
            return true;
        } else {
            System.out.println("Aluno " + aluno.getNome() + " não está matriculado na disciplina " + this.nome);
            return false;
        }
    }

    public boolean verificarMinimoAlunos() {
        return matriculas.size() >= minAlunos;
    }

    public boolean verificarMaximoAlunos() {
        return matriculas.size() >= maxAlunos;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public int getVagas() {
        return vagas;
    }

    public void setVagas(int vagas) {
        this.vagas = vagas;
    }

    public int getMinAlunos() {
        return minAlunos;
    }

    public void setMinAlunos(int minAlunos) {
        this.minAlunos = minAlunos;
    }

    public int getMaxAlunos() {
        return maxAlunos;
    }

    public void setMaxAlunos(int maxAlunos) {
        this.maxAlunos = maxAlunos;
    }

    public List<Matricula> getMatriculas() {
        return matriculas;
    }
}