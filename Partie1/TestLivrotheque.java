import document.*;

public class TestLivrotheque {
    public static void main(String[] args) {
        Livrotheque bib = new Livrotheque(100);

       
        bib.ajouter(new Livre(1002, "Guerre et paix", "L. Tolstoi", 2400));
        bib.ajouter(new Roman(1003, "Les raisins de la colère", "J. Steinbeck", 650,
                Roman.NOBEL | Roman.ACADEMIE));
        bib.ajouter(new Manuel(1004, "Algebre", "E. Galois", 120, 2));
        
        
        bib.afficherDocuments();
        System.out.println("-------------------------------------------------------------");
        bib.afficherAuteurs();
        System.out.println("-------------------------------------------------------------");
        
        bib.supprimer(new Roman(1003, "", "", 0, 0));
        bib.afficherDocuments();
    }
}
