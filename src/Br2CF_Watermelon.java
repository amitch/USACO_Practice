import java.io.*;
import java.util.StringTokenizer;


public class Br2CF_Watermelon {

    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        StringTokenizer st = new StringTokenizer(r.readLine());

        int n = Integer.parseInt(st.nextToken());

        if ((n % 2) == 0 && (n / 2) > 1) {
            pw.println("YES");
        } else {
            pw.println("NO");
        }
        pw.close();

    }
    }
