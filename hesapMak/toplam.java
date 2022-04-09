import java.util.Scanner;

/**
 * toplam
 */
public class toplam {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double s1=input.nextDouble();
        double s2=input.nextDouble();
       
        double toplam=s1+s2;
        System.out.println("toplam:" +toplam);

        double bolme=s1/s2;
        System.out.println("BOLUM:" +bolme);


        try {
            double HatalıBolme=s1/s2;

        }

        catch (Exception e){
            System.out.println("bir sayi sifira bolunemez ");
        }
    }
}