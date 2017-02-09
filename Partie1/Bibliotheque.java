import document.Document;
import document.Livre;

public class Bibliotheque {
    protected Document[] docs;
    protected int capacite;
    protected int nombre;
    
    public Bibliotheque(int capacite) {
        this.capacite = capacite;
        docs = new Document[capacite];
        nombre = 0;
    }

    public void afficherDocuments() {
        for (int i = 0; i < nombre; i++)
            System.out.println(docs[i]);
    }
    
    public boolean ajouter(Document doc) {
        if (nombre < docs.length) {
            docs[nombre++] = doc;
            return true;
        }
        return false;
    }
    
    public Document document(int i) {
        return docs[i];
    }
    
    public void afficherAuteurs() {
        for (int i = 0; i < nombre; i++)
            if (docs[i] instanceof Livre) 
                System.out.println(((Livre)docs[i]).auteur());
    }
    
    public boolean supprimer(Document doc) {
        for (int i = 0; i < nombre; i++) {
            if (docs[i].equals(doc)) {
                for (int j = i + 1; j < nombre; j++)
                    docs[j - 1] = docs[j];
                nombre--; 
                return true;
            }
        }
        return false;
    }
}
