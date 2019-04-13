import java.math.MathContext;
import java.math.*;
public class Main {

    public static void main(String[] args) {
        boolean b = true;
        char c = 'a';
        int i = 7;
        long l = 40;
        float f = 4.7f;
        double d = 4.43;
        String s = "abc";
        int a1=10;
        int a2=2;
        int suma=a1+a2;
        int roznica = a1-a2;
        int iloczyn = a1*a2;
        int iloraz=a1/a2;
        int modulo =a1%a2;

        //cz.1 ZAD 1
        System.out.println(b);
        System.out.println(c);
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
        System.out.println(s);
        //cz.1 ZAD 2
        System.out.println("dodawanie: "+suma);
        System.out.println("odejmowanie: "+roznica);
        System.out.println("mnozenie: "+iloczyn);
        System.out.println("dzielenie: "+iloraz);
        System.out.println("reszta z dzielenia: "+modulo);
        //cz.1 ZAD 3
        /*double Celsjusz=20;
        double Fahrenheit;
        Fahrenheit=1.8*Celsjusz+32;
        System.out.println(Celsjusz+" stopni Celsjusza to "+Fahrenheit+" stopni Fahrenheita");
        Celsjusz=(Fahrenheit-32)/1.8;
        System.out.println(Fahrenheit+" stopni Fahrenheita to "+Celsjusz+" stopni Celsjusza");*/
        Celsjusz celsjusz = new Celsjusz(18);
        System.out.println(18+" celsjuszy to "+celsjusz.celsjuszeNaFahrenheity()+" Fahrenheitow");
        Fahrenheit fahrenheit = new Fahrenheit (20);
        System.out.println(20+" fahrenheitow to "+fahrenheit.fahrenheityNaCelsjusze()+" Celsjuszy");
        //ZAD4
        SumaCyfr liczba = new SumaCyfr(1234);
        System.out.println("Suma cyfr w liczbie 1234 to "+liczba.Oblicz());

        //cz.2 zad. 1
        int z1=1;
        int z2=2;
        int z3=3;
        int z[]={1,2,3};
        int z4=java.lang.Math.max(z1,z2);
        z4=java.lang.Math.max(z4,z3);
        System.out.println("Max to: "+z4);
        int z5=java.lang.Math.min(z1,z2);
        z5=java.lang.Math.min(z5,z3);
        System.out.println("Min to: "+z5);

        //cz.2 zad. 2
        double bmi;
        double waga=60;
        double wzrost =1.75;
        bmi=waga/(wzrost*wzrost);
        System.out.println("Bmi: "+bmi);
        if ((bmi>=18.5)&&(bmi<=24.9))
        {
            System.out.println("Waga prawidłowa");
        }
        else if (bmi<18.5)
        {
            System.out.println("Niedowaga");
        }
        else
        {  System.out.println("Nadwaga");}

        //cz.2 ZAD 3
        /*3. Napisz program, który za pomocą konstrukcji switch sprawdza, jaki jest dzień tygodnia
 (dzień tygodnia deklarujemy jako zmienną int, 1-poniedzialek itd.). Jeżeli liczba jest spoza zakresu, program powinien zwrócić błąd.
4. Zadeklaruj trzy zmienne, dwie liczbowe oraz jedną znakową (char), a następnie przy pomocy switcha napisz prosty kalkulator
(char to symbol działania: +, -, itd.).
*/
        DzienTygodnia numer=new DzienTygodnia(2);
        System.out.println(numer.zwroc());

    }
}
