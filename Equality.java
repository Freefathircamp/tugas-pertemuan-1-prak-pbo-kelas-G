class Equality {
    public static void main(String[] args) {
        int x = 5;
        float f2 = 5.0F;
        String s1 = "hello";
        String s3 = "hello";
        String s2 = "hello";
        int[] arr2 = {4, 5, 6};
        int[] arr1 = {1, 2, 3};
        int[] arr3 = arr1;
        String s4 = new String("hello");

        // Equality operators
        System.out.println();
        System.out.println("Equality operators:");
        System.out.println("\tNot Equal: 5 != 5.0 \t\t " + (x != f2));
        System.out.println("\t[different array objects]");
        System.out.println("\t[ref to same array object]");
        System.out.println("\tNot Equal: arr1 != arr2 \t " + (arr1 != arr2));
        System.out.println("\tNot Equal: arr1 != arr3 \t " + (arr1 != arr3));
        System.out.println("\t[same literal]");
        System.out.println("\t[same object reference]");
        System.out.println("\t[new object]");

        // Equals
        System.out.println();
        System.out.println("Equals:");
        System.out.println("\tEquals: 5 == 5.0 \t\t " + (x == f2));
        System.out.println("\tEquals: arr1 == arr2 \t " + (arr1 == arr2));
        System.out.println("\tEquals: arr1 == arr3 \t " + (arr1 == arr3));
        System.out.println("\tEquals: s1 == s2 \t\t " + (s1 == s2));
        System.out.println("\tEquals: s1 == s3 \t\t " + (s1 == s3));
        System.out.println("\tEquals: s1 == s4 \t\t " + (s1 == s4));
    }
    //Kesimpulan : penggunaan operator equality dalam beberapa tipe data
    
}

