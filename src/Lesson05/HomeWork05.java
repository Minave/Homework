package Lesson05;

public class HomeWork05 {

    public static void main(String[] args) {
        Employee[] empCorp = new Employee[5];
        empCorp[0] = new Employee("Antonov Anton", "Developer", "Innconnil@gmail.com", "89978654255",45000,39);
        empCorp[1] = new Employee("Sin Pin", "SystemAdministrator", "Maromezan@gmail.com", "89985684268",40000,34);
        empCorp[2] = new Employee("Sun Jin", "Engineer", "Jkaesar@gmail.com", "89843874398",100000,25);
        empCorp[3] = new Employee("Kursov Anton", "Team Lead", "Lenerdad@gmail.com", "89981824836",50000,42);
        empCorp[4] = new Employee("Pavel Tep", "Creator", "Qulpalita@gmail.com", "89548752687",30000,40);
        for (Employee employee : empCorp)
            if (employee.getAge()>40)
                System.out.println(employee);
    }

    public static class Employee {
        private String name;
        private String position;
        private String email;
        private String phone;
        private int salary;
        private int age;

        public Employee(String name, String position, String email, String phone, int salary, int age) {
            this.name = name;
            this.position = position;
            this.email = email;
            this.phone = phone;
            this.salary = salary;
            this.age = age;
        }

        public int getAge() {
            return age;
        }
        @Override
        public String toString(){
            return(name+ "\n-"
                    +position+ "\n-"
                    +email+ "\n-"
                    +phone+ "\n-"
                    +salary+ "\n-"
                    +age);
        }
    }
}
