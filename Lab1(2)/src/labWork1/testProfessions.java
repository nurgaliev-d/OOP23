package labWork1;

public class testProfessions {
public static void main(String[] args) {
	
   Professions engineer = new Professions("Engineer", 5);
   Professions doctor = new Professions("Doctor", 10);
   Professions teacher = new Professions("Teacher");
   Professions lawyer = new Professions("Lawyer", 8);

   engineer.displayInfo();
   doctor.displayInfo();
   teacher.displayInfo();
   lawyer.displayInfo();

   System.out.println("Total Professions: " + Professions.getTotalProfessions());
}
}

