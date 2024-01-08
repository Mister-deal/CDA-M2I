package exercices.todolist.src.main.java.org.example.impl;

import exercices.todolist.src.main.java.org.example.model.Person;
import exercices.todolist.src.main.java.org.example.model.Task;
import org.example.dao.TaskDAO;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import java.util.List;

public class TaskDAOImpl implements TaskDAO {

    private EntityManagerFactory entityManagerFactory;

    public TaskDAOImpl(EntityManagerFactory entityManagerFactory) {
        this.entityManagerFactory = entityManagerFactory;
    }

    @Override
    public boolean addTask(Task task) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        try {
            transaction.begin();
            entityManager.persist(task);
            transaction.commit();
            return true;
        }catch (Exception e){
            if(transaction.isActive()){
                transaction.rollback();
            }
            e.printStackTrace();
            return false;
        }finally {
            entityManager.close();
        }
    }

    public boolean addTask(Task task,Long personId){
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        Person person = entityManager.find(Person.class,personId);
        task.(person);
        person.getTasks().add(task);
        entityManager.persist(task);
        transaction.commit();
        entityManager.close();
        return true;
    }

    @Override
    public List<Task> getAllTasks() {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        List<Task> tasks = entityManager.createQuery("SELECT t FROM Task t",Task.class).getResultList();
        entityManager.close();
        return tasks;
    }

    @Override
    public boolean deleteTask(Long taskId) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        try {
            transaction.begin();
            Task task = entityManager.find(Task.class,taskId);
            if(task != null){
                entityManager.remove(task);
                transaction.commit();
                return true;
            } else {
                return false;
            }
        }catch (Exception e){
            if(transaction.isActive()){
                transaction.rollback();
            }
            e.printStackTrace();
            return false;
        }finally {
            entityManager.close();
        }
    }

    @Override
    public boolean markTaskAsCompleted(Long taskId) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        try {
            transaction.begin();
            Task task = entityManager.find(Task.class,taskId);
            if(task != null){
                task.setCompleted(true);
                transaction.commit();
                return true;
            } else {
                return false;
            }
        }catch (Exception e){
            if(transaction.isActive()){
                transaction.rollback();
            }
            e.printStackTrace();
            return false;
        }finally {
            entityManager.close();
        }
    }

    @Override
    public Task getTasksById(Long taskId) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        Task task = (Task) entityManager.createQuery("SELECT t FROM Task t WHERE t.id = :taskId")
                .setParameter("taskId",taskId)
                .getSingleResult();
        return task;
    }

    @Override
    public List<Task> getTasksByPersonId(Long personId) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        List<Task> tasks = entityManager.createQuery("SELECT t FROM Task t WHERE t.person.id = :personId")
                .setParameter("personId",personId)
                .getResultList();
        return tasks;
    }

    @Override
    public List<Task> getTasksByCategoryId(Long categoryId) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        List<Task> tasks = entityManager.createQuery("SELECT t FROM Task t WHERE t.category.id = :categoryId")
                .setParameter("personId",categoryId)
                .getResultList();
        return tasks;
    }

    @Override
    public void updateTask(Task task) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        Task oldTask = getTasksById(task.getId());
        if (oldTask != null){
            entityManager.merge(task);
        }
    }
}
