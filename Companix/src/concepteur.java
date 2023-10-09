public class concepteur extends salarie {
    private int anneesDeveloppement;

    public concepteur(String code, String nom, String prenom, String dateEmbauche, int anneesDeveloppement) {
        super(code, nom, prenom, dateEmbauche);
        this.anneesDeveloppement = anneesDeveloppement;
    }

    @Override
    public String toString() {
        return super.toString() + ", Ann�es de d�veloppement: " + anneesDeveloppement;
    }
    @Override
    public String getCode() {
        return super.getCode();
    }

}