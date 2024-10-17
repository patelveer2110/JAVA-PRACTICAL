public class extrastring {
    public static void main(String[] args) {
        String s1="hello",s2="Hello";
        System.out.println("charAt   "+s1.charAt(1));
        System.out.println("codepointat   "+s1.codePointAt(1));
        System.out.println("codepointbefore   "+s1.codePointBefore(1));
        System.out.println("equals   "+s1.equals(s2));
        System.out.println("equalsignorecase   "+s1.equalsIgnoreCase(s2));
}
}
