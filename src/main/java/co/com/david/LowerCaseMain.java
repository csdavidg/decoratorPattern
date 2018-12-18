package co.com.david;

import co.com.david.decorator.LowerCaseInputStream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class LowerCaseMain {

    public static void main(String args[]) throws IOException {

        int c;

        try {
            InputStream in = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream("test.txt")));

            while ((c = in.read()) >= 0) {
                System.out.print((char) c);
            }
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
