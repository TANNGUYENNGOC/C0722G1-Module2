package test.phamvitruycap;

public class Teacher {
    private int id;
    private String name;

    public Teacher(int id, String name) {
        this.id = id;
        this.name = name;
    }

    protected int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    protected String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
