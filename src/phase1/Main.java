package phase1;

import phase1.Modele.Enseignant;
import phase1.controlleure.*;
import phase1.service.configuration;

import java.util.Objects;
import java.util.Scanner;


public class Main {
    public static void  menuShow()
    {
        int option;
        Scanner scanner=new Scanner(System.in);

        System.out.println("Bonjour ");


        do {
            System.out.println("vous pouvez entrez :" +
                    "1 pour gerez departement" +
                    "\n 2 pour gerez les ensignant" +
                    "\n 3 pour gerez les filiers" +
                    "\n 4 pour gerez les etudiants" +
                    "\n 5 pour gerez les modules" +
                    "\n 0 pour sortir");
            option= scanner.nextInt();
            switch (option)
            {
                case 1:
                    deptcontrolleure.AfficherMenu();
                    break;
                case 2:
                    enseigcontrolleure.AfficherMenu();
                    break;
                case 3:
                    filierecntrl.AfficherMenu();
                    break;
                case 4:
                    etudcontrl.AfficherMenu();
                    break;
                case 5:
                    modulcntrl.AfficherMenu();
                    break;
                default:
                    System.out.println("vous pouvez entrez :" +
                            "1 pour gerez departement" +
                            "\n 2 pour gerez les snsignant" +
                            "\n 3 pour gerez les filiers" +
                            "\n 4 pour gerez les etudiants" +
                            "\n 5 pour gerez les modules" +
                            "\n 0 pour sortir");
            }
        }while (option!=0);
    }



    public static int getIntInput(String...msg)
    {
        Scanner scanner =new Scanner(System.in);
        String message="entrer un nombre entiere";
        if (msg.length>0) message=msg[0];
        System.out.println(message);
        int num=scanner.nextInt();
        return num;

    }
    public static String  getStringInput(String...msg)
    {
        Scanner scanner =new Scanner(System.in);
        String message="entrer un texte";
        if (msg.length>0) message=msg[0];
        System.out.println(message);
        String texte=scanner.nextLine();
        return texte;

    }

    public static void main(String[] args)
    {
        Enseignant enseignant1=new Enseignant();
        enseignant1.setNom("said");
        enseignant1.setPrenom("manani");
        enseignant1.setEmail("mananisaid@gmail.com");
        enseignant1.getGrade();
        enseignant1.setIdens(configuration.getEnsg_id());
        configuration.enseignants.add(enseignant1);
        menuShow();
    }
  public static boolean isNull(Object objects)
  {
    return   objects==null;
  }

}