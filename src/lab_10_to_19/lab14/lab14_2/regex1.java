package lab_10_to_19.lab14.lab14_2;

public class regex1 {
    public static void main(String[] args) {
        String regex = "^abcdefghijklmnopqrstuv18340$";

        System.out.println("abcdefghijklmnopqrstuv18340".matches(regex));

        System.out.println("abcdefghijklmnoasdfasdpqrstuv18340".matches(regex));
        System.out.println("abc".matches(regex)); // false
        System.out.println("".matches(regex)); // false
    }
}
