package phase1.controlleure;

import phase1.Main;
import phase1.Modele.Etudiant;
import phase1.Modele.Filiere;
import phase1.service.*;

public class etudcontrl
{
    public static void AfficherMenu()
    {
        System.out.println("_______________Etudient_____________");

        System.out.println("1: Pour ajouter un Etudient");
        System.out.println("2: Pour afficher les Etudient");
        System.out.println("3: Pour modifier un Etudient");
        System.out.println("4: Pour supprimer un Etudient");
        System.out.println("0: Pour retourner au menu principal");
        int option= Main.getIntInput("veillez entrez un nombre");
        switch (option)
        {
            case 1: ajouterEtd();

                break;
            case 2: affetd();
                break;
            case 3:modifierEtd();
                break;
            case 4:suppEtud();
                break;
            default:Main.menuShow();
        }
    }
    public static void affetd()
    {
        for (Etudiant etudiant:configuration.etudiants)
        {
            System.out.println("id:"+etudiant.getId()+"||nom:"+etudiant.getNom()+"||prenom:"+etudiant.getPrenom()+"||email:"+etudiant.getEmail()+"||apoge:"+etudiant.getAppoge()+"||filieres"+etudiant.getFiliere());
            System.out.println("Notes des modules:");
            for (phase1.Modele.Module module : etudiant.getFiliere().getModules()) {
                double note = service_etudient.obtenirNoteModule(etudiant, module);
                System.out.println(module.getIntitule() + ": " + note);
            }
            System.out.println("------------------------");
        }

        }

    public static void ajouterEtd()
    {
        String nom=Main.getStringInput("donner le nom de l etudiant");
        String prenom=Main.getStringInput("donner le prenom de l etudiant");
        String email=Main.getStringInput("donner l email de l etudiantt");
        int apoge=Main.getIntInput("donner l apogee de l etudiant");

        filierecntrl.afficherFiliere();
        int idfil=Main.getIntInput("selectionner une filiere par id");
        Filiere filiere = service_filiere.getFilById(idfil);
        Etudiant nouvelEtudiant = service_etudient.ajouterEtud(nom, prenom, email, apoge, filiere);
        for (phase1.Modele.Module module : filiere.getModules()) {
            double note = Main.getIntInput("Entrer la note pour le module " + module.getIntitule() + " de l'étudiant:");
            service_etudient.ajouterNoteModule(nouvelEtudiant, module, note);
        }

        service_etudient.ajouterEtud(nom,prenom,email,apoge,service_filiere.getFilById(idfil));
       affetd();
        AfficherMenu();
    }
    public static void modifierEtd()
    {
        affetd();
        int id=Main.getIntInput("selectionner un etudiant par id");
        String nom=Main.getStringInput("donner le nom de l etudiant");
        String prenom=Main.getStringInput("donner le prenom de l etudiant");
        String email=Main.getStringInput("donner l email de l etudiantt");
        int apoge=Main.getIntInput("donner l apogee de l etudiant");

        filierecntrl.afficherFiliere();
        int idfil=Main.getIntInput("selectionner une filiere par id");


        service_etudient.modifierEtud(id,nom,prenom,email,apoge,service_filiere.getFilById(idfil));
        affetd();
        AfficherMenu();


    }
    public static void suppEtud()
    {
        affetd();
        int id=Main.getIntInput("selectionner un etudiant par id");
        service_etudient.supprEtud(id);
        affetd();
        AfficherMenu();
    }

}
