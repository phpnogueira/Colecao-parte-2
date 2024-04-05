import java.util.*;

public class ColecaoParte2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Cadastro> pessoa = new ArrayList<>();


        System.out.println("Digite os nomes e sexos separados por vírgula (nome,sexo):");
        String input = scanner.nextLine();


        String[] entries = input.split(",");


        for (int i = 0; i < entries.length; i += 2) {
            String nome = entries[i].trim();
            String sexo = entries[i + 1].trim();
            Cadastro cadastro = new Cadastro(nome, sexo);
            pessoa.add(cadastro);
        }


        System.out.println("Nomes separados por sexo:");
        for (Cadastro cadastro : pessoa) {
            if (cadastro.getSexo().equalsIgnoreCase("masculino")) {
                System.out.println("Masculino: " + cadastro.getNome());
            } else if (cadastro.getSexo().equalsIgnoreCase("feminino")) {
                System.out.println("Feminino: " + cadastro.getNome());
            }
        }


        scanner.close();
    }
}