package phase1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {

        int n;
        Scanner scanner=new Scanner(System.in);

        System.out.println("Bonjour ");

        do {
            System.out.println("vous pouvez entrez :" +
                    "1 pour gerez departement" +
                    "\n 2 pour gerez les snsignant" +
                    "\n 3 pour gerez les filiers" +
                    "\n 4 pour gerez les etudiants" +
                    "\n 5 pour gerez les modules");
            n= scanner.nextInt();
        }while (n<1||n>6);
        List<Departement> departements=new ArrayList<>();
        List<Module> modules=new ArrayList<>();
        List<Enseignant> enseignants =new ArrayList<>();
        List<Filiere> filieres= new ArrayList<>();
        List<Etudiant> etudiants=new ArrayList<>();
        //ajouter des elements a la colection Departement
        Departement Mecanique= new Departement("Mecanique",null);
        departements.add(Mecanique);
        for (Departement departement:departements)
        {
            System.out.println(departement.getIntitule());
            System.out.println(departement.getResponsable());
        }
        //ajouter des elements a la colection Ensignant
        Enseignant enseignant1=new Enseignant("Dachry","Wafaa","dachry@uhp.ac.ma"," ",Mecanique );
        enseignants.add(enseignant1);
        for (Enseignant enseignant: enseignants)
        {
            System.out.println(enseignant.toString());

        }
        //ajouter des elements a la colection filier
        Filiere SITD=new Filiere("SITD",enseignant1,Mecanique);
        filieres.add(SITD);
        for (Filiere filiere: filieres)
        {
            System.out.println(filiere.toString());
        }
        //ajouter des elements a la colection module
        Module module1 =new Module("E-businesse",SITD,enseignant1);
        modules.add(module1);
        for (Module module:modules)
        {
            System.out.println(module.toString());
        }

        //ajouter des elements a la colection module
        Etudiant etudiant1 = new Etudiant("Aresmouk","hafsa","hafssaares2002@gmail.com",200888);

        etudiants.add(etudiant1);
        for (Etudiant etudiant:etudiants
        ) {
            System.out.println(etudiant.toString());

        }
    }
}