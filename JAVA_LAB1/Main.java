public class Main {
    public static void main(String[] args) throws Exception{
        Student s1 = new Student("Jan","Kowalski",985976L);
        Student s2 = new Student("Andrzej","Konrad",887548L);
        Student s3 = new Student("Anna","Nowak", 852645L);


        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);


        System.out.println("---------------------------------------------------------");

        Studenci.studenci.add(s1);
        Studenci.studenci.add(s2);
        Studenci.studenci.add(s3);

        Studenci.addStudent("Anna","Kowalska",4514524L);
        Studenci.addStudent("Ignacy","Krasicki",4514525L);
        Studenci.addStudent("Maria","Jędrzejczyk",4514526L);
        Studenci.showStudentInfo();





    }
}