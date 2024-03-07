
class MyDate{
    int day, month, year;

    MyDate(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    void setDay(int day){
        this.day = day;
    }

    void print(){
        System.out.println("day : " + day + " month : " + month + " year : " + year);
    }
}

public class PassTest {
    public static void changeInt(int value){
        value = 55;
    }

    public static void changeObjectRef(MyDate ref){
        ref = new MyDate(1,1,2000);
    }

    public static void changeObjectAttr(MyDate ref){
        ref.setDay(4);
    }



    public static void main(String[] args){
        MyDate date;
        int val;
        val = 11;

        changeInt(val);
        System.out.println("int value is " + val);

        date = new MyDate(22,7,1964);
        changeObjectRef(date);
        date.print();

        changeObjectAttr(date);
        date.print();

    }
    //Kesimpulan : variable parameter akan menyalin value yang digunakan dalam argumen,
    //             sehingga perubahan dalam fungsi tidak akan berpengaruh ke variable asal

    //             tetapi dalam kasus rubah atribut, ia memanggil fungsi yang jelas untuk merubah nilai dalam class MyDate
}
