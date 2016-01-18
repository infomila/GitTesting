package demo;

/**
 *
 * @author bernat
 */
public class Persona {

    private int id;
    private String nom;
    private String cognom;

    public Persona(int id, String nom, String cognom) {
        this.id = id;
        this.nom = nom;
        setCognom(cognom);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCognom() {
        return cognom;
    }


    public void setCognomX(String cognom) {
        this.cognom = cognom;
    }
    
	public void funcioNova3_0(){
		
	}
    
	private branca(){
		// Més canvis
		System.out.println("XXXXX");
	}
        
}
