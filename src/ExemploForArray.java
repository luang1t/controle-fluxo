public class ExemploForArray {
    public static void main(String[] args) {
        String alunos[] = { "FELIPE", "JONAS", "JULIA", "MARCOS" };

        for (int i = 0; alunos.length > i; i++) {

            System.out.println("O aluno no indice " + i + " é " + alunos[i]);
        }
    }
}
