package String;

public class Buffer {
    public static void main(String[] args) {
        @SuppressWarnings("unused")
        StringBuffer sb = new StringBuffer("Rehan");
        System.out.println(sb);

        sb.append(" Khan");
        System.out.println(sb);

        sb.insert(10, " Pathan");
        System.out.println(sb);

        System.out.println(sb.capacity());
        sb.delete(10, 17);
        System.out.println(sb.length());

        sb.replace(6, 10, "Pathan");
        System.out.println(sb);

        String str = sb.toString();
        System.out.println(str);

        sb.reverse();
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);
    }

}
