package exercise;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Priorities {
//	private List<Student> listStudents = new ArrayList<>();
	public List<Student> getStudents(List<String> events) {
        PriorityQueue<Student> queue = new PriorityQueue<Student>(events.size());
		for (String event : events) {
			if (event.equals("SERVED")) {
//				listStudents.remove(0);
				queue.poll();
			} else {
				String[] arr = event.split(" ");
				Student student = new Student(Integer.parseInt(arr[3]), arr[1], Double.parseDouble(arr[2]));
				System.out.println("Student Name: "+student.getName()+" ---- CGPA: "+student.getCGPA());
				queue.add(student);
//				queue.forEach(s -> System.out.println(s.getName()));
//				listStudents.add(student);
//				listStudents.sort((student1, student2) -> student1.compareTo(student2));
//				listStudents.forEach(s -> System.out.println(s.getName()));
			}
		}
//		return listStudents;
		while(queue.size()>1)
        {
            System.out.println(queue.poll().getName());
        }
		return new ArrayList<Student>(queue);
	}
}
