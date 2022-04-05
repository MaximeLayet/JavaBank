package model;

public class ComptePayant extends Compte{

    public ComptePayant(float solde) {
        super(solde);
    }

    @Override
    public void verser(float versement){
        this.setSolde(this.solde+ versement - 1);
    }

    @Override

    public void retirer(float retrait){
        this.setSolde((this.solde - retrait - 1));
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("ComptePayant{");
        sb.append("solde=").append(solde);
        sb.append('}');
        return sb.toString();
    }
}
