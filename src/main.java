public class main {
    public static void main(String[] args) {
        Ksiazka ksiazka1 = new Ksiazka("Harry Potter", "J.K. Rowling", 2001, 39.99, true, 400);
        Ksiazka ksiazka2 = new Ksiazka("Władca Pierścieni", "J.R.R. Tolkien", 1954, 49.99);
        Ksiazka ksiazka3 = new Ksiazka("Java: Podstawy programowania", "John Doe", 2020);
        Ksiazka ksiazka4 = new Ksiazka("Clean Code", "Robert C. Martin", 2008, 79.99, true);
        Ksiazka ksiazka5 = new Ksiazka("Design Patterns", "Erich Gamma", 1994);
        Ksiazka ksiazka6 = new Ksiazka("Inny tytuł", "Inny autor", 2023, 29.99, false, 300);

        // 6. Ustaw za pomocą settera wartości pól
        ksiazka2.setDostepnosc(false);
        ksiazka3.setCena(59.99);
        ksiazka5.setLiczbaStron(250);

        // 7. Utwórz zmienną, która przyjmie wartość przechowywaną przez pole obiektu
        double cenaKsiazki4 = ksiazka4.getCena();
        System.out.println("Cena książki 4: " + cenaKsiazki4);
    }
}

