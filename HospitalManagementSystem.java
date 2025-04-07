import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HospitalManagementSystem {
	 static Scanner sc = new Scanner(System.in);
	    static List<Patient> patients = new ArrayList<>();
	    static List<Appointment> appointments = new ArrayList<>();
	    static List<Bill> bills = new ArrayList<>();
	    static List<InventoryItem> inventory = new ArrayList<>();
	    static List<Staff> staffList = new ArrayList<>();
	public static void main(String[] args) {
		while (true) {
            System.out.println("\n--- Hospital Management System ---");
            System.out.println("1. Register Patient");
            System.out.println("2. Schedule Appointment");
            System.out.println("3. View Patients");
            System.out.println("4. Generate Bill");
            System.out.println("5. View Bills");
            System.out.println("6. Manage Inventory");
            System.out.println("7. Manage Staff");
            System.out.println("8. Exit");
            System.out.print("Choose an option: ");

            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1 -> registerPatient();
                case 2 -> scheduleAppointment();
                case 3 -> viewPatients();
                case 4 -> generateBill();
                case 5 -> viewBills();
                case 6 -> manageInventory();
                case 7 -> manageStaff();
                case 8 -> System.exit(0);
                default -> System.out.println("Invalid option");
            }
            
		}
	}
	   static void registerPatient() {
	        System.out.print("Enter ID: ");
	        int id = sc.nextInt();
	        sc.nextLine();
	        System.out.print("Enter Name: ");
	        String name = sc.nextLine();
	        System.out.print("Enter Age: ");
	        int age = sc.nextInt();
	        sc.nextLine();
	        System.out.print("Enter Gender: ");
	        String gender = sc.nextLine();
	        System.out.print("Enter Diagnosis: ");
	        String diagnosis = sc.nextLine();
	        patients.add(new Patient(id, name, age, gender, diagnosis));
	        System.out.println("Patient Registered Successfully.");
	    }
	   static void scheduleAppointment() {
	        System.out.print("Enter Patient ID: ");
	        int id = sc.nextInt();
	        sc.nextLine();
	        System.out.print("Enter Date (dd-mm-yyyy): ");
	        String date = sc.nextLine();
	        System.out.print("Enter Doctor's Name: ");
	        String doctor = sc.nextLine();
	        appointments.add(new Appointment(id, date, doctor));
	        System.out.println("Appointment Scheduled.");
	    }
	   static void viewPatients() {
	        for (Patient p : patients) {
	            System.out.println("ID: " + p.id + ", Name: " + p.name + ", Age: " + p.age + ", Gender: " + p.gender + ", Diagnosis: " + p.diagnosis);
	        }
	    }
	   static void generateBill() {
	        System.out.print("Enter Patient ID: ");
	        int id = sc.nextInt();
	        System.out.print("Enter Amount: ");
	        double amount = sc.nextDouble();
	        bills.add(new Bill(id, amount));
	        System.out.println("Bill Generated.");
	    }
	   static void viewBills() {
	        for (Bill b : bills) {
	            System.out.println("Patient ID: " + b.patientId + ", Amount: " + b.amount);
	        }
	    }
	   static void manageInventory() {
	        System.out.print("Enter Item Name: ");
	        String name = sc.nextLine();
	        System.out.print("Enter Quantity: ");
	        int qty = sc.nextInt();
	        inventory.add(new InventoryItem(name, qty));
	        System.out.println("Inventory Updated.");
	    }
	   static void manageStaff() {
	        System.out.print("Enter Staff ID: ");
	        int id = sc.nextInt();
	        sc.nextLine();
	        System.out.print("Enter Name: ");
	        String name = sc.nextLine();
	        System.out.print("Enter Role: ");
	        String role = sc.nextLine();
	        staffList.add(new Staff(id, name, role));
	        System.out.println("Staff Added.");
	    }

}
