package Class_Object;

enum Status {
    Running, Failed, Pending, Success;
}

public class Enum {
    public static void main(String[] args) {
        Status s = Status.Running;
        System.out.println("Current status: " + s);

        for (Status st : Status.values()) {
            System.out.println(st + " : " + st.ordinal());
        }
    }

}
