package phase1.Modele;

public class note
{
    private float note;
    private Etudiant etudiant;
    private Filiere filiere;
    public note(float note,Etudiant etudiant,Filiere filiere)
    {
        this.etudiant=etudiant;
        this.note=note;
        this.filiere=filiere;
    }

    public void setFiliere(Filiere filiere)
    {
        this.filiere = filiere;
    }

    public Filiere getFiliere()
    {
        return filiere;
    }

    public void setNote(float note)
    {
        this.note = note;
    }

    public float getNote()
    {
        return note;
    }

    public void setEtudiant(Etudiant etudiant)
    {
        this.etudiant = etudiant;
    }

    public Etudiant getEtudiant()
    {
        return etudiant;
    }
}
