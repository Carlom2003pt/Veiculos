import java.util.Scanner;
public class ProgVeiculos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Valor do combustivel: ");
        double combustivel = sc.nextDouble();
        sc.nextLine();
        System.out.print("Quantos automoveis? ");
        int N = sc.nextInt();
        sc.nextLine();
        Carros[] auto = new Carros[N];
        System.out.print("Quantas motas? ");
        int M = sc.nextInt();
        sc.nextLine();
        Motos[] motos = new Motos[M];
        for(int i=0;i<N;i++){
            Carros a = new Carros();
            System.out.print("Insira a Marca do "  + (i + 1) + "º automovel: ");
            a.setMarca(sc.nextLine());
            System.out.print("Insira o Modelo da " + (i+1) + "º automovel: ");
            a.setModelo(sc.nextLine());
            System.out.print("Insira a Custo da " + (i + 1) + "º automovel: ");
            a.setCusto(sc.nextDouble());
            sc.nextLine();
            auto[i]=a;
        }
        for(int i=0;i<M;i++){
            Motos m = new Motos();
            System.out.print("Insira a Marca da "  + (i + 1) + "ª moto: ");
            m.setMarca(sc.nextLine());
            System.out.print("Insira o Modelo da " + (i+1) + "ª moto: ");
            m.setModelo(sc.nextLine());
            System.out.print("Insira a Custo da " + (i + 1) + "ª moto: ");
            m.setCusto(sc.nextDouble());
            sc.nextLine();
            motos[i]=m;
        }
        double custoTotalAuto=0;
        for(int i=0;i<N;i++) {
            System.out.println(auto[i].ToString());
            custoTotalAuto += auto[i].getCusto();
        }
        System.out.print("O custo total dos automoveis é: "+ custoTotalAuto);
        double custoTotalMoto=0;
        for(int i=0;i<M;i++) {
            System.out.println(motos[i].ToString());
            custoTotalMoto += motos[i].getCusto();
        }
        System.out.print("O custo total das motos é: "+ custoTotalMoto);
        double total= custoTotalAuto+custoTotalMoto+combustivel*(N+M);
        System.out.print("O custo total é: "+ total);
    }
}
