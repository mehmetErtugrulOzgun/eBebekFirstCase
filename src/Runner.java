public class Runner {

    private static String getsalary;

    public static void main(String[] args) {
        //Sizden konsol çıktısı halinde Adı,maaşı, çalışma saati, başlangıç yılı, vergi, bonus,
        // maaş artışı, vergi ve bonuslarla birlikte maaş,toplam maaş değerlerini konsola yazdırmanızı bekliyoruz.
        Employee employee = new Employee("Mehmet Ertugrul OZGUN", 3500, 50, 2015);
        System.out.println(employee.toString());


    }
}
