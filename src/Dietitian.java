public class Dietitian extends HealthProfessional {
    private String dietSpecialization;

    public Dietitian(int id, String name, String specialty, String dietSpecialization) {
        super(id, name, specialty);
        this.dietSpecialization = dietSpecialization;
    }

    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Diet Specialization: " + dietSpecialization);
    }
}
