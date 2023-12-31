package pl.edu.uj.javaframe;

public class Main {

    public static void main(String[] args) {

//    TEST
        System.out.println(new ImaginaryInt().create("12i4").add(new Int().create("10")));
        System.out.println(new ImaginaryDouble().create("15i32").add(new Int().create("17")));
        System.out.println(new ImaginaryDouble().create("15i32").add(new MyDouble().create("12")));
        System.out.println(new ImaginaryDouble().create("2i3").add(new ImaginaryDouble().create("12i3")));
        System.out.println(new ImaginaryInt().create("2i2").add(new ImaginaryInt().create("3i3")));
        System.out.println(new ImaginaryDouble().create("12i14").add(new ImaginaryInt().create("17i3")));
        System.out.println(new MyDouble().create("15").add(new ImaginaryDouble().create("12i3")));
        System.out.println(new ImaginaryInt().create("2i5").add(new ImaginaryDouble().create("3i1")));
        System.out.println(new ImaginaryDouble().create("12i14").add(new ImaginaryInt().create("17i3")));
        System.out.println(new Int().create("2").add(new ImaginaryInt().create("2i4")));
        System.out.println(new Int().create("2").add(new ImaginaryDouble().create("2i4")));


        MyDataFrame df = new MyDataFrame(new Class[] {ImaginaryDouble.class, Int.class}, new String[] {"kol1","kol2"});

        df.addRow(new String[]{"12i3","23"});
        df.addRow(new String[]{"1244i4","23"});
        df.addRow(new String[]{"1244i6","2553"});
        df.addRow(new String[]{"12i9","2300"});

        df.print();

        ImaginaryDouble im1 = (ImaginaryDouble) new ImaginaryDouble().create("12i3");
        ImaginaryDouble im2 = (ImaginaryDouble) new ImaginaryDouble().create("5i3");
        ImaginaryDouble im3 = (ImaginaryDouble) new ImaginaryDouble().create("5");
        MyDouble re = (MyDouble) new MyDouble().create("5");

        im1.print();
        System.out.println();
        im2.print();
        System.out.println();
        im3.print();
        System.out.println();
        re.add(im2).print();
        System.out.println();
        System.out.println("------------------------------");
        df.print();

//      INSTRUKCJE DO ĆWICZEŃ I

//      Dopisz metodę print w klasie DataFrame wypisującą zawartość dataframe
//      df.print();

//      Dodaj klasę ImaginaryDouble oraz ImaginaryInt, które dziedziczą po odpowiednio klasach Int i Double . Powinne one być tworzone ze Stringów postaci "<CzęśćRzeczywissta>i<CzęśćUrojona>", np "12i3".

//      Nadpisz metody create i add w klasach ImaginaryDoubgle oraz ImaginaryInt. Pamiętaj, że do liczb urojonych możemy też dodawać inne typy (np. Int, Double).
//      Przetestuj wyniki operacji:
        //
        //        Int.create("10").add(ImaginaryInt.create("12i4")))
        //        ImaginaryInt.create("12i4").add(ImaginaryInt.create("10i10"))

//      Nadpisz metodę public String toString() w kasach ImaginaryDouble i ImaginaryInt, tak aby poprawnie wyświetlała liczby urojone do postaci Stringa




        }


}