public class MinhaClasse {
public static void main(String[] args) {
    String primieroNome = "Isadora";
    String segundoNome = "Eduarda";

    String nomeCompleto = nomeCompleto(primieroNome, segundoNome);

    System.out.println(nomeCompleto);
}

public static String nomeCompleto (String primeiroNome, String segundoNome) {
    return "Resultato do metodo " + primeiroNome.concat(" ").concat(segundoNome);
}

}
