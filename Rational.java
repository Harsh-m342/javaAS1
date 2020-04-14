

public class Rational {
    private int num; 
    private int den; //declaring variables
    int[] surrogates = {0xD83D, 0xDC7D};
    String alienEmojiString = new String(surrogates, 0, surrogates.length);
    //System.out.println(alienEmojiString);
    public Rational(int numerator,int denominator){
        if (denominator==0){
            throw new RuntimeException("Denominator is zero!!"+alienEmojiString);
        }
        int g=gcd(numerator,denominator);
        num=numerator/g;
        den=denominator/g;
    }
    public String toString() {
        if (den == 1) return num + "";
        else          return num + "/" + den;
    }
    // return (this * b)
    public Rational times(Rational b) {
        return new Rational(this.num * b.num, this.den * b.den);
    }


    // return (this + b)
    public Rational plus(Rational b) {
        int numerator   = (this.num * b.den) + (this.den * b.num);
        int denominator = this.den * b.den;
        return new Rational(numerator, denominator);
    }
    private static int gcd(int m, int n) {
        if (0 == n) return m;
        else return gcd(n, m % n);
    }


   /***************************************************************************
    *  Test client
    ***************************************************************************/

    public static void main(String[] args) {
        Rational x, y, z;

        // 1/2 + 1/3 = 5/6
        x = new Rational(1, 0);
        y = new Rational(1, 3);
        z = x.plus(y);
        System.out.println(z);

        // 8/9 + 1/9 = 1
        x = new Rational(8, 9);
        y = new Rational(1, 9);
        z = x.plus(y);
        System.out.println(z);

        //  4/17 * 7/3 = 28/51
        x = new Rational(4, 17);
        y = new Rational(7,  3);
        z = x.times(y);
        System.out.println(z);

        // 203/16957 * 9299/5887 = 17/899
        x = new Rational(203, 16957);
        y = new Rational(9299, 5887);
        z = x.times(y);
        System.out.println(z);

        // 0/6 = 0
        x = new Rational(0, 6);
        System.out.println(x);

    }

}