package labWork1;


enum Profession {
 ENGINEER,
 DOCTOR,
 TEACHER,
 LAWYER
}

class Professions {

 private final String name;
 private final int experienceYears;
 private static int totalProfessions = 0;

 {
     totalProfessions++;
 }

 public Professions(String name, int experienceYears) {
     this.name = name;
     this.experienceYears = experienceYears;
 }

 public Professions(String name) {
     this(name, 0);
 }

 public static int getTotalProfessions() {
     return totalProfessions;
 }

 public void displayInfo() {
     System.out.println("Profession: " + this.name);
     System.out.println("Experience Years: " + this.experienceYears);
 }
}