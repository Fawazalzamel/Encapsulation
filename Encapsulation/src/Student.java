public class Student {
    
    private String name;
    private int age;
    private double gpa;


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }


    public void setAge(int age) {
        this.age = age;
    }
    


    public  double getGpaStatus() {
        if (gpa>3) {
            System.out.println("Excelent");
            
        } if (gpa<3 && gpa>2) {
            System.out.println("Good");
        } else {
            System.out.println("Needs Improvment");
        }
        return gpa;


    }


    public void setGpa(double gpa) {
     

       if (gpa >= 0.0 && gpa <= 4.0) {
        this.gpa = gpa;
       } else {
        System.out.println("Error, GPA is not between 0.0 and 4.0");
       }



    }


}
