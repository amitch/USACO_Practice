import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;

// https://usaco.org/index.php?page=viewproblem2&cpid=807#
// Passed
public class Br1_USACO_Teleporter {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new FileReader("teleport.in"));
        PrintWriter pw = new PrintWriter("teleport.out");

        StringTokenizer st = new StringTokenizer(r.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());

        int x = b - a;
        if (x < 0) {
            x = x * -1;
        }

        int t1 = Integer.max(a, b) - Integer.max(c,d);
        if (t1 < 0) {
            t1 = t1 * -1;
        }

        int t2 = Integer.min(a, b) - Integer.min(c,d);
        if (t2 < 0) {
            t2 = t2 * -1;
        }

        if (x < (t1+t2))
            pw.println(x);
        else
            pw.println(t1+t2);

        pw.close();
    }
}
