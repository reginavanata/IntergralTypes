package primatives;

public class IntegerClasses {

    public static void main(String[] args) {
        assignBinary();


    }

    public static void assignBinary() {
        // intergral types
        // byte holds 8 bits
        // int num = 9_123_456;

        byte byteOne = 0b0101_1111;
        System.out.println(byteOne);

        // 16 bits in a short
        short shortOne = 0b0111_000_111_1010;
        System.out.println(shortOne);

        // 32 bits in an int
        int intOne = 0b0101;
        System.out.println(intOne);

        // 64 bits in a long
        long longOne = 0b0110L;
        System.out.println(longOne);

        // how many bits are in a long>
        System.out.println("Num bits in Long: " + Long.SIZE);
        System.out.println("Min: " + Long.MIN_VALUE);
        System.out.println("Max: " + Long.MAX_VALUE);
    }

    public static void assignHex() {

    }
}
