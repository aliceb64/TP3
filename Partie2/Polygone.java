public class Polygone {
    protected Point[] sommets;

    public Polygone(Point[] sommets) {
        this.sommets = sommets;
    }

    protected Polygone(int nbrSommets) {
        sommets = new Point[nbrSommets];
    }
    
    public Point getSommet(int i) {
        return sommets[i];
    }

    public double aire() {
        int n = sommets.length;
        double s = (sommets[n - 1].getY() + sommets[0].getY())
                * (sommets[n - 1].getX() - sommets[0].getX());
        for (int i = 1; i < n; i++)
            s += (sommets[i - 1].getY() + sommets[i].getY())
                    * (sommets[i - 1].getX() - sommets[i].getX());
        return Math.abs(s) / 2;
    }
    
    public String toString() {
        String res = "[ ";
        for (int i = 0; i < sommets.length; i++)
            res += sommets[i] + " ";
        return res + "]";
    }
} 
