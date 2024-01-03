package phase1.controlleure;

import phase1.Main;
import phase1.Modele.Filiere;
import phase1.service.configuration;
import phase1.service.service_departement;
import phase1.service.service_enseignant;
import phase1.service.service_filiere;

public class filierecntrl
{
    public static void AfficherMenu()
    {
        System.out.println("_______________Departement_____________");

        System.out.println("1: Pour ajouter un département");
        System.out.println("2: Pour afficher les départements");
        System.out.println("3: Pour modifier un département");
        System.out.println("4: Pour supprimer un département");
        System.out.println("0: Pour retourner au menu principal");
        int option= Main.getIntInput("veillez entrez un nombre");
        switch (option)
        {
            case 1:ajouterFil();
                break;
            case 2:afficherFiliere();
                break;
            case 3:modifierFil();
                break;
            case 4:suppFil();
                break;
            default: Main.menuShow();
        }
    }
    public static void afficherFiliere()
    {
        for (Filiere filiere:configuration.filieres)
        {
            System.out.println("intitule:"+filiere.getIntitul()+"||module:"+filiere.getModules()+"||reponsable:"+filiere.getResponsable()+"||departement:"+filiere.getDepartement());
        }
    }
    public static void modifierFil()
    {
        afficherFiliere();
        int id=Main.getIntInput("selectionner une filiere par id");
        String intitule=Main.getStringInput("entrez l intitule de filiere");
        if (service_filiere.getFilById(id).getModules().size() >= 12) {
            deptcontrolleure.afficherDept();
            int iddep = Main.getIntInput("selectionner un departement par id");
            enseigcontrolleure.afficherEnsg();
            int idens = Main.getIntInput("selectionner un responsable par id");
            if (service_enseignant.getEnsgById(idens) != null) {
                service_filiere.modifierFiliere(id, intitule, service_enseignant.getEnsgById(idens), service_departement.getDeptById(iddep));
            } else {
                System.out.println("Le responsable doit être un enseignant.");
            }
        } else {
            System.out.println("Une filière doit contenir au moins 12 modules.");
        }

        afficherFiliere();
        AfficherMenu();
    }
    public static void ajouterFil()
    {

        String intitule=Main.getStringInput("entrez l intitule de filiere");
        deptcontrolleure.afficherDept();
        int iddep=Main.getIntInput("selectionner un departement par id");
        enseigcontrolleure.afficherEnsg();
        int idens=Main.getIntInput("selectionner un responsable par id");
        if (service_enseignant.getEnsgById(idens) != null)
        {
            Filiere nouvelleFiliere = service_filiere.addFiliere(intitule, service_enseignant.getEnsgById(idens), service_departement.getDeptById(iddep));
            if (nouvelleFiliere.getModules().size() >= 12)
            {
                afficherFiliere();
                AfficherMenu();
            } else
            {

                service_filiere.deleteFilieres(nouvelleFiliere.getId());
                System.out.println("Une filière doit contenir au moins 12 modules.");
            }
        } else {
            System.out.println("Le responsable doit être un enseignant.");

        }
    }
    public static void suppFil()
    {
        afficherFiliere();
        int id=Main.getIntInput("selectionner une filiere par id");
        service_filiere.deleteFilieres(id);
        afficherFiliere();
        AfficherMenu();

    }

}
