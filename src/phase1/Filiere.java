package phase1;

public class Filiere
{
    private String intitul;
    private  Enseignant responsable;
    private Departement departement;

    public Filiere(String intitul,Enseignant responsable,Departement departement)
    {
        this.departement=departement;
        this.intitul=intitul;
        this.responsable=responsable;

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

    @Override
    public String toString()
    {
        return "Filiere{" +
                "intitul='" + intitul + '\'' +
                ", responsable=" + responsable +
                ", departement=" + departement +
                '}';
    }

}
