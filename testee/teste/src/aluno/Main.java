package aluno;
public class Main {
    public static void main(String[] args) throws Exception {

        Livro livro = new Livro(1960, "O sol é para todos", "Harper Lee");

        System.out.println("\nNome do livro: " + livro.getTitulo() + "\nAutor do livro: " + livro.getAutor()
                + "\nAno de lançamento do livro: " + livro.getAno() + "\n");

    }
}
