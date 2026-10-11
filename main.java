void main(){
Student s1= new Student();
s1.setName("Shreyas");
s1.setRollno(98);
teacher t1=new teacher();
t1tname=123;
System.out.println(t1.getClass());
}
class Student{
    String name;
    int rollno;
    Student(){
    }
    Student(String name,int rollno){
        this.name = name;
        this.rollno = rollno;
    }
    public void getName() {
        System.out.println(this.name);
    }
    public void setName(String name) {
        this.name = name;
    }
    public void getRollno() {
        System.out.println(this.rollno);
    }
    public void setRollno(int rollno) {
        this.rollno = rollno;
    }
}
class teacher extends Student{
    int tname;
    teacher(){ }
    teacher(String name,int rollno,int tname){
        super(name,rollno);
        this.tname=tname;
    }
}