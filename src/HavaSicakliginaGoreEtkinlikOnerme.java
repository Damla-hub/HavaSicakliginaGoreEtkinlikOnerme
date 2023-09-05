import java.util.Scanner;
public class HavaSicakliginaGoreEtkinlikOnerme {
    public static void main(String[] args) {
        int heat;
        System.out.print("Hava sıcaklığını giriniz: ");
        Scanner input=new Scanner(System.in);
        heat=input.nextInt();
        if(heat<5) {
            System.out.print("Kayak yapabilirsin. :)");
        }else if(heat<=15){
            System.out.print("Sinemaya gidebilirsin. =)");
        }
            if(heat<=25){
            System.out.print("\nPikniğe gidebilirsin. *.*");
        }
            if (heat >= 25) {
            System.out.print("\nYüzmeye git. -,-");
        }




    }
}
