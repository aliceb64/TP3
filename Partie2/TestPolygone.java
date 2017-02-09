public class TestPolygone {

    public static void main(String[] args) {
        Polygone p = new Rectangle(2, 2.5, 10, 14);
        System.out.println("rectangle : " + p);
        System.out.println("     aire : " + p.aire());
        
        p = new Triangle(new Point(5, 5), new Point(9, 5), new Point(7, 7));
        System.out.println(" triangle : " + p);
        System.out.println("     aire : " + p.aire());
        
        p = new PolygoneRegulier(new Point(4, 4), 1, 6);
        System.out.println(" hexagone : " + p);
        System.out.println("     aire : " + p.aire());
    }
} 
