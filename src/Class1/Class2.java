package Class1;

public class Class2 {
    public static void main(String[] args) {
        String [] studentsName= {"학생1","학생2","학생3"};
        int[] studentsAge ={15,14,10};
        int []studentsGrade={90,20,20};

        for (int i = 0; i < studentsName.length; i++) {
            System.out.println("이름:" + studentsName[i] + "나이:" + studentsAge[i] +"성적:" +studentsGrade[i]);

        }

    }
}
