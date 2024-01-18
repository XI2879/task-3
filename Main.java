public class Main {
    public static void main(String[] args) {


        Book b3 = new Book(132, "C", "Rayon", true);

        Book b4 = new Book(124, "Python", "John", true);

        Book b5 = new Book(129, "Java", "Vicky", true);

        Book b6 = new Book(128, "Html", "Thomas", true);

        Book b7 = new Book(127, "Css", "phillip", true);

        Library l1 = new Library();
        l1.addBook(new Book[]{b3, b4, b5, b6, b7});


        System.out.println("      ");

        l1.searchBook(124);
        System.out.println("      ");
        l1.show();
        System.out.println("      ");

        l1.replaceBook(129, "python");
        l1.searchBook(129);


    }
}