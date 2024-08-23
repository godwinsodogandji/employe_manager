public class Manager extends Employee {
    protected int nbrEmploye;
    static String poste = "dev";

    Manager(String nom, int nbrEmploye, double salaire) {
        this.nom = nom;
        this.nbrEmploye = nbrEmploye;
        this.salaire = salaire;

    }

    // Getters et setters

   

    public int getNbrEmploye() {
        return this.nbrEmploye;
    }

    public void setNbrEmploye(int nbrEmploye) {
        this.nbrEmploye = nbrEmploye;
    }

    public void employeInfo() {
        System.out.println("id " + this.id);
        System.out.println("nom " + this.nom);
        System.out.println("nbrEmploye " + this.nbrEmploye);
        System.out.println("salaire " + this.salaire);

    }

}
