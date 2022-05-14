package aluno.aluno2;

public class Main {
    public static void main(String[] args) throws Exception {

        Author author1 = new Author("Machado de Assis", "AssisMachado@89gmail.com", 'M');
        Author author2 = new Author("Toni Morrison", "tonimorri23@gmail.com", 'F');

        Book book1 = new Book("O alienista", author1, 45.3, 5);
        Book book2 = new Book("Amada", author2, 43.5);
        book2.setQty(10);

        System.out.println("\nLivros:");
        System.out.println("\nNome: " + book1.getName() + "\nQuantidade: "+book1.getQty() + "\nPreço: R$" + book1.getPrice() + "\nMétodo toString: " + book1.toString());
        System.out.println("\nNome: " + book2.getName() + "\nQuantidade: "+book2.getQty() + "\nPreço: R$" + book2.getPrice() + "\nMétodo toString: " + book2.toString());
        
        System.out.println("\nAutores:");
        System.out.println("\nNome: " + author1.getName() + "\nEmail: "+author1.getEmail() + "\nGênero: " + author1.getGender() + "\nMétodo toString: " + author1.toString());
        System.out.println("\nNome: " + author2.getName() + "\nEmail: "+author2.getEmail() + "\nGênero: " + author2.getGender() + "\nMétodo toString: " + author2.toString());

    }
}
