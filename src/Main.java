import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Note> notes = new ArrayList<>();



        System.out.println("What id do you want your branch to have?");
        String ID = scanner.next();
        System.out.println("Title: ");
        String TITLE = scanner.next();
        System.out.println("Content: ");
        String CONTENT = scanner.next();

        Note note = new Note(ID , TITLE , CONTENT);
        notes.add(note);

        System.out.println("Do you want to view current notes?");
        String answer = scanner.next();


        if(answer == "yes"){
            System.out.println(notes);
        } else {
            System.out.println("See you next time!");
        }


        System.out.println("Do you want to delete a note?");
        String answer2 = scanner.next();
        if(answer2 == "yes"){
            System.out.println("Which note do you want to delete? Give id");
            String ID2 = scanner.next();
        } else {
            System.out.println("Goodbye");
        }

    }
}
