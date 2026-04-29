package library.model;

public class Subscriber {
    private String id;
    private String name;
    private String email;
    private String contact;
    private Role role;

    public Subscriber(String id, String name, String email, String contact, Role role) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.contact = contact;
        this.role = role;
    }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getContact() { return contact; }
    public void setContact(String contact) { this.contact = contact; }
    public Role getRole() { return role; }
    public void setRole(Role role) { this.role = role; }

    @Override
    public String toString() {
        return "Subscriber{id='" + id + "', name='" + name + "', role=" + role + "}";
    }
}
