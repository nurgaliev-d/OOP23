package labWork1; 
public class Course {
    private String name;
    private String description;
    private int credits;
    private String[] prerequisites;

    public Course(String name, String description, int credits, String[] prerequisites) {
        this.name = name;
        this.description = description;
        this.credits = credits;
        this.prerequisites = prerequisites;
    }

    public String toString() {
        return "Course Name: " + name +
               "\nDescription: " + description +
               "\nCredits: " + credits +
               "\nPrerequisites: " + String.join(", ", prerequisites);
    }
    public String getName() {
    	return this.name;
    }
}
