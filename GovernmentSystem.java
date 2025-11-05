public class GovernmentSystem {
    public static void main(String[] args) {
        GovernmentDepartment health = new HealthDepartment("Health Ministry", 500.0, 120);
        GovernmentDepartment education = new EducationDepartment("Education Ministry", 300.0, 1500);
        GovernmentDepartment defense = new DefenseDepartment("Defense Ministry", 1000.0, 200000);

        System.out.println("=== Government Department Details ===");

        health.displayDetails();
        System.out.println("Budget used (30%): $" + health.calculateBudgetUsage(30) + " million");
        System.out.println("--------------------------------------");

        education.displayDetails();
        System.out.println("Budget used (25%): $" + education.calculateBudgetUsage(25) + " million");
        System.out.println("--------------------------------------");

        defense.displayDetails();
        System.out.println("Budget used (40%): $" + defense.calculateBudgetUsage(40) + " million");
        System.out.println("--------------------------------------");
    }
}
