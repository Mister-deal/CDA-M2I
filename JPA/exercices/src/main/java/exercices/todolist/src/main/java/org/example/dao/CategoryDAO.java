package exercices.todolist.src.main.java.org.example.dao;


import exercices.todolist.src.main.java.org.example.model.Category;

public interface CategoryDAO {
    void addCategory(Category category);

    void deleteCategory(Long id);

    Category getCategoryById(Long categoryId);
}
