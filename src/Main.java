public class Main {

    public static void main(String[] args) {


        Employee ed = new Employee("ed", "01/27/1935", "02/01/1987");
        System.out.println(ed);
        System.out.println(ed.getAge());
        System.out.println(ed.collectPay());

        SalariedEmployee rob = new SalariedEmployee("rob", "01/02/2002", "02/02/2021",85000);
        rob.retire();
        System.out.println(rob);
    }
}
