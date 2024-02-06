package ch01;

import java.io.*;

public class P02 {

    static int getMin3(int a, int b, int c) {
        int min = a;
        if (b < min) min = b;
        if (c < min) min = c;
        return min;
    }
    static int getMin4(int a, int b, int c, int d) {
        int min = a;
        if (b < min) min = b;
        if (c < min) min = c;
        if (d < min) min = d;
        return min;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter stdOut = new BufferedWriter(new OutputStreamWriter(System.out));
        stdOut.write("세 정수의 최댓값을 구합니다.\n");
        stdOut.flush();

        stdOut.write("a의 값: ");
        stdOut.flush();
        int a = Integer.parseInt(stdIn.readLine());
        stdOut.write("b의 값: ");
        stdOut.flush();
        int b = Integer.parseInt(stdIn.readLine());
        stdOut.write("c의 값: ");
        stdOut.flush();
        int c = Integer.parseInt(stdIn.readLine());
        stdOut.write("d의 값: ");
        stdOut.flush();
        int d = Integer.parseInt(stdIn.readLine());

        stdOut.write(String.valueOf(getMin3(a, b, c)));
        stdOut.write(String.valueOf(getMin4(a, b, c, d)));
        stdOut.flush();

        stdOut.close();
        stdIn.close();
    }
}
