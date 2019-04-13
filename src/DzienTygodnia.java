public class DzienTygodnia {
    int numer;
    public DzienTygodnia(int numer)
    {
        this.numer=numer;
    }

    public String zwroc()
    {
        String dzien;
        switch (numer)
        {
        case 1:
            dzien="poniedzialek";
            break;
            case 2:
                dzien="wtorek";
                break;
                case 3:
                    dzien="sroda";
                    break;
            case 4:
                dzien="czwartek";
                break;
            case 5:
                dzien="piatek";
                break;
            case 6:
                dzien="sobota";
                break;
            case 7:
                dzien="niedziela";
            default:
                dzien="Podano zly numer";
    }
    return dzien;
    }

}
