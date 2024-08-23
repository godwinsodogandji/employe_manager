public abstract class Employee { // Une classe abstract qui contient au moins une méthode abstracte.Cette méthode
                                 // contient les info de l'employe
    protected long id;
    protected String nom;
    protected double salaire;

    // Getters et Setter concernant l'employe
    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getSalaire() {
        return this.salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    public abstract void employeInfo();

}
