package phase1.service;

import phase1.Modele.Departement;
import phase1.Modele.Enseignant;
import phase1.Modele.Etudiant;
import phase1.Modele.Filiere;
import phase1.Modele.Module;

import java.util.ArrayList;
import java.util.List;

public class configuration
{
  public static int dept_id=0;
  public static int ensg_id=0;
  public static int id_fil=0;
  public static int id_mod=0;
  public static int id_etd=0;
  public static   List<Filiere> filieres= new ArrayList<>();
  public static List<Enseignant> enseignants =new ArrayList<>();
    public static List<Etudiant> etudiants=new ArrayList<>();
    public static  List<phase1.Modele.Module> modules=new ArrayList<>();
    public static List<Departement> departements=new ArrayList<>();

  public static int getDept_id()
  {
    dept_id+=40;
    return dept_id;
  }
  public static int getEnsg_id(){
    ensg_id++;
    return ensg_id;
  }

  public static int getId_mod() {
    id_mod++;
    return id_mod;
  }

  public static int getId_fil() {
    id_fil++;
    return id_fil;
  }

  public static int getId_etd() {
    id_etd++;
    return id_etd;
  }
}
