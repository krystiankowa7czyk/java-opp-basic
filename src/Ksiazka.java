public class Ksiazka {
    private String tytul;
    private String autor;
    private int rokWydania;
    private double cena;
    private boolean dostepnosc;
    private int liczbaStron;

    // 2. Konstruktory
    public Ksiazka(String tytul, String autor, int rokWydania, double cena, boolean dostepnosc, int liczbaStron) {
        this.tytul = tytul;
        this.autor = autor;
        this.rokWydania = rokWydania;
        this.cena = cena;
        this.dostepnosc = dostepnosc;
        this.liczbaStron = liczbaStron;
    }

    public Ksiazka(String tytul, String autor, int rokWydania, double cena) {
        this(tytul, autor, rokWydania, cena, true, 0);
    }

    public Ksiazka(String tytul, String autor, int rokWydania) {
        this(tytul, autor, rokWydania, 0.0, true, 0);
    }

    // 3. Skrócony konstruktor
    public Ksiazka(String tytul, String autor, int rokWydania, double cena, boolean dostepnosc) {
        this(tytul, autor, rokWydania, cena, dostepnosc, 0);
    }

    // 4. Metody dostępowe (getter, setter)
    public String getTytul() {
        return tytul;
    }

    public void setTytul(String tytul) {
        this.tytul = tytul;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getRokWydania() {
        return rokWydania;
    }

    public void setRokWydania(int rokWydania) {
        this.rokWydania = rokWydania;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public boolean isDostepnosc() {
        return dostepnosc;
    }

    public void setDostepnosc(boolean dostepnosc) {
        this.dostepnosc = dostepnosc;
    }

    public int getLiczbaStron() {
        return liczbaStron;
    }

    public void setLiczbaStron(int liczbaStron) {
        this.liczbaStron = liczbaStron;
    }
}