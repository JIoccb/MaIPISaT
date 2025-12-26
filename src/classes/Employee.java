package src.classes;

public abstract class Employee {

    private int ssNo;
    private String name;
    private String email;
    private int counter;

    public int getSsNo() {
        return this.ssNo;
    }

    public void setSsNo(int ssNo) {
        this.ssNo = ssNo;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Employee() {
        // TODO - implement src.src.classes.Employee.src.src.classes.Employee
        throw new UnsupportedOperationException();
    }

}