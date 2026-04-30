package Exception_Handling;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Resource {
    public static void main(String[] args) throws Exception {
        int num = 0;
        BufferedReader br = null;
        try {
            // InputStreamReader in = new InputStreamReader(System.in);
            br = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter a number : ");
            num = Integer.parseInt(br.readLine());
            System.out.println(num);
        } finally {
            br.close();
        }

        try (BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("Enter a number : ");
            num = Integer.parseInt(br1.readLine());
            System.out.println(num);
        }
    }
}
