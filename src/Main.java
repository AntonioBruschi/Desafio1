public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.modelo = "Kwid Intense";
        carro.cor = "Azul";
        carro.ano = 2021;

        carro.fichaTecnica();

        System.out.println("A idade atual do carro é de: " + carro.calcularIdadeCarro());
    }
}


