package phase1.service;

import phase1.Modele.Enseignant;
import phase1.Modele.Filiere;
import phase1.Modele.Module;

import java.util.ArrayList;

public class service_module
{
    public static Module addMod(String intitule, Filiere filiere, Enseignant professeure)
    {
        return new Module();
    }
    public static Module modifMod(int id,String intitule, Filiere filiere, Enseignant professeure)
    {
        return new Module();
    }
    public static Module getModById(int id)
    {
        for (Module module:configuration.modules)
        {
            if (id==module.getId()) return module;
        }
        return new Module();
    }
    public static ArrayList<Module> getAllMod()
    {
        return (ArrayList<Module>) configuration.modules;
    }
    public static ArrayList<Module> supprMod(int id)
    {
        configuration.modules.remove(getModById(id));
        return (ArrayList<Module>) configuration.modules;
    }
}
