import java.time.LocalDate;

public class Carro {
    String modelo;
    int ano;
    String cor;


    void fichaTecnica() {
        System.out.println("\nModelo do carro: " + modelo);
        System.out.println("Ano do carro: " + ano);
        System.out.println("Cor do carro: " + cor);
    }

    void getAnoCarro (int anoCarro) {
        ano = anoCarro;
    }

    double calcularIdadeCarro() {
        int currentYear = LocalDate.now().getYear();
        return currentYear - ano;
    }

}
