import java.util.ArrayList;
import java.util.Scanner;

class Book {
    String title;
    String author;

    Book(String title, String author){
        this.title = title;
        this.author = author;
    }
}

class Library {
    ArrayList<Book> books = new ArrayList<>();

    void addBook(String title, String author){
        books.add(new Book(title, author));
        System.out.println("Book added: " + title);
    }

    void displayBooks(){
        System.out.println("Library Books:");
        for(Book b : books){
            System.out.println(b.title + " by " + b.author);
        }
    }
}

public class LibraryManagement {
    public static void main(String[] args){
        Library library = new Library();
        Scanner sc = new Scanner(System.in);
        int choice;
        while(true){
            System.out.println("\n1.Add Book 2.Display Books 3.Exit");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline
            switch(choice){
                case 1:
                    System.out.print("Enter title: "); String title = sc.nextLine();
                    System.out.print("Enter author: "); String author = sc.nextLine();
                    library.addBook(title, author); break;
                case 2:
                    library.displayBooks(); break;
                case 3: return;
                default: System.out.println("Invalid choice");
            }
        }
    }
}
