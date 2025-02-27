public class Main {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno(1, "João Silva", "joao@email.com", "senha123", "2023001", "Ciência da Computação");
        Aluno aluno2 = new Aluno(2, "Maria Souza", "maria@email.com", "senha456", "2023002", "Engenharia de Software");

        Disciplina matematica = new Disciplina(101, "Matemática", 4, 60, 3);
        Disciplina programacao = new Disciplina(202, "Programação", 6, 60, 3);

        aluno1.matricular(matematica);
        aluno2.matricular(programacao);

        aluno1.verMatriculas();
        aluno2.verMatriculas();

        System.out.println("Matemática atingiu o mínimo de alunos? " + matematica.verificarMinimoAlunos());
        System.out.println("Programação atingiu o mínimo de alunos? " + programacao.verificarMinimoAlunos());
        aluno1.cancelarMatricula(matematica);
        aluno1.verMatriculas();
    }
}