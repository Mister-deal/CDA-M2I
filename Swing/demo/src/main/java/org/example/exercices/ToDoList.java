package org.example.exercices;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ToDoList extends JFrame {
    private DefaultListModel<String> tasksListModel;
    private JList<String> tasksList;
    private JTextField taskField;

    public ToDoList() {
        setTitle("To-Do List");
        setSize(200, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        tasksListModel = new DefaultListModel<>();
        tasksList = new JList<>(tasksListModel);
        JScrollPane scrollPane = new JScrollPane(tasksList);

        taskField = new JTextField(20);
        JButton addButton = new JButton("Add");
        JButton deleteButton = new JButton("delete");
        JButton completedButton = new JButton("complete");
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addTask(taskField.getText());
            }
        });

        JPanel inputPanel = new JPanel(new FlowLayout());
        inputPanel.add(taskField);
        inputPanel.add(addButton);
        inputPanel.add(deleteButton);
        inputPanel.add(completedButton);

        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.add(scrollPane, BorderLayout.CENTER);
        mainPanel.add(inputPanel, BorderLayout.SOUTH);

        add(mainPanel);
        setVisible(true);
    }

    private void addTask(String task) {
        if (!task.isEmpty()) {
            tasksListModel.addElement(task);
            taskField.setText("");
        }
    }

    private void deleteTask(String task) {
        if (!task.isEmpty()) {
            tasksListModel.removeElement(task);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ToDoList();
            }
        });
    }
}
