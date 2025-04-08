package vallegrande.edu.pe.gestortareas.controller;

import vallegrande.edu.pe.gestortareas.view.TaskFormPanel;
import vallegrande.edu.pe.gestortareas.view.TaskListPanel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TaskController {

    private TaskFormPanel taskFormPanel;
    private TaskListPanel taskListPanel;
    private String editingTask;

    public TaskController(TaskFormPanel taskFormPanel, TaskListPanel taskListPanel) {
        this.taskFormPanel = taskFormPanel;
        this.taskListPanel = taskListPanel;
        this.editingTask = null;

        // Agregar acción al botón "Agregar"
        taskFormPanel.getAddButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addTask();
            }
        });

        // Agregar acción al botón "Editar"
        taskFormPanel.getEditButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                editTask();
            }
        });

        // Agregar acción al botón "Eliminar"
        taskFormPanel.getDeleteButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                deleteTask();
            }
        });

        // Agregar acción al botón "Guardar"
        taskFormPanel.getSaveButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                saveEditedTask();
            }
        });
    }

    // Agregar tarea
    public void addTask() {
        String title = taskFormPanel.getTitleField();
        String description = taskFormPanel.getDescriptionField();
        String date = taskFormPanel.getDateField();
        String status = taskFormPanel.getStatusField();

        if (title.isEmpty() || description.isEmpty() || date.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Todos los campos deben ser llenados.");
        } else {
            taskListPanel.addTask(title + " - " + date + ": " + description + " [Estado: " + status + "]");
            taskFormPanel.clearFields();
        }
    }

    // Editar tarea
    public void editTask() {
        String selectedTask = taskListPanel.getSelectedTask();
        if (selectedTask != null) {
            String[] taskParts = selectedTask.split(" - ");
            String title = taskParts[0];
            String[] dateAndDescription = taskParts[1].split(": ");
            String date = dateAndDescription[0];
            String description = dateAndDescription[1].split(" \\[")[0];
            String status = dateAndDescription[1].split("\\[")[1].replace("]", "");

            taskFormPanel.fillForm(title, description, date, status);
            editingTask = selectedTask;
        } else {
            JOptionPane.showMessageDialog(null, "Por favor, selecciona una tarea.");
        }
    }

    // Guardar tarea editada
    public void saveEditedTask() {
        if (editingTask != null) {
            String updatedTitle = taskFormPanel.getTitleField();
            String updatedDescription = taskFormPanel.getDescriptionField();
            String updatedDate = taskFormPanel.getDateField();
            String updatedStatus = taskFormPanel.getStatusField();

            String updatedTask = updatedTitle + " - " + updatedDate + ": " + updatedDescription + " [Estado: " + updatedStatus + "]";
            int index = taskListPanel.getSelectedTaskIndex();
            taskListPanel.updateTask(index, updatedTask);

            taskFormPanel.clearFields();
            editingTask = null;
        } else {
            JOptionPane.showMessageDialog(null, "No estás editando ninguna tarea.");
        }
    }

    // Eliminar tarea
    public void deleteTask() {
        String selectedTask = taskListPanel.getSelectedTask();
        if (selectedTask != null) {
            taskListPanel.removeSelectedTask();
            taskFormPanel.clearFields();
        } else {
            JOptionPane.showMessageDialog(null, "Por favor, selecciona una tarea.");
        }
    }
}
