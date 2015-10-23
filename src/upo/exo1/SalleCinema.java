package upo.exo1;

/**
 * definie le model d'une salle de cinema.
 */
public final class SalleCinema {


    private int capacite;
    private double tarif;
    private String film;
    private int vendrePlace;
    private double tauxRemplissage;
    private double chiffreAffaires;
    private boolean estPlein;
    private int nbPlaceDisponibles;



    public SalleCinema( int capacite,String film ,double tarif){
        this.film=film;
        this.capacite=capacite;
        this.tarif=tarif;
    }



    public boolean estPlein() {
        if (vendrePlace == capacite)
            return true;
        else
            return false;
    }

    public int getVendrePlace()
    {
        return vendrePlace++;

    }

    public  double tauxRemplissage(){
          tauxRemplissage=(capacite-vendrePlace)*100;
        return  tauxRemplissage;
    }


    public  double  chiffreAffaires(){
            chiffreAffaires=vendrePlace*tarif;
            return chiffreAffaires;
        }


      public int NbPlaceDisponibles() {

          return capacite - vendrePlace;
      }

    public int getCapacite() {
        return capacite;
    }

    public double getTarif() {
        return tarif;
    }

    public String getFilm() {
        return film;
    }

    public void setTarif(double tarif) {
        this.tarif = tarif;
    }

    public void setFilm(String film) {
        this.film = film;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SalleCinema{");
        sb.append("tarif=").append(tarif);
        sb.append(", film=").append(film);
        sb.append(", capacite=").append(capacite);
        sb.append('}');
        return sb.toString();
    }
}


