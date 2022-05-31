//4.Crie uma agenda que armazena, código da pessoa, número do telefone,idade. Sua agenda deve possibilitar:
//        (1) – inserir um contato
//        (2) – Remover um contato
//        (3) – Editar um contato

package ex4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        ArrayList<String> agenda = new ArrayList();

        agenda.add("Michel Pinto; 41 99999-8888 \n");
        agenda.add("Ubiratan Passos; 41 77777-6666 \n");
        agenda.add("Clecio Silva; 41 55555-4444 \n");
        agenda.add("Rafaela Tobio; 41 33333-2222 \n");


        int i;

        System.out.println("***************");
        System.out.println("Sua agenda");
        System.out.println("*************** \n");

        int tamanho = agenda.size();
        for (i=0; i<tamanho; i++) {
            System.out.printf(agenda.get(i)); //get pega o item da agenda
        }

        System.out.printf("\nQuem você deseja remover da sua lista de contato? \n");
        i = scanner.nextInt();

//

        agenda.remove(i);


        System.out.printf("\nPercorrendo o ArrayList (usando iterator)\n");
        i = 0;
        Iterator<String> iterator = agenda.iterator();
        while (iterator.hasNext()) {
            System.out.printf("Posição %d- %s\n", i, iterator.next());
            i++;
        }
    }

}
