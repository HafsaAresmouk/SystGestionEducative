package phase1.controlleure;

import phase1.Main;
import phase1.Modele.Module;
import phase1.service.*;

public class modulcntrl
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
            case 1:ajouterMod();
                break;
            case 2:afficherMod();
                break;
            case 3:modifMod();
                break;
            case 4:suppMod();
                break;
            default: Main.menuShow();
        }
    }
    public static void afficherMod()
    {
        for (Module module: configuration.modules)
        {
            System.out.print("intitule:"+module.getIntitule());

            System.out.print("le departement:"+module.getFiliere().getIntitul());
                System.out.print("le professeure:"+module.getProfesseur().getNom()+" "+module.getProfesseur().getPrenom());

        }
        System.out.println(" ");
    }
    public static void ajouterMod()
    {
        String intitule = Main.getStringInput("entrez l intitule de module");
        filierecntrl.afficherFiliere();
        int idfil=Main.getIntInput("selectionne une filere par id");
        enseigcontrolleure.afficherEnsg();
        int idensei=Main.getIntInput("selectionne un professeure par id");
        service_module.addMod(intitule, service_filiere.getFilById(idfil), service_enseignant.getEnsgById(idensei));
        afficherMod();
        AfficherMenu();
    }
    public static void modifMod()
    {
        ajouterMod();
        int id =Main.getIntInput("selectionne un module par id");

        String intitule = Main.getStringInput("entrez l intitule de module");
        filierecntrl.afficherFiliere();
        int idfil=Main.getIntInput("selectionne une filere par id");
        enseigcontrolleure.afficherEnsg();
        int idensei=Main.getIntInput("selectionne un professeure par id");
        service_module.modifMod(id,intitule, service_filiere.getFilById(idfil), service_enseignant.getEnsgById(idensei));
        afficherMod();
        AfficherMenu();
    }
    public static void suppMod()
    {
        afficherMod();
        int id =Main.getIntInput("selectionne un module par id");
        service_module.supprMod(id);
        afficherMod();
        AfficherMenu();
    }

}
