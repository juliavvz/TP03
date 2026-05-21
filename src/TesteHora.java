package src;

public class TesteHora {
    public static void main(String[] args) {
    
    // teste construtores com parametros 
    Hora h1 = new Hora(13, 14, 15);

        System.out.println("COM PAREMETROS(FORMATAÇÃO PADRÃO)")  ;
        System.out.println("Hora formato 24h: " + h1.getHora1());
        System.out.println("Hora formato AM/PM: " + h1.getHora2());
        System.out.println("Total de segundos: " + h1.getSegundos());

    // Teste dos getters
        System.out.println("\nGETTERS");
        System.out.println("Hora: " + h1.getHor());
        System.out.println("Minuto: " + h1.getMin());
        System.out.println("Segundo: " + h1.getSeg());
    
     // Teste dos setters com parametros
        System.out.println("\nALTERA HORA");
        h1.setHor(11);
        h1.setMin(22);
        h1.setSeg(33);
        System.out.println("nova hora:" + h1.getHora1());

    //teste contrutores sem parametros
        System.err.println("\n SEM PARAMETROS(FORMATAÇÃO PADRÃO)");
    Hora h2 = new Hora();
        System.out.println("Hora formato 24h: " + h2.getHora1());
        System.out.println("Hora formato AM/PM: " + h2.getHora2());
        System.out.println("Total de segundos: " + h2.getSegundos());

   //teste setters sem parametros 
        System.out.println("ALTERA HORA(SEM PARAMETORS)");
        h2.setHor();
        h2.setMin();
        h2.setSeg();
        System.out.println("nova hora:" + h2.getHora1());

        Hora.fecharScanner();


 }
}
