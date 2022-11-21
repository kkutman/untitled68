public class Main {
    public static void main(String[] args) {
       JumaKundoru jumaKundoru = JumaKundoru.SHARSHENBI;
       switch (jumaKundoru){
           case DUISHONBU :
               System.out.println("TEORIA IN JAVA1");
               break;
           case SHARSHENBI:
               System.out.println("PRAKTIK DAI!");
               break;
           case SHEISHEMBI:
               System.out.println("TEORIA IN JAVA1");
               break;
           case BEISHEMBI:
               System.out.println("PRAKTIK DAI!");
               break;
           case JUMA:
               System.out.println("EVENT");
               break;
           case ISHENBI:
               System.out.println("Otdyh");
               break;
           case JEKSHEMBI:
               System.out.println("Otdyh");
               break;
       }
    }
}