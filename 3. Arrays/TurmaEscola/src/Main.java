public class Main {

    public static void main(String[] args) {

        Turma turmaB = new Turma();
        turmaB.identificacaoTurma = "Maternal B";
        turmaB.nomeProfessora = "Claudia";
        turmaB.alunos = new Aluno[3];

//        1 Forma de criar uma aluno em array
        turmaB.alunos[0] = new Aluno();
        turmaB.alunos[0].nome = "Jonas Claudio";
        turmaB.alunos[0].idade = 3;

//        2 Forma de criar um aluno em array
        Aluno aluno1 = new Aluno();
        aluno1.nome = "Julia Maria";
        aluno1.idade = 4;
        turmaB.alunos[1] = aluno1;

        turmaB.imprimirListaDeAlunos();

//        for (int i = 0; i < turmaB.alunos.length; i++) {
//            Aluno aluno = turmaB.alunos[i];
//
//            if (aluno != null) {
//                System.out.printf("%d - %s (%d anos)%n", i, aluno.nome, aluno.idade);
//            } else {
//                System.out.printf("%d está vago%n", i);
//            }
//        }
    }
}