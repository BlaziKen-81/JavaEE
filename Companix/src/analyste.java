public class analyste extends salarie {
    private int deplacementsClient;

    public analyste(String code, String nom, String prenom, String dateEmbauche, int deplacementsClient) {
        super(code, nom, prenom, dateEmbauche);
        this.deplacementsClient = deplacementsClient;
    }

    @Override
    public String toString() {
        return super.toString() + ", Déplacements client: " + deplacementsClient;
    }
    @Override
    public String getCode() {
        return super.getCode();
    }

}