package vallegrande.edu.pe.gestortareas.view;

import javax.swing.*;
import java.awt.*;

public class TaskFormPanel extends JPanel {

    private JTextField titleField;
    private JTextArea descriptionField;
    private JTextField dateField;
    private JComboBox<String> statusField;
    private JButton addButton;
    private JButton editButton;
    private JButton deleteButton;
    private JButton saveButton;

    public TaskFormPanel() {
        setLayout(new GridLayout(6, 2, 10, 10)); // Diseño en cuadrícula con espacio

        // Título
        JLabel titleLabel = new JLabel("Título:");
        titleField = new JTextField();
        add(titleLabel);
        add(titleField);

        // Descripción
        JLabel descriptionLabel = new JLabel("Descripción:");
        descriptionField = new JTextArea(3, 20); // Más espacio para la descripción
        JScrollPane descriptionScroll = new JScrollPane(descriptionField); // Para hacer scroll
        add(descriptionLabel);
        add(descriptionScroll);

        // Fecha
        JLabel dateLabel = new JLabel("Fecha:");
        dateField = new JTextField();
        add(dateLabel);
        add(dateField);

        // Estado
        JLabel statusLabel = new JLabel("Estado:");
        String[] statuses = {"Pendiente", "En progreso", "Completada"};
        statusField = new JComboBox<>(statuses);
        add(statusLabel);
        add(statusField);

        // Botones
        addButton = new JButton("Agregar");
        editButton = new JButton("Editar");
        deleteButton = new JButton("Eliminar");
        saveButton = new JButton("Guardar");

        add(addButton);
        add(editButton);
        add(deleteButton);
        add(saveButton);

        // Estilo visual
        setPreferredSize(new Dimension(400, 300));
        setBackground(Color.WHITE);
    }

    // Métodos para obtener los datos del formulario
    public String getTitleField() {
        return titleField.getText();
    }

    public String getDescriptionField() {
        return descriptionField.getText();
    }

    public String getDateField() {
        return dateField.getText();
    }

    public String getStatusField() {
        return (String) statusField.getSelectedItem();
    }

    // Limpiar los campos
    public void clearFields() {
        titleField.setText("");
        descriptionField.setText("");
        dateField.setText("");
        statusField.setSelectedIndex(0);
    }

    // Llenar los campos del formulario (para edición)
    public void fillForm(String title, String description, String date, String status) {
        titleField.setText(title);
        descriptionField.setText(description);
        dateField.setText(date);
        statusField.setSelectedItem(status);
    }

    // Obtener los botones
    public JButton getAddButton() {
        return addButton;
    }

    public JButton getEditButton() {
        return editButton;
    }

    public JButton getDeleteButton() {
        return deleteButton;
    }

    public JButton getSaveButton() {
        return saveButton;
    }
}
