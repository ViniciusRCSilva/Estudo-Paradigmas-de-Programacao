import java.util.Scanner; 
public class App {
    public static void main(String[] args) throws Exception {
        int numVotantes, i, voto, votoInvalido;
        Scanner scan = new Scanner(System.in);
        Candidato one = new Candidato(0, "Reginaldo");
        Candidato two = new Candidato(0, "Robson");
        Candidato three = new Candidato(0, "Roger");

        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

        System.out.println("Indique a quantidade de eleitores: ");
        numVotantes = scan.nextInt();

        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        
        for(i = 0; i < numVotantes; i++){
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            System.out.println("Digite 1 para votar no candidato 1: ");
            System.out.println("Digite 2 para votar no candidato 2: ");
            System.out.println("Digite 3 para votar no candidato 3: ");
            voto = scan.nextInt();
            
            if(voto == 1) {
                one.voto++;
            } else if(voto == 2){
                two.voto++;
            } else if(voto == 3){
                three.voto++;
            } else{
                System.out.println("Invalido ");
            }
            
        }
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        System.out.println("\nVotos para o candidato 1: ");
        System.out.println(one.voto);
        System.out.println("\nVotos para o candidato 2: ");
        System.out.println(two.voto);
        System.out.println("\nVotos para o candidato 3: ");
        System.out.println(three.voto);

    }
}
