package phase1.controlleure;

import phase1.Main;
import phase1.Modele.Departement;
import phase1.service.configuration;
import phase1.service.service_departement;
import phase1.service.service_enseignant;

public class deptcontrolleure
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
        case 1: creatDept();
            break;
        case 2: afficherDept();
            break;
        case 3: modifirDept();
            break;
        case 4: deleteDept();
            break;
        default: Main.menuShow();
    }
}
public static void afficherDept()
{
    for (Departement departement: configuration.departements)
    {
        System.out.print("id:"+departement.getId()+" ||intitule:"+departement.getNom());
        if (!Main.isNull(departement.getResponsable()))
        {
            System.out.print("le responsable:"+departement.getResponsable().getNom()+" "+departement.getResponsable().getPrenom());
        }
        System.out.println(" ");
    }

}
public static void creatDept()
{

    String intitule=Main.getStringInput("entrez le nom de departement");

    enseigcontrolleure.afficherEnsg();
    int id=Main.getIntInput("selectionner un Responsable par id");
    service_departement.addDept(intitule, service_enseignant.getEnsgById(id));
    afficherDept();
    AfficherMenu();


}
    public static void modifirDept()
    {
        afficherDept();
        int id=Main.getIntInput("selectionner un departement par id");

        String intitule=Main.getStringInput("entrez le nom de departement");
        int idens=Main.getIntInput("selectionner un Responsable par id");
        enseigcontrolleure.afficherEnsg();

        service_departement.modifierdept(id,intitule, service_enseignant.getEnsgById(idens));
        afficherDept();
        AfficherMenu();

    }
    public static void deleteDept()
    {
       afficherDept();
        int id=Main.getIntInput("selectionner un departement par id");
        service_departement.suppdept(id);
        afficherDept();
    }


}

