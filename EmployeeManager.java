import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class EmployeeManager implements EmployeeOperations { // la classe EmployeeManager implemente la classe
                                                             // EmployeeOperations. Donc cette classe est obligée de
                                                             // contenir toutes les méthodes qui se trouvent dans la
                                                             // classe implémentéé
  Scanner scanner = new Scanner(System.in);
  static List<Employee> tab = new ArrayList<>();

  public void createEmploye() {

    // Methode pour créer un employé
    System.out.println("+++++++++++++++++++Ajout d'un employe+++++++++++++++++");
    System.out.println("Veuillez selectionner le type d'employe");
    System.out.println("1-Manager");
    System.out.println("2-Developer");
    System.out.println("3-Modifier");
    System.out.println("4-Suppression");
    int typeEmploye = scanner.nextInt();

    switch (typeEmploye) {
      case 1:
        System.out.println("*************Ajout d'un manager***********");
        scanner.nextLine();
        System.out.println("Nom du manager ");
        String nom = scanner.nextLine();
        System.out.println("Nombre d'employe managé ");
        int nbr = scanner.nextInt();
        System.out.println("Salaire du manager ");
        double salaire = scanner.nextDouble();

        Manager manager = new Manager(nom, nbr, salaire);
        tab.add(manager);
        System.out.println("creation reussie");

        break;
      case 2:
        System.out.println("***********Ajout d'un developer*************");
        scanner.nextLine();
        System.out.println("Nom du developer ");
        String name = scanner.nextLine();
        System.out.println("Specialite: ");
        String speciality = scanner.nextLine();
        System.out.println("Salaire: ");
        double salary = scanner.nextDouble();

        Developer developer = new Developer(name, speciality, salary);
        tab.add(developer);
        System.out.println("creation de developer reussie");
        break;

      default:
        break;
    }

  }

  public static void main(String[] args) {
    EmployeeManager employeeManager = new EmployeeManager();
    employeeManager.createEmploye();
    employeeManager.getAllEmploye();
    employeeManager.deleteEmploye();

  }

  public void getAllEmploye() {
    for (Employee employee : tab) {
      employee.employeInfo();

    }

  }

  public void getOneEmploye() {

  }

  public void updateEmploye() {

  }

  public void deleteEmploye() {
    System.out.println("Quel Utilisateur voulez vous supprimer?(L'id)");
    String nom = scanner.nextLine();
    tab.removeIf(el -> el.nom == nom);

  }

}
