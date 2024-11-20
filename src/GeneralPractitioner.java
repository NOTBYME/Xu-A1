public class GeneralPractitioner extends HealthProfessional {
    private boolean isAvailable;

    public GeneralPractitioner(int id, String name, String specialty, boolean isAvailable) {
        super(id, name, specialty);
        this.isAvailable = isAvailable;
    }

    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Available: " + (isAvailable ? "Yes" : "No"));
    }
}
