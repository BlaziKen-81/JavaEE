public abstract class salarie {
    private String code;
    private String nom;
    private String prenom;
    private String dateEmbauche;

    public salarie(String code, String nom, String prenom, String dateEmbauche) {
        this.code = code;
        this.nom = nom;
        this.prenom = prenom;
        this.dateEmbauche = dateEmbauche;
    }

    @Override
    public String toString() {
        return "Code: " + code + ", Nom: " + nom + ", Prénom: " + prenom + ", Date d'embauche: " + dateEmbauche;
    }
    
    public String getCode() {
        return code;
    }

}
