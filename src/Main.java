import java.util.Scanner;
 class Main {
    public static void main(String[] args) {
        double Armut = 2.14, Elma = 3.67, Domates = 1.11,Muz = 0.95,Patlican = 5.00, toplam = 0, kg;
        Scanner inp = new Scanner(System.in);
        System.out.println("Kaç Kilo Arrmut: ");
        kg = inp.nextDouble();
        toplam += kg * Armut;
        System.out.println("Kaç Kilo Elma: ");
        kg = inp.nextDouble();
        toplam += kg*Elma;
        System.out.println("Kaç Kilo Domates: ");
        kg = inp.nextDouble();
        toplam += kg*Domates;
        System.out.println("Kaç Kilo Muz: ");
        kg = inp.nextDouble();
        toplam += kg*Muz;
        System.out.println("Kaç Kilo Patlican: ");
        kg = inp.nextDouble();
        toplam += kg*Patlican;
        System.out.println("Toplam Borcunuz: " + toplam);

    }
}