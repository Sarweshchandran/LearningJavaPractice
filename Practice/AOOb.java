package Practice;
//Array of Objects 
class Student
{
    int rollno;
    String name;
    int marks;
}

public class AOOb {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.rollno = 1;
        s1.name = "Sarweshwaran";
        s1.marks = 90;

        Student s2 = new Student();
        s2.rollno = 2;
        s2.name = "Nitish";
        s2.marks = 89;

        Student s3 = new Student();
        s3.rollno = 3;
        s3.name = "Shomesh";
        s3.marks = 90;

        Student students[] = new Student[3];
        //Array holding the reference of student array
        students[0] = s1;
        students[1] = s2;
        students[2] =  s3;

        for(int i=0;i<students.length;i++)
        {
            System.out.println(students[i].rollno +": "+ students[i].name+": "+students[i].marks);
        }
    }
}
