package vallegrande.edu.pe.gestortareas.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Task {
    private String title;
    private String description;
    private LocalDate date;
    private String status;

    public Task(String title, String description, String date, String status) {
        this.title = title;
        this.description = description;
        this.date = LocalDate.parse(date, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        this.status = status;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getDate() {
        return date.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
    }

    public String getStatus() {
        return status;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDate(String date) {
        this.date = LocalDate.parse(date, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
