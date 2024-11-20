public class Appointment {
    private String patientName;
    private String patientMobile;
    private String timeSlot;
    private HealthProfessional doctor;

    public Appointment(String patientName, String patientMobile, String timeSlot, HealthProfessional doctor) {
        this.patientName = patientName;
        this.patientMobile = patientMobile;
        this.timeSlot = timeSlot;
        this.doctor = doctor;
    }

    public void printDetails() {
        System.out.println("Patient Name: " + patientName);
        System.out.println("Mobile: " + patientMobile);
        System.out.println("Time Slot: " + timeSlot);
        System.out.println("Doctor Info:");
        doctor.printDetails();
    }

    public String getPatientMobile() {
        return patientMobile;
    }
}
