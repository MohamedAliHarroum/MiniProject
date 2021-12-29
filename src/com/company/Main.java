package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Matiere matiere = new Matiere();
        Double moyenneMatiere=0.0;
        String nombreChaine ="0123456789";
        String noteExamen;
        Scanner scanIn = new Scanner(System.in);
        System.out.println("***************************************************************************************************************");
        System.out.println("***************************************************************************************************************");
        System.out.println();
        System.out.println("une petite application pour calculer le moyenne d'une matiere pour un etudiant !" );
        System.out.println();
        System.out.println("s'il vous plait entrez votre informations :" );
        System.out.println();
        System.out.println("Bonne chance ");
        System.out.println();
        do {
            System.out.println("le nom de matiere :");
            matiere.nomMatiere = scanIn.nextLine();


        }while(matiere.nomMatiere.isEmpty()==true ||!(matiere.nomMatiere.matches("[a-zA-Z]+")));
          do {
              System.out.println(" le note d'examen :");
              matiere.noteExamen = scanIn.nextDouble();
             noteExamen=String.valueOf(matiere.nomMatiere);
          }while((matiere.noteExamen <0 || matiere.noteExamen >20) );
        do {
            System.out.println("le note TP :");
            matiere.noteTP = scanIn.nextDouble();
        }while(matiere.noteTP <0 || matiere.noteTP >20);
        do {
            System.out.println(" le note DS :");
            matiere.noteDS = scanIn.nextDouble();
        }while(matiere.noteDS <0 || matiere.noteDS >20);


        if(noteExamen.isEmpty()==true)
        {
            System.out.println("impossible de calcluer le moyenne son avoir le note d'examen");
        } else if (matiere.getNoteTP() ==0.0)
        {
            moyenneMatiere=matiere.noteExamen*0.7+ matiere.noteDS*0.3;
        } else
        {
            moyenneMatiere=matiere.noteExamen*0.5+ matiere.noteDS*0.3+matiere.noteTP*0.2;
        }
        System.out.println("**************************************************************************");
        System.out.println("  le moyenne  est :  "+moyenneMatiere);
        if (moyenneMatiere>=10)
        {
            System.out.println(" la matiere   " +matiere.nomMatiere+ "   est validée  ");
        } else
        {
            System.out.println("la matiere   " +matiere.getNomMatiere()+ "  est non  validée  ");
        }
        System.out.println();
        System.out.println("Merci pour votre essayer ");
        System.out.println();
        System.out.println("***************************************************************************************************************");
        System.out.println("***************************************************************************************************************");
    }

}
