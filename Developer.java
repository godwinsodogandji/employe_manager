public class Developer extends Employee { // Une classe Developer qui etend de la classe Employe. Alors on a la
                                          // possibilité d'utiliser les méthodes qui se trouvent dans la classe Employe
    protected String specialities;
    static String poste = "dev";

    // constructeur
    Developer(String nom, String specilaties, double salaire) {
        this.nom = nom;
        this.specialities = specilaties;
        this.salaire = salaire;

    }

    // Getters et setters

    public String getSpecialies() {
        return this.specialities;
    }

    public void setSpecialities(String specialities) {
        this.specialities = specialities;
    }

    // Affichage des infos concernant le developer
    public void employeInfo() {
        System.out.println("id " + this.id);
        System.out.println("nom " + this.nom);
        System.out.println("poste " + poste);
        System.out.println("specialities " + this.specialities);
        System.out.println("salaire " + this.salaire);
    }

}
