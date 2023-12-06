package Entite;

public class Images {
    private String nom;
    private String url;

    public Images(String nom, String url) {
        this.setNom (nom);
        this.setUrl (url);
    }

	public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
