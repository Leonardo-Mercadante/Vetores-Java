import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String data[] = {"28/09/2021", "29/09/2021", "30/09/2021"};
        String aluno[] = {"Leonardo", "Márcia", "Talita"};

        String[][] chamada = new String[data.length][aluno.length];

        for (int i = 0; i < data.length; i++) {
            System.out.println("Lista de presença do dia " + data[i]);
            for (int x = 0; x < aluno.length; x++) {
                System.out.println(aluno[x] + " está presente.");

            }
        }
    }
}