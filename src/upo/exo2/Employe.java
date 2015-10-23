


package upo.exo2;

public final  class Employe {

    private String nom;
    private double salaire;
    private int nbheure;
    private double salaireHebdo;
    private  double salaireHoraire;
    private int tmpt;


    public Employe(String nom, double salaire, int nbheure) {
        this.nom = nom;
        this.nbheure = nbheure;
        this.salaire = salaire;
    }


   public  double salaireHebdo(){

    if(nbheure>60 || salaire < 13)
        System.out.println("erreur");
       if(nbheure<=40 && salaire>=13)
         return  salaire=nbheure*salaire;
       else
            if(nbheure>40 && nbheure<60 && salaire>=13 )
                tmpt=nbheure-40;
                return  salaire= (40*salaire)+(tmpt*salaire*1.5);
   }
    public String getNom() {
        return nom;
    }

    public double getSalaire() {
        return salaire;
    }

    public int getNbheure() {
        return nbheure;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }


    @Override
    public java.lang.String toString() {
        return "salaire hebdo:"+salaire*nbheure;
    }
}














