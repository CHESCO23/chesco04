package leitura_e_escrita_de_dados_em_arquivo;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class exercicio01 {
    /*
Crie uma lista de tarefas e salve a lista em um arquivo

Crie um programa que vai receber, através do console, uma lista de atividades que vai ajudar o usuário a planejar suas tarefas para o dia seguinte.
Depois que o usuário informar, uma a uma, suas tarefas, as mesmas serão salvas em um arquivo de texto - cada tarefa vai ocupar uma linha desse arquivo.
Para receber cada tarefa do usuário, use o laço while. Enquanto o usuário não digitar um "x" no console, continue pedindo que ele informe as atividades.
 */
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> linhas = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            System.out.println("Informe as tarefas " + i + ":");
            String nome = scanner.nextLine();
            linhas.add(nome);
        }

        Path arquivo02 = Paths.get("C:\\Users\\aluno.LABCETEC\\Desktop\\chesco23.txt");

        Files.write(arquivo02,linhas);

        scanner.close();
    }
}
