public class Main {

    public static void main(String[] args) {

        Integer valor1 = 12;
        Integer valor2 = valor1;

        System.out.println(valor1);
        System.out.println(valor2);
        valor2 = 20;
        System.out.println(valor1);
        System.out.println(valor2);
        Double valor3 = 12d;
        Double valor4 = 8d;
        Double resultado = valor3 / valor4;
        System.out.println(resultado);
        String mentorama = ("Mentorama");
        System.out.println(mentorama);
        char vetores [] = {'M', 'e', 'n'};
        String texto = String.valueOf(vetores);
        System.out.println(texto);

        long longConvertido = 12;
        String valor = String.valueOf(longConvertido);
        System.out.println(valor);

        Double valorDouble = Double.valueOf(valor);
        System.out.println(valorDouble);
    }


}
