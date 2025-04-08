package vallegrande.edu.pe.gestortareas.view;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class TaskListPanel extends JPanel {

    private JList<String> taskList;
    private DefaultListModel<String> listModel;

    public TaskListPanel() {
        setLayout(new BorderLayout());
        setBackground(Color.LIGHT_GRAY);

        // Crear el modelo de la lista y la lista
        listModel = new DefaultListModel<>();
        taskList = new JList<>(listModel);
        taskList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        JScrollPane scrollPane = new JScrollPane(taskList);
        add(scrollPane, BorderLayout.CENTER);

        // Título de la lista
        JLabel listTitle = new JLabel("Lista de Tareas", SwingConstants.CENTER);
        listTitle.setFont(new Font("Arial", Font.BOLD, 16));
        listTitle.setPreferredSize(new Dimension(100, 30));
        add(listTitle, BorderLayout.NORTH);
    }

    // Añadir tarea a la lista
    public void addTask(String taskInfo) {
        listModel.addElement(taskInfo);
    }

    // Obtener tarea seleccionada
    public String getSelectedTask() {
        return taskList.getSelectedValue();
    }

    // Obtener el índice de la tarea seleccionada
    public int getSelectedTaskIndex() {
        return taskList.getSelectedIndex();
    }

    // Actualizar tarea en la lista
    public void updateTask(int index, String updatedTask) {
        listModel.set(index, updatedTask);
    }

    // Eliminar tarea seleccionada
    public void removeSelectedTask() {
        int index = taskList.getSelectedIndex();
        if (index != -1) {
            listModel.remove(index);
        }
    }
}
