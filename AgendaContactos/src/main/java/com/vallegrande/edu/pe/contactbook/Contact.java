package com.vallegrande.edu.pe.contactbook;

// Clase que representa un contacto con sus datos personales
public class Contact {
   // Atributo que almacena el nombre del contacto
   private String name;
   // Atributo que almacena el número de teléfono
   private String phoneNumber;
   // Atributo que almacena el correo electrónico
   private String email;

<<<<<<< HEAD
    private String name;
    private String phoneNumber;
    private String email;


    public Contact(String name, String phoneNumber, String email) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }
 public String getName() {
        return name;
 }
public void setName(String name) {
        this.name = name;
}
public String getPhoneNumber() {
        return phoneNumber;
}
public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
}
public String getEmail() {
        return email;
}
public void setEmail(String email) {
        this.email = email;
}
@Override
public String toString() {
        return name + "|" + phoneNumber + "|" + email;
}
=======
   // Constructor que permite inicializar un contacto con nombre, teléfono y correo
   public Contact(String name, String phoneNumber, String email) {
       this.name = name;
       this.phoneNumber = phoneNumber;
       this.email = email;
   }

   // Devuelve el nombre del contacto
   public String getName() {
       return name;
   }

   // Permite modificar el nombre del contacto
   public void setName(String name) {
       this.name = name;
   }

   // Devuelve el número de teléfono del contacto
   public String getPhoneNumber() {
       return phoneNumber;
   }

   // Permite modificar el número de teléfono
   public void setPhoneNumber(String phoneNumber) {
       this.phoneNumber = phoneNumber;
   }

   // Devuelve el correo electrónico del contacto
   public String getEmail() {
       return email;
   }

   // Permite modificar el correo electrónico
   public void setEmail(String email) {
       this.email = email;
   }

   // Retorna una representación del contacto en forma de texto
   @Override
   public String toString() {
       return name + " | " + phoneNumber + " | " + email;
   }
>>>>>>> 80285bc715c48a6bc3d2a87e39a539c1bf987445
}
