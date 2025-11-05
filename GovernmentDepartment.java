 abstract class GovernmentDepartment {
    String departmentName;
    double budget; // in million dollars

    // Constructor to initialize common attributes
    public GovernmentDepartment(String departmentName, double budget) {
        this.departmentName = departmentName;
        this.budget = budget;
    }

     public String getDepartmentName() {
         return departmentName;
     }
     
     public void showBudgetInfo() {
         System.out.println(departmentName + " has a total budget of $" + budget + " million.");
     }

    // Abstract method to display department info
    abstract void displayDetails();

    // Concrete method to calculate used budget
    public double calculateBudgetUsage(double percentage) {
        return (budget * percentage) / 100;
    }
}


