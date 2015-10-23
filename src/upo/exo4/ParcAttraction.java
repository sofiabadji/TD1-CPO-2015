package upo.exo4;

/**
 * Created by basafiel on 08/10/2015.
 */
public class ParcAttraction {
    private final String  nom;
    private   int capacite;
    private  double punitaire;
    private int  billetvendu;
    private  int nbPlaceDispo;
    private int nb;
    private  Tarif tarif;
    private double chiffreAffaires;


    public ParcAttraction(String nom, int capacite, double punitaire, int  billetvendu) {
        this.nom = nom;
        this.capacite = capacite;
        this.punitaire = punitaire;
        this.billetvendu = billetvendu;



    public String getNom() {
        return nom;
    }

    public int getCapacite() {
        return capacite;
    }

    public double getpUnitaire() {
        return punitaire;
    }

    public double getBilletVendu() {
        return billetvendu;
    }

    public  int getNbPlaceDispo(){
      return  nbPlaceDispo = capacite -billetvendu  ;

    }

    public void vendreBillets(int nb,Tarif tarif) throws ParcException {
        if(nb >nbPlaceDispo)
            throw  new ParcException ("il n y a plus de place ");

        }

    }

    public double  chiffreAffaires(){





