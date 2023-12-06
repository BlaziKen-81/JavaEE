package Service;

import java.util.ArrayList;
import java.util.List;

import Entite.Images;

public class Personne {
    private String nom;
    private String password;
    private List<Images> images;

    public Personne(String nom, String password) {
        this.nom = nom;
        this.password = password;
        this.images = new ArrayList<>();
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

    public List<Images> getImages() {
        return images;
    }

    public void setImages(List<Images> images) {
        this.images = images;
    }

}