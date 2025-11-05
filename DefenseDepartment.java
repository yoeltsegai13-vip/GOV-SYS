class DefenseDepartment extends GovernmentDepartment {
    int numberOfSoldiers;

    public DefenseDepartment(String name, double budget, int numberOfSoldiers) {
        super(name, budget);
        this.numberOfSoldiers = numberOfSoldiers;
    }

    @Override
    void displayDetails() {
        System.out.println("Department: " + departmentName);
        System.out.println("Budget: $" + budget + " million");
        System.out.println("Active Soldiers: " + numberOfSoldiers);
    }
}