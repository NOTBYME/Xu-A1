import java.util.ArrayList;

public class AssignmentOne {
    private static ArrayList<Appointment> appointments = new ArrayList<>();

    public static void main(String[] args) {
        // Create doctors
        GeneralPractitioner gp1 = new GeneralPractitioner(1, "Dr. Fernando", "General Practice", true);
        GeneralPractitioner gp2 = new GeneralPractitioner(2, "Dr. Rake", "General Practice", false);
        Dietitian dt1 = new Dietitian(3, "Dr. Anderson", "Nutrition", "Weight Management");

        // Print doctor details
        gp1.printDetails();
        System.out.println();
        gp2.printDetails();
        System.out.println();
        dt1.printDetails();
        System.out.println();

        // Create appointments and add to list
        createAppointment("Anon Caster", "6165829", "06:00 AM", gp1);
        createAppointment("Syster Adi", "6196569", "14:30 PM", dt1);

        // Print existing appointments
        printExistingAppointments();

        // Cancel an appointment
        cancelBooking("017-32411");

        // Print remaining appointments
        printExistingAppointments();
    }

    public static void createAppointment(String name, String mobile, String time, HealthProfessional doctor) {
        Appointment appointment = new Appointment(name, mobile, time, doctor);
        appointments.add(appointment);
        System.out.println("Appointment created for: " + name);
    }

    public static void printExistingAppointments() {
        if (appointments.isEmpty()) {
            System.out.println("No existing appointments.");
        } else {
            System.out.println("Current Appointments:");
            for (Appointment appt : appointments) {
                appt.printDetails();
                System.out.println();
            }
        }
    }

    public static void cancelBooking(String mobile) {
        boolean removed = appointments.removeIf(appt -> appt.getPatientMobile().equals(mobile));
        if (removed) {
            System.out.println("Appointment canceled for mobile: " + mobile);
        } else {
            System.out.println("No appointment found for mobile: " + mobile);
        }
    }
}
