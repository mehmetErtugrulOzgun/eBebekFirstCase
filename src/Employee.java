public class Employee {
    /*
    Sınıfın Nitelikleri
        name : Çalışanın adı ve soyadı
        salary : Çalışanın maaşı
        workHours : Haftalık çalışma saati
        hireYear : İşe başlangıç yılı
*/
    //Class level variable
    String name;
    double salary;
    int workHours;
    int hireYear;

    public Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public Employee() {
        //  Parametreli constructor olusturdugumuz için Java default olani yok etti bu sebepten dolayi
        // programimizin sorunsuz calismasi parametresiz bir constructor olusturmamiz lazim.
    }

    public double tax() {
        //Çalışanın maaşı 1000 TL'den fazla ise maaşının %3'ü kadar vergi uygulanacaktır.
        if (salary > 1000) {
            return salary*(0.03);
        }
        //Çalışanın maaşı 1000 TL'den az ise vergi uygulanmayacaktır.
        else {
            return 0;
        }
    }

    public int bonus() {
        //Eğer çalışan haftada 40 saatten fazla çalışmış ise fazladan çalıştığı her saat
        //başına 30 TL olacak şekilde bonus ücretleri hesaplayacaktır.
        if (workHours > 40) {
            return (30*(workHours - 40));
        }
        //Else kullanmamiza gerek yok
        return 0;
    }

    public double raiseSalary() {//Şuan ki yılı 2021 olarak alın.
        //Eğer çalışan 10 yıldan az bir süredir çalışıyorsa maaşına %5 zam yapılacaktır.
        int netCalismaYili = 2021 - hireYear;
        if (netCalismaYili < 10) {
            return  salary*(0.05);
        }
        //Eğer çalışan 9 yıldan fazla ve 20 yıldan az çalışıyorsa maaşına %10 zam yapılacaktır.
        else if (netCalismaYili > 9 && netCalismaYili < 20) {
            return salary * (0.1);
        }
        //Eğer çalışan 19 yıldan fazla çalışıyorsa %15 zam yapılacaktır.
        else {
            return salary * (0.15);
        }
    }
    /*
    Sınıfın Metotları
Employee(name,salary,workHours,hireYear) : Kurucu metot olup 4 parametre alacaktır.
tax() :
bonus() :
raiseSalary() :
toString() :
Not: raiseSalary() hesaplarken vergi ve bonusları dikkate almalısınız
     */
    @Override
    public String toString() {
        return "Calisanin bilgileri :" + "\nCalısanın ismi : " + name + "\nNet Maasi : " + salary +
                "\nHaftalik çalisma saati : " + workHours + "\nIse baslangic yili : " + hireYear +
                "\nCalısanın odedigi vergi : " + tax() + "\nCalisanin bonusu : " + bonus() +
                "\nCalisanin maas artisi : " + raiseSalary() + "\nCalisanin gelecek maasi : " + (salary+raiseSalary());
    }

}
