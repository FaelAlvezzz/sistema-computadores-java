// Class de aplicação
public class Main {
    public static void main(String[] args) {
        Computador PC1 = new Computador();
        Computador PC2 = new Computador(8, 16, 512, 8, "MSI B450");
        Computador PC3 = new Computador();
        Computador PC4 = new Computador(12, 24, 2048, 12, "ASUS TUF");

        PC1.entradaDados();
        PC3.entradaDados();

        System.out.println("=================================");
        System.out.println();
        PC1.imprimir();
        System.out.println("=================================");
        System.out.println();
        PC2.imprimir();
        System.out.println("=================================");
        System.out.println();
        PC3.imprimir();
        System.out.println("=================================");
        System.out.println();
        PC4.imprimir();
    }
}