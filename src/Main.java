package src;

import src.classes.*;

public class Main {
    public static void main(String[] args) {
        Faculty faculty = new Faculty();
        faculty.setName("Faculty of Computer Science");

        EmployeeDB db = new EmployeeDB();

        Employee main_guy = new ResearchEmployee();
        main_guy.setName("Ivan Arzhantsev");
        main_guy.setSsNo(2281337);
        main_guy.setEmail("main_kek@example.com");

        Employee friendly = new ResearchEmployee();
        friendly.setName("Julia Zaytseva");
        friendly.setSsNo(424242);
        friendly.setEmail("sub_kek@example.com");

        Employee base_guy = new ResearchEmployee();
        base_guy.setName("Roman Avdeev");
        base_guy.setSsNo(525252);
        base_guy.setEmail("medium_kek@example.com");

        faculty.addEmployee(db, main_guy.getSsNo(), main_guy);
        faculty.addEmployee(db, friendly.getSsNo(), friendly);
        faculty.addEmployee(db, base_guy.getSsNo(), base_guy);

        System.out.println(faculty.getName());
        for (Employee e : faculty.getAllEmployees(db)) {
            System.out.println(e.getSsNo() + " " + e.getName() + " " + e.getEmail());
        }
    }
}