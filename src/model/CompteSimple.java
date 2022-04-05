package model;

public class CompteSimple extends Compte{

    private float decouvert;

    public CompteSimple( float solde, float decouvert) {
        super(solde);
        this.decouvert = decouvert;
    }

    @Override
    public void retirer(float retrait){
        this.setSolde((this.solde - retrait));
        if (this.solde <= this.decouvert){
            System.out.println("Vous avez atteint ou dépassé votre découvert autorisé");
        }
    }

    public float getDecouvert() {
        return decouvert;
    }

    public void setDecouvert(float decouvert) {
        this.decouvert = decouvert;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("CompteSimple{");
        sb.append("solde=").append(solde);
        sb.append(", decouvert=").append(decouvert);
        sb.append('}');
        return sb.toString();
    }
}
