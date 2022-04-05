package model;

public class Compte {
    private int id;
    protected float solde;
    private static int countComptes = 0;
    private float versement;
    private float retrait;

    public Compte( float solde) {
        this.id = countComptes++;
        this.solde = solde;
    }

    public Compte( float solde, float versement) {
        this(solde);
        this.versement = versement;
    }

    public String countAmount(){
        return "Le solde de votre compte est de " + this.solde  + " €";
    }

    public void verser(float versement){
        this.setSolde(this.solde+ versement);
    }

    public void retirer(float retrait){
        this.setSolde((this.solde - retrait));
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getSolde() {
        return solde;
    }

    public void setSolde(float solde) {
        this.solde = solde;
    }

    public float getVersement() {
        return versement;
    }

    public void setVersement(float versement) {
        this.versement = versement;
    }

    public float getRetrait() {
        return retrait;
    }

    public void setRetrait(float retrait) {
        this.retrait = retrait;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Compte{");
        sb.append("id=").append(id);
        sb.append(", solde=").append(solde);
        sb.append(", versement=").append(versement);
        sb.append(", retrait=").append(retrait);
        sb.append('}');
        return sb.toString();
    }
}
