package employeeApp;

public class Employee {
        private static int maxId = 0;
        private int id;
        private String fname;
        private String lname;
        private double salary;
        private boolean has401k;
        private int companyId;
        private int healthplanId;

        //Make Constructor
        //Make Getters and Setters

        //Constructor
        public Employee(String fname, String lname,  double salary,  boolean has401k,  int companyId,  int healthplanId){
            maxId++;
            id = maxId;
            this.fname = fname;
            this.lname = lname;
            this.salary = salary;
            this.has401k = has401k;
            this.companyId = companyId;
            this.healthplanId = healthplanId;
        };

        //Getters
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
        };
        public int getCompanyId() {
            return this.companyId;
        };
        public int getHealthplanId() {
            return this.healthplanId;
        };

        //Setters
        //use Void if no data is returned

        public void setFName(String name) {
            this.fname = name;
        };
        public void setLName(String name) {
            this.lname = name;
        };
        public void setId(int id){
            this.id = id;
        };
        public void setSalary(double salary) {
            this.salary = salary;
        };
        public void setHas401k(boolean amount) {
            this.has401k = amount;
        };
        public void setHealthPlanId(int id) {
            this.healthplanId = id;
        };
        public void setCompanyId(int id) {
            this.companyId = id;
        };

}