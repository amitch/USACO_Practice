import java.io.*;
import java.util.StringTokenizer;

public class MainBufferedFileReaderIO {
    public void SystemIOReader() throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        StringTokenizer st = new StringTokenizer(r.readLine());

    }
    public static void main(String[] args) throws IOException {

        BufferedReader r = new BufferedReader(new FileReader("problemname.in"));
        PrintWriter pw = new PrintWriter("problemname.out");

        StringTokenizer st = new StringTokenizer(r.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        pw.print("The sum of these three numbers is ");
        pw.println(a + b + c);
        pw.close();
        /*
         * Make sure to include the line below, as it
         * flushes and closes the output stream.
         */
    }
}
