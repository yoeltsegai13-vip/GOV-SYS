class HealthDepartment extends GovernmentDepartment {
    int numberOfHospitals;

    public HealthDepartment(String name, double budget, int numberOfHospitals) {
        super(name, budget);
        this.numberOfHospitals = numberOfHospitals;
    }
    public void showHealthServiceMessage() {
        System.out.println("The " + departmentName + " is working to improve public healthcare services.");
    }
    @Override
    void displayDetails() {
        System.out.println("Department: " + departmentName);
        System.out.println("Budget: $" + budget + " million");
        System.out.println("Hospitals Managed: " + numberOfHospitals);
    }
}

