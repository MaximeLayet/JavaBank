package model;

public class CompteEpargne extends Compte{

    private float taux;

    public CompteEpargne(float solde, float taux) {
        super(solde);
        this.taux = taux;
    }

    public float getTaux() {
        return taux;
    }

    public void setTaux(float taux) {
        this.taux = taux;
    }

    public void calculInterest(){
        this.solde = this.solde + (this.solde *  this.taux / 100);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("CompteEpargne{");
        sb.append("solde=").append(solde);
        sb.append(", taux=").append(taux);
        sb.append('}');
        return sb.toString();
    }
}
