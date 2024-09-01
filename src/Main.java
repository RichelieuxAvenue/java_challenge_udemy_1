public class Main {
    public static void main(String[]args){
        //créer une variable double qui vaut 20.00
        double valeur1 = 20.00;
        //créer une variable double qui vaut 80.00
        double valeur2 = 80.00;
        //additionne les deux nombre puis multiplie le résultat par 100
        double resultat1 = (valeur1 + valeur2) * 100;
        //quel est le reste de la troisième étape si on divise par 40
        double reste = resultat1 % 40.00;
        //Créer une Variable qui est vrai si l'étape précédente vaut zéro et faux dans le cas contraire
        boolean estDivisible = reste == 0.00 ? true : false;
        System.out.println(estDivisible);
        //Créer une structure conditionnelle pour afficher un message si le reste est divisible par cinq
        if (estDivisible == false){
            System.out.println("Il y a un reste");
        }
    }
}
