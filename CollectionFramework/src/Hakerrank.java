import java.util.*;

class Student{
	private int id;
	private String fname;
	private double cgpa;
	public Student(int id, String fname, double cgpa) {
		super();
		this.id = id;
		this.fname = fname;
		this.cgpa = cgpa;
	}
	public int getId() {
		return id;
	}
	public String getFname() {
		return fname;
	}
	public double getCgpa() {
		return cgpa;
	}
}

//Complete the code

class SortByCgpa implements Comparator<Student>{
    public int compare(Student s1, Student s2){
        if(s1.getCgpa()!= s2.getCgpa()){
            return Double.compare(s2.getCgpa(), s1.getCgpa());
        }
        return s1.getFname().compareTo(s2.getFname());
    }
}
public class Hakerrank
{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		
		List<Student> studentList = new ArrayList<Student>();//{33 ruma 3.76
//		85 Anisha 3.85
//		56 Samiha 3.75
//		19 Samara 3.75
//		22 Fahim 3.76}
		while(testCases>0){
			int id = in.nextInt();
			String fname = in.next();
			double cgpa = in.nextDouble();
			
			Student st = new Student(id, fname, cgpa);
			studentList.add(st);
			
			testCases--;
		}
      Collections.sort(studentList, new SortByCgpa());
      	for(Student st: studentList){
			System.out.println(st.getFname()); //{Anisha
//			Fahim
//			ruma
//			Samara
//			Samiha}
		}
	}
}



