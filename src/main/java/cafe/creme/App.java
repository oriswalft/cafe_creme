package cafe.creme;

import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {

        //Compter les pièces
        double totalPiecesJaunes = compterPieces();

        //Afficher résultat final
        afficherResulats(totalPiecesJaunes);




    }

    private static void afficherResulats(double totalPiecesJaunes) {
        if (totalPiecesJaunes == 1) {
            System.out.println("Vous avez exactement de quoi vous payez le café ! :D");
        }
        else if (totalPiecesJaunes < 1) {
            double manquePiece = 1 - totalPiecesJaunes;
            System.out.println("Il vous manque " + manquePiece +" euros pour prendre un café! D:");
        }
        else if (totalPiecesJaunes > 1) {
            double pieceEnTrop = totalPiecesJaunes - 1;
            System.out.println("Il vous restera "+ pieceEnTrop +" euros après avoir pris votre café ! :D");
        }
    }

    private static double compterPieces() {
        System.out.println("Bonjour ! Je suis l'assistant de la machine à cafe. Dites moi le nombre de pièces jaunes que vous avez !");
        Scanner clavier = new Scanner(System.in);
        System.out.println("Entrez le nombre de pièces de 1 centimes: ");
        double piece1centime = clavier.nextInt() * 0.01;
        System.out.println("Entrez le nombre de pièces que 2 centimes que vous avez: ");
        double piece2centime = clavier.nextInt() * 0.02;
        System.out.println("Entrez le nombre de pièces de 5 centimes que vous avez: ");
        double piece5centime = clavier.nextInt() * 0.05;
        System.out.println("Entrez e nombre de pièce de 10 centimes que vous avez: ");
        double piece10centime = clavier.nextInt() * 0.10;
        System.out.println("Entez le nombre de pièce de 20 ccentimes que vous avez: ");
        double piece20centime = clavier.nextInt() * 0.20;
        System.out.println("Entrez le nombre de pièce de 50 centimes que vous avez: ");
        double piece50centime = clavier.nextInt() * 0.50;
        clavier.close();

        double totalPiecesJaunes = piece1centime + piece2centime +piece5centime + piece10centime + piece20centime + piece50centime;
        return totalPiecesJaunes;
    }
    
}
