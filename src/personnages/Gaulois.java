package personnages;

public class Gaulois {
	private String nom;
	private int force;
	private int effetPotion = 1;

	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + " « " + texte + " »") ;

	}
	
	private String prendreParole() {
		return "Le gaulois " + nom  + " :"; 
	}
	
	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + romain.getNom());
		romain.recevoirCoup(force/3*effetPotion);
	}
	
	public void boirePotion(int forcePotion) {
		effetPotion += forcePotion;
		parler("Merci Druide, je sens que ma force est " + forcePotion + " fois décuplée.");
		
	}

	@Override
	public String toString() {
	return "Gaulois [nom=" + nom + ", force=" + force + ", effePotion=" + effetPotion + "]";
	}
		
	
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("asterix", 8);
		Romain obelix = new Romain("obelix", 10);
		System.out.println(asterix.getNom());
		System.out.println(asterix);
		asterix.prendreParole();
		asterix.parler("Je suis un gaulois !!!");
		asterix.frapper(obelix);
		asterix.boirePotion(5);
		asterix.frapper(obelix);
		
	}
	
	

}
