import java.util.*;
import java.util.Map.Entry;

public class JobApplication {
	private static Set<String> skills = new HashSet<String>(Arrays.asList("Java", "HTML5", "CSS3"));
	private static Map<String, Set<String>> applicants = new HashMap<String, Set<String>>();

	public static void main(String[] args) {
		// ------Task1------//
		System.out.println("Task 1: create and show applicants");
		createApplicants();
		// ------Task2------//
		System.out.println("Task 2: findApplicantsWithMatchSkills");
		findApplicantsWithMatchSkills();
		// ------Task3------//
		System.out.println("Task 3: allApplicantsSkills");
		allApplicantsSkills();

	}

	public static void createApplicants() {
		// ----------------YOUR CODE HERE--------------//
		applicants.put("Peter", new HashSet<String>(Arrays.asList("C++", "Ruby")));
		applicants.put("Aum", new HashSet<String>(Arrays.asList("C#", "Java")));
		applicants.put("Tip", new HashSet<String>(Arrays.asList("Java", "CSS3", "HTML5")));
		applicants.put("Jane", new HashSet<String>(Arrays.asList("HTML5", "Ruby", "Java", "CSS3")));
		for (Entry<String, Set<String>> entry : applicants.entrySet()) {
			String name = entry.getKey();
			Set<String> applicantSkills = entry.getValue();
			System.out.println(name + " => " + applicantSkills);
		}
	}

	public static void findApplicantsWithMatchSkills() {
		// ----------------YOUR CODE HERE--------------//
		for (Entry<String, Set<String>> entry : applicants.entrySet()) {
			String name = entry.getKey();
			Set<String> applicantSkills = entry.getValue();
			if (applicantSkills.containsAll(skills)) {
				System.out.println(name + " => " + applicantSkills);
			}
		}

	}

	public static void allApplicantsSkills() {
		// ----------------YOUR CODE HERE--------------//
		Set<String> allSkills = new HashSet<>();
		for (Set<String> applicantSkills : applicants.values()) {
			allSkills.addAll(applicantSkills);
		}
		System.out.println("All applicants' skills: " + allSkills);
	}

}
