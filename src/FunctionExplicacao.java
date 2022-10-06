public class FunctionExplicacao {
    public static void main(String[] args) throws Exception{
        // 10% garçom
        // 20% couvert
        // Pedro 80
        // Andre 50
        // Montanha 30
        // Amanda 100
//        double contaPedro = 80;
//        double gorjetaPedro = contaPedro * 0.1;
//        double couvertPedro = contaPedro * 0.2;
//        double totalPedro = contaPedro + gorjetaPedro + couvertPedro;
//        System.out.println("Pedro");
//        System.out.println("Total Consumido: "+contaPedro);
//        System.out.println("Gorjeta: "+gorjetaPedro);
//        System.out.println("Couvert: "+couvertPedro);
//        System.out.println("Total geral: "+totalPedro);
//
//
//        double contaAndre = 50;
//        double gorjetaAndre = contaPedro * 0.1;
//        double couvertAndre = contaPedro * 0.2;
//        double totalAndre = contaAndre + gorjetaAndre + couvertAndre;
//        System.out.println("\nAndré");
//        System.out.println("Total Consumido: "+contaAndre);
//        System.out.println("Gorjeta: "+gorjetaAndre);
//        System.out.println("Couvert: "+couvertAndre);
//        System.out.println("Total geral: "+totalAndre);
        calculaImprimeConta(80, "Pedro");
        calculaImprimeConta(50, "André");
        calculaImprimeConta(30, "Montanha");
        calculaImprimeConta(100, "Amanda");
    }


    public static void calculaImprimeConta(double conta, String nome){
        double gorjeta = conta * 0.1;
        double couvert = conta * 0.2;
        double total = conta + gorjeta + couvert;
        System.out.println(nome);
        System.out.println("Total Consumido: "+conta);
        System.out.println("Gorjeta: "+gorjeta);
        System.out.println("Couvert: "+couvert);
        System.out.println("Total geral: "+total);
    }
}
