import java.util.ArrayList;
import java.util.Scanner;

public class main {
    @SuppressWarnings("resource")
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<salarie> salaries = new ArrayList<>();

        while (true) {
            System.out.println("1- Ajouter un concepteur");
            System.out.println("2- Supprimer un concepteur");
            System.out.println("3- Ajouter un analyste");
            System.out.println("4- Supprimer un analyste");
            System.out.println("5- Lister les salariés existants");
            System.out.println("6- Liste des concepteurs existants");
            System.out.println("Faites votre choix (1, 2, 3, 4, 5, 6) : ");
            
            int choix = scanner.nextInt();

            switch (choix) {
            case 1:
                System.out.println("Saisir le code, nom, prénom, date d'embauche et nombre d'années de développement (séparés par -) :");
                scanner.nextLine();
                String[] input1 = scanner.nextLine().split("-");
                if (input1.length == 5) {
                    String code1 = input1[0];
                    String nom1 = input1[1];
                    String prenom1 = input1[2];
                    String dateEmbauche1 = input1[3];
                    int anneesDeveloppement1 = Integer.parseInt(input1[4]);
                    
                    concepteur concepteur = new concepteur(code1, nom1, prenom1, dateEmbauche1, anneesDeveloppement1);
                    salaries.add(concepteur);
                    System.out.println("Concepteur ajouté.");
                } else {
                    System.out.println("Saisie incorrecte.");
                }
                break;
            case 2:
                System.out.println("Saisir le code du concepteur à supprimer :");
                String code2 = scanner.next();
                boolean concepteurSupprime = false;
                for (salarie salarie : salaries) {
                    if (salarie instanceof concepteur && salarie.getCode().equals(code2)) {
                        salaries.remove(salarie);
                        concepteurSupprime = true;
                        System.out.println("Concepteur supprimé.");
                        break;
                    }
                }
                if (!concepteurSupprime) {
                    System.out.println("Concepteur non trouvé.");
                }
                break;
            case 3:
                System.out.println("Saisir le code, nom, prénom, date d'embauche et nombre de déplacements client (séparés par -) :");
                scanner.nextLine();
                String[] input4 = scanner.nextLine().split("-");
                if (input4.length == 5) {
                    String code4 = input4[0];
                    String nom4 = input4[1];
                    String prenom4 = input4[2];
                    String dateEmbauche4 = input4[3];
                    int deplacementsClient4 = Integer.parseInt(input4[4]);
                    
                    analyste analyste = new analyste(code4, nom4, prenom4, dateEmbauche4, deplacementsClient4);
                    salaries.add(analyste);
                    System.out.println("Analyste ajouté.");
                } else {
                    System.out.println("Saisie incorrecte.");
                }
                break;
            case 4:
                System.out.println("Saisir le code de l'analyste à supprimer :");
                String code5 = scanner.next();
                boolean analysteSupprime = false;
                for (salarie salarie : salaries) {
                    if (salarie instanceof analyste && salarie.getCode().equals(code5)) {
                        salaries.remove(salarie);
                        analysteSupprime = true;
                        System.out.println("Analyste supprimé.");
                        break;
                    }
                }
                if (!analysteSupprime) {
                    System.out.println("Analyste non trouvé.");
                }
                break;
            case 5:
                System.out.println("Liste des salariés :");
                for (salarie salarie : salaries) {
                    if (salarie instanceof concepteur) {
                        System.out.println("Concepteur - " + salarie.toString());
                    } else if (salarie instanceof analyste) {
                        System.out.println("Analyste - " + salarie.toString());
                    } else {
                        System.out.println("Salarie non identifié - " + salarie.toString());
                    }
                }
                break;
            case 6:
            	System.out.println("Liste des concepteurs existants");
            	for (salarie salarie : salaries) {
            		if (salarie instanceof concepteur) {
            			System.out.println("Concepteur - " + salarie.toString());
            		}
            	}
            	break;
            }
        }
    }
}
