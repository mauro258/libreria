package models;

public abstract class User {
    private String name;
    private String id;

    public User(String name, String id) {
        this.name = name;
        this.id = id;
    }

    // Getters y Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    // Método abstracto para implementar en clases hijas
    public abstract String showRole();

    // Método abstracto que debe ser implementado por las subclases
    public abstract void makeLoan(Book book);
}
