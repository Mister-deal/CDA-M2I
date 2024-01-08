package exercices.todolist.src.main.java.org.example.controller;

import exercices.TpTodolist.Models.TaskInfo;
import exercices.todolist.src.main.java.org.example.dao.CategoryDAO;
import exercices.todolist.src.main.java.org.example.impl.CategoryDAOImpl;
import exercices.todolist.src.main.java.org.example.impl.PersonDAOImpl;
import exercices.todolist.src.main.java.org.example.impl.TaskDAOImpl;
import exercices.todolist.src.main.java.org.example.model.Category;
import exercices.todolist.src.main.java.org.example.model.Person;
import exercices.todolist.src.main.java.org.example.model.Task;
import jdk.jshell.spi.ExecutionControl;


import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

public class ToDoListAppConsole {

    private static EntityManagerFactory entityManagerFactory;
    private static TaskDAOImpl taskDAO;

    private static PersonDAOImpl personDAO;
    private static CategoryDAOImpl categoryDAO;

    public static void main() {
        entityManagerFactory = Persistence.createEntityManagerFactory("todolist");
        taskDAO = new TaskDAOImpl(entityManagerFactory);
        personDAO = new PersonDAOImpl(entityManagerFactory);
        categoryDAO = new CategoryDAOImpl(entityManagerFactory);

        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("#### To Do List ####");
            System.out.println("1. Ajouter une tâche à la liste");
            System.out.println("2. Afficher toutes les tâches de la liste");
            System.out.println("3. Marquer une tâche comme terminée");
            System.out.println("4. Supprimer une tâche de la liste");
            System.out.println("5. Ajouter une personne");
            System.out.println("6. Afficher les tâches d'une personne");
            System.out.println("7. Supprimer une personne");
            System.out.println("8. Ajouter une catégorie");
            System.out.println("9. Supprimer une catégorie");
            System.out.println("10. Afficher les tâches d'une catégorie");
            System.out.println("11. Ajouter une taches à une catégorie");
            System.out.println("12. Supprimer une taches à une catégorie");
            System.out.println("0. Quitter l'application");
            System.out.println("Choix : ");

            choice = scanner.nextInt();
            scanner.nextLine(); // Consomme la nouvelle ligne

            switch (choice) {
                case 1:
                    addTask(scanner);
                    break;
                case 2:
                    displayTasks();
                    break;
                case 3:
                    markTaskAsCompleted(scanner);
                    break;
                case 4:
                    deleteTask(scanner);
                    break;
                case 5:
                    addPerson(scanner);
                    break;
                case 6:
                    displayTasksPerson(scanner);
                    break;
                case 7:
                    deleteUser(scanner);
                    break;
                case 8:
                    addCategory(scanner);
                    break;
                case 9:
                    deleteCategory(scanner);
                    break;
                case 10:
                    displayTasksCategory(scanner);
                    break;
                case 11:
                    addTaskToCategory(scanner);
                    break;
                case 12:
                    deleteTasksFromCategory(scanner);
                    break;
                case 0:
                    System.out.println("Bye");
                    entityManagerFactory.close();
                    break;
                default:
                    System.out.println("Choix invalide. Veuillez réessayer.");

            }

        } while (choice != 0);
    }

    private static void addTask(Scanner scanner) {
        System.out.println("Entrer le titre de la tâche : ");
        String title = scanner.nextLine();

        System.out.println("Entrer la description de la tâche : ");
        String description = scanner.nextLine();

        System.out.println("Date limite de la tâche : (dd.MM.yyyy)");
        String dueDateStr = scanner.nextLine();

        LocalDate dueDate = LocalDate.parse(dueDateStr, DateTimeFormatter.ofPattern("dd.MM.yyyy"));

        System.out.println("Priorité de la tâche : ");
        int priority = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Entrez l'ID de la personne pour cette tâche : ");
        Long personId = scanner.nextLong();

        // Creation de la tache
        Task task = new Task();
        task.setTitle(title);
        task.setCompleted(false);

        //Creation de la taskinfo
        TaskInfo taskInfo = new TaskInfo(description, dueDate, priority);

        // Mise en relation
        task.setTaskInfo(taskInfo);
        taskInfo.setTask(task);

        if (taskDAO.addTask(task, personId)) {
            System.out.println("Tâche ajoutée avec succès !");
        } else {
            System.out.println("Erreur");
        }
    }

    private static void displayTasks() {
        List<Task> tasks = taskDAO.getAllTasks();

        if (tasks.isEmpty()) {
            System.out.println("Aucune tâche trouvée.");
        } else {
            System.out.println("=== Liste des tâches ===");
            for (Task task : tasks) {
                System.out.println("###########");
                System.out.println(task.getId() + ". " + task.getTitle() + " (" + (task.isCompleted() ? "Terminée" : "En cours") + ")");
                System.out.println(task.getTaskInfo().toString());
                System.out.println("###########");
            }
        }
    }

    private static void deleteTask(Scanner scanner) {
        System.out.println("Entrez l'ID de la tâche à supprimer : ");
        Long taskId = scanner.nextLong();
        scanner.nextLine();

        if (taskDAO.deleteTask(taskId)) {
            System.out.println("Suppression OK");
        } else {
            System.out.println("Erreur");
        }
    }

    private static void markTaskAsCompleted(Scanner scanner) {
        System.out.println("Entrez l'ID de la tâche à compléter : ");
        Long taskId = scanner.nextLong();
        scanner.nextLine();

        if (taskDAO.markTaskAsCompleted(taskId)) {
            System.out.println("Modification OK");
        } else {
            System.out.println("Erreur");
        }
    }

    private static void addPerson(Scanner scanner) {
        System.out.println("Entrer le nom de la personne : ");
        String personName = scanner.nextLine();
        Person person = new Person(personName);
        personDAO.addPerson(person);
        System.out.println("Personne ajoutée");
    }

    private static void displayTasksPerson(Scanner scanner) {
        System.out.println("Entrez l'ID de la personne  : ");
        Long personId = scanner.nextLong();
        scanner.nextLine();

        List<Task> tasks = taskDAO.getTasksByPersonId(personId);
        System.out.println("Tâches de la personne avec l' ID : " + personId + " : ");
        for (Task t : tasks) {
            System.out.println(t.getId() + ". " + t.getTitle() + " (" + (t.isCompleted() ? "Terminée" : "En cours") + ")");
        }
    }

    private static void deleteUser(Scanner scanner) {
        System.out.println("Entrez l'ID de la personne à supprimer : ");
        Long personId = scanner.nextLong();
        scanner.nextLine();
        personDAO.deletePerson(personId);
        System.out.println("Personne supprimée");
    }

    private static void addCategory(Scanner scanner) {
        System.out.println("Entrer le nom de la catégorie : ");
        String categoryName = scanner.nextLine();
        Category category = new Category();
        category.setName(categoryName);
        categoryDAO.addCategory(category);
        System.out.println("Catégorie ajoutée");
    }
    private static void deleteCategory(Scanner scanner) {
        System.out.println("Entrez l'ID de la catégorie à supprimer : ");
        Long categoryId = scanner.nextLong();
        scanner.nextLine();
        categoryDAO.deleteCategory(categoryId);
        System.out.println("Catégorie supprimée");
    }
    private static void displayTasksCategory(Scanner scanner) {
        System.out.println("Entrez l'ID de la catégorie  : ");
        Long categoryId = scanner.nextLong();
        scanner.nextLine();

        List<Task> tasks = taskDAO.getTasksByCategoryId(categoryId);
        System.out.println("Tâches de la catégorie avec l' ID : " + categoryId + " : ");
        for (Task t : tasks) {
            System.out.println(t.getId() + ". " + t.getTitle() + " (" + (t.isCompleted() ? "Terminée" : "En cours") + ")");
        }
    }
    private static void addTaskToCategory(Scanner scanner) {
        System.out.println("Entrez l'ID de la tâche  : ");
        Long taskId = scanner.nextLong();
        scanner.nextLine();
        Task task = taskDAO.getTasksById(taskId);

        System.out.println("Entrez l'ID de la catégorie  : ");
        Long categoryId = scanner.nextLong();
        scanner.nextLine();
        Category category = categoryDAO.getCategoryById(categoryId);

        List<Category> taskCategories = task.getCategories();
        taskCategories.add(category);

        taskDAO.updateTask(task);
        System.out.println("Tâche modifiée");
    }
    private static void deleteTasksFromCategory(Scanner scanner) throws ExecutionControl.NotImplementedException {
        throw new ExecutionControl.NotImplementedException("à faire");
    }
}
