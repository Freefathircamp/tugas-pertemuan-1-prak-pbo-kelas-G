class TestConversion{
    public static void main(String[] args){
        double d = 2.12345D;
        float f = 150.50f;
        long l = 15000L;
        int i = 55;
        char c = 20;
        short s = 1000;
        byte b = 126;

        System.out.println();
        System.out.println("Implicit Widening Conversion:");
        System.out.println("------------------------------");
        System.out.println("byte to short \t -> " + (s=b));
        System.out.println("short to int \t-> " + (i=s));
        System.out.println("int to long \t-> " + (l=i));
        System.out.println("Long to float \t-> " + (f=l));
        System.out.println("float to double \t-> " + (d=f));

        System.out.println();
        System.out.println("Explicit Widening Conversion:");
        System.out.println("------------------------------");
        System.out.println("cast byte to char \t -> " + (char)b);
        System.out.println("cast short to char: \t -> " + (char)s);

        d = 150.23456421234589645;
        System.out.println();
        System.out.println("Explicit narrowing conversion:");
        System.out.println("------------------------------");
        System.out.println("double to float \t -> " + (f = (float)d));
        System.out.println("float to long \t -> " + (l = (long)f));
        System.out.println("long to int \t -> " + (i = (int)l));
        System.out.println("int to short \t -> " + (s = (short)i));
        System.out.println("short to byte \t -> " + (b = (byte)s));
    }

    //Kesimpulan : konversi penaikan dan penurunan tipe data ke tipe data yang lain
}