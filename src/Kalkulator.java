public class Kalkulator {
    int liczba1;
    int liczba2;
    char znak3;

    public Kalkulator(int liczba1, int liczba2, char znak3)
    {
        this.liczba1=liczba1;
        this.liczba2=liczba2;
        this.znak3=znak3;
    }

    public String policz() {
        double wynik;
        String wypisz;
        switch (znak3) {
            case '+':
                wynik=liczba1+liczba2;
                wypisz=Double.toString(wynik);
                break;
            case '-':
                wynik=liczba1-liczba2;
                wypisz=Double.toString(wynik);
                break;
            case '*':
                wynik=liczba1*liczba2;
                wypisz=Double.toString(wynik);
                break;
            case '/':
                wynik=liczba1/liczba2;
                wypisz=Double.toString(wynik);
                break;
            default:
                wypisz="Zły znak";

        }
        return wypisz;
    }

}
