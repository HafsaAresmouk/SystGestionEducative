package phase1.controlleure;

import phase1.Main;
import phase1.Modele.Enseignant;
import phase1.service.configuration;
import phase1.service.service_departement;
import phase1.service.service_enseignant;

public class enseigcontrolleure

{
    public static void AfficherMenu()
    {
        System.out.println("_______________Enseignant_____________");

        System.out.println("1: Pour ajouter un Enseignant");
        System.out.println("2: Pour afficher les Enseignant");
        System.out.println("3: Pour modifier un Enseignant");
        System.out.println("4: Pour supprimer un Enseignant");
        System.out.println("0: Pour retourner au menu principal");
        int option= Main.getIntInput("veillez entrez un nombre");
        switch (option)
        {
            case 1:ajouterEns();
                break;
            case 2:afficherEnsg();
                break;
            case 3:modEnse();
                break;
            case 4:suppEnse();
                break;
            default:Main.menuShow();
        }
    }
    public static void afficherEnsg()
    {
        for (Enseignant enseignant: configuration.enseignants)
        {
            System.out.println("id"+enseignant.getId()+"||nom"+enseignant.getNom()+"||prenom"+"||email"+enseignant.getEmail()+"||grade"+enseignant.getGrade());
            if (!Main.isNull(Enseignant.getDepartement()))
            {
                System.out.print("nom de departement:"+enseignant.getDepartement().getNom()+"nom de responsable de departement"+enseignant.getDepartement().getResponsable());
            }

        }
    }
    public static void ajouterEns()
    {
        String nom=Main.getStringInput("donner le nom de l enseignant");
        String prenom=Main.getStringInput("donner le prenom de l enseignant");
        String email=Main.getStringInput("donner l email de l enseignant");
        String grade=Main.getStringInput("donner le grade de l enseignant");
        deptcontrolleure.afficherDept();
        int id=Main.getIntInput("selectionner un departement par id");
        service_enseignant.addEnsg(nom,prenom,email,grade, service_departement.getDeptById(id));
        afficherEnsg();
        AfficherMenu();

    }
    public static void modEnse()
    {
       afficherEnsg();
       int id=Main.getIntInput("selectionner un enseignant par id");
        String nom=Main.getStringInput("donner le nom de l enseignant");
        String prenom=Main.getStringInput("donner le prenom de l enseignant");
        String email=Main.getStringInput("donner l email de l enseignant");
        String grade=Main.getStringInput("donner le grade de l enseignant");
        deptcontrolleure.afficherDept();
        int iddep=Main.getIntInput("selectionner un departement par id");
        service_enseignant.modifierEnsg(id,nom,prenom,email,grade, service_departement.getDeptById(iddep));
        afficherEnsg();
        AfficherMenu();

    }
    public static void suppEnse()
    {
       afficherEnsg();
        int id=Main.getIntInput("selectionner un enseignant par id");
        service_enseignant.supprEnsg(id);
        afficherEnsg();

    }





}
