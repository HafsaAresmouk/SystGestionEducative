package phase1.Modele;

import java.util.ArrayList;

public class Filiere

{
   private int id;

    private String intitul;
    private Enseignant responsable;
    private Departement departement;
    ArrayList<Module> modules;

      public Filiere(){}
    public Filiere(String intitul,Enseignant responsable,Departement departement)
    {
        this.departement=departement;
        this.intitul=intitul;
        this.responsable=responsable;
        modules = new ArrayList<>();


    }
    public void addModule(Module module) {
        modules.add(module);
    }

    public void removeModule(Module module) {
        modules.remove(module);
    }

    public void setModules(ArrayList<Module> modules)
    {
        this.modules = modules;
    }

    public ArrayList<Module> getModules()
    {

        return modules;
    }

    public void setDepartement(Departement departement) {
        this.departement = departement;
    }

    public Departement getDepartement() {
        return departement;
    }

    public void setResponsable(Enseignant responsable) {
        this.responsable = responsable;
    }

    public Enseignant getResponsable() {
        return responsable;
    }



    public void setIntitul(String intitul) {
        this.intitul = intitul;
    }

    public String getIntitul() {
        return intitul;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }


}
