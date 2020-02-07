package test;

import java.io.*;

public class Fileben{
    public static void main(String[] args) {
        System.out.println("H");

        try {
            byte b[]=new byte[10];
            for(int i=0;i<b.length;i++) {
                b[i]=(byte)i;
            }
            FileOutputStream c=new FileOutputStream("a.dat");
            c.write(b);
            c.close();


            PrintWriter out = new PrintWriter(
                    new BufferedWriter(
                            new OutputStreamWriter(
                                    new FileOutputStream("s.txt"))));
            int i=123456;
            out.println(i);
            out.close();



            BufferedReader in = new BufferedReader(
                    new InputStreamReader(new
                    FileInputStream("src/test/Fileben.java")));
            //绝对路径也行
            //C:\\Users\\17438\\IdeaProjects\\Filebenliu\\src\\test\\Fileben.java
            String s;
            while((s=in.readLine())!=null){
                System.out.println(s);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}




