package ch01;

import java.io.*;

public class Q01 {
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
        int max = a;
        if (b > max) max = b;
        if (c > max) max = c;

        stdOut.write(String.valueOf(max));
        stdOut.flush();

        stdOut.close();
        stdIn.close();
    }
}
