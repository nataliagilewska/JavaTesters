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

    }
}
