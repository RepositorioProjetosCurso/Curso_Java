public class Turma {

    String identificacaoTurma;
    String nomeProfessora;
    Aluno[] alunos;
    
    void imprimirListaDeAlunos() {
        for (Aluno aluno : alunos) {
            if (aluno != null) {
                System.out.printf("%s (%d anos)%n", aluno.nome, aluno.idade);
            } else {
                System.out.println("Vago");
            }
        }
    }
}