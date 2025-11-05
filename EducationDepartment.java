class EducationDepartment extends GovernmentDepartment {
    int numberOfSchools;

    public EducationDepartment(String name, double budget, int numberOfSchools) {
        super(name, budget);
        this.numberOfSchools = numberOfSchools;
    }

    @Override
    void displayDetails() {
        System.out.println("Department: " + departmentName);
        System.out.println("Budget: $" + budget + " million");
        System.out.println("Schools Managed: " + numberOfSchools);
    }
}