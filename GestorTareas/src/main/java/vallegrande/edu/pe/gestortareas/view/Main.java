package vallegrande.edu.pe.gestortareas.view;

import vallegrande.edu.pe.gestortareas.view.TaskFormPanel;
import vallegrande.edu.pe.gestortareas.view.TaskListPanel;
import vallegrande.edu.pe.gestortareas.controller.TaskController;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        // Crear la ventana principal
        JFrame frame = new JFrame("Gestor de Tareas");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);
        frame.setLayout(new BorderLayout());

        // Crear los paneles
        TaskFormPanel taskFormPanel = new TaskFormPanel();
        TaskListPanel taskListPanel = new TaskListPanel();

        // Crear el controlador y vincularlo con los paneles
        TaskController taskController = new TaskController(taskFormPanel, taskListPanel);

        // Añadir los paneles a la ventana
        frame.add(taskFormPanel, BorderLayout.NORTH);
        frame.add(taskListPanel, BorderLayout.CENTER);

        // Hacer visible la ventana
        frame.setVisible(true);
    }
}
