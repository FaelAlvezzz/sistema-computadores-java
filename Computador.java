import java.util.Scanner;

//Computador class
public class Computador {
    //Atributos
    int memoriaRam, ssd, placaDeVideo, cpu;
    String placaMae;

//Construtores
public Computador(){
    //Construtor Vazio
}


public Computador(int cpu, int memoriaRam, int ssd, int placaDeVideo, String placaMae) {
    this.cpu = cpu;
    this.memoriaRam = memoriaRam;
    this.ssd = ssd;
    this.placaDeVideo = placaDeVideo;
    this.placaMae = placaMae;
}

//Getters e Setters
public int getCpu() {
    return this.cpu;

}
public void setCpu(int cpu) {
    if (cpu > 8) {
       this.cpu = cpu;
    }
}

public int getMemoriaRam() {
    return this.memoriaRam;
}
public void setMemoriaRam(int memoriaRam) {
    if(memoriaRam > 0) {
        this.memoriaRam = memoriaRam;
    }
}

public int getSsd() {
    return this.ssd;
}
public void setSsd(int ssd) {
    if(ssd > 128 && ssd < 2048) {
        this.ssd = ssd;
    }
}

public int getPlacaDeVideo() {
    return this.placaDeVideo;
}
public void setPlacaDeVideo(int placaDeVideo) {
    if(placaDeVideo > 0){
        this.placaDeVideo = placaDeVideo;
    }
}

public String getPlacaMae() {
    return this.placaMae;
}
public void setPlacaMae(String placaMae) {
    if(placaMae.isEmpty() && placaMae.length() > 3) {
        this.placaMae = placaMae;
    }
}

//metodo imprimir
public void imprimir() {
    System.out.println("CPU: " + cpu + "núcleos/threads");
    System.out.println("Memoria RAM: " + memoriaRam + "GB");
    System.out.println("SSD: " + ssd + "GB");
    System.out.println("Placa de Video: " + placaDeVideo + "GB");
    System.out.println("Placa Mae: " + placaMae);
}

//Metodo Entrada de dados
public void entradaDados() {
    Scanner sc = new Scanner (System.in);
    
    System.out.println();
    System.out.println("DIGITE OS DADOS DO COMPUTADOR");
    System.out.println("=================================");
    System.out.print("Digite o nome da placa mãe: ");
    this.placaMae = sc.next();
    System.out.print("Digite o nome do CPU: ");
    this.cpu = sc.nextInt();
    System.out.print("Digite a memoria RAM (em GB): ");
    this.memoriaRam = sc.nextInt();
    System.out.print("Digite o tamanho do SSD (em GB): ");
    this.ssd = sc.nextInt();
    System.out.print("Digite o tamanho da placa de video (em GB)");
    this.placaDeVideo = sc.nextInt();
    System.out.println("=================================");
    System.out.println("Dados do computador inseridos com sucesso!");
    System.out.println("================================="); 
}
}






