import java.io.*;
import java.util.StringTokenizer;

// https://codeforces.com/problemset/problem/231/A
public class Br2CF_Team {

    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        StringTokenizer st = new StringTokenizer(r.readLine());

        int n = Integer.parseInt(st.nextToken());

        int count = 0;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(r.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            if (a+b+c >=2) {
                count++;
            }
        }
        pw.println(count);
        pw.close();
    }
}
