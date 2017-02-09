import java.util.Scanner;
//import journal1.Journal;
import journal2.Journal;

public class TestJournal {
    public static void main(String[] args) {
        Journal journal = new Journal();
        Scanner entree = new Scanner(System.in);
        
        boucle: for (;;) {
            System.out.print(">>> ");
            String texte = entree.nextLine().trim();
            if (texte.length() > 0) {
                char com = texte.charAt(0);
                texte = texte.substring(1).trim();
                switch (com) {
                case '+':
                    journal.ajouter(texte);
                    break;
                case '?':
                    if (texte.length() == 0)
                        System.out.println(journal);
                    else
                        System.out.println(journal.toString(texte));
                    break;
                case '!':
                    break boucle;
                default:
                    System.out.println("je ne connais pas " + com);
                }
            }
        }
        System.out.println("Au revoir");    
    }
}
