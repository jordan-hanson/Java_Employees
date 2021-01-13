package employeeApp;

public class Employee {
    public static void employee(String[] args) {
        private int id;
        private String fname;
        private String lname;
        private double salary;
        private boolean has401k;
        private int companyId;
        private int healthplanId;

        //Getters and Setters
        public int getId() {
            return this.id;
        };
        public String getFName() {
            return this.fname;
        };
        public String getLName() {
            return this.lname;
        };
        public double getSalary() {
            return this.salary;
        };
        public boolean getHas401k() {
            return this.has401k;
        }
        public int getCompanyId() {
            return this.companyId;
        }
        public int getHealthplanId() {
            return this.healthplanId;
        }
    }
}