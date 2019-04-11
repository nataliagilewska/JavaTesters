public class SumaCyfr {
    int liczba;
    public SumaCyfr(int liczba)
    {
        this.liczba=liczba;
    }
    public int Oblicz()
    {
        int wynik = 0;
        while (liczba != 0) {
            wynik += liczba%10;
            liczba /= 10;
        }
        return wynik;
    }
}
