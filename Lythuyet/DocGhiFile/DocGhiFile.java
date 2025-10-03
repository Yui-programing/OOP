package Lythuyet.DocGhiFile;
import java.util.Scanner;
import java.io.*;
/*
- có 2 cách để đọc ghi file + BufferedWriter/Reader
                            + PrintWriter/Scanner
- new FileWriter(file, true): đối tượng này là dùng với mục đích ghi tiếp vào file mà kh ghi đè nội dung cũ
- 
 */

public class DocGhiFile {
    public static void main(String[] args) {
        String textfile = "file.txt";
        String outfile = "out.txt";
        // ghi file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(textfile,true))) {
            writer.write("Nguyen Truong Hiep\n");
            writer.write("mssv: " + 312441100899L);
            System.out.println("Ghi file thành công");
        } catch (Exception e) {
            System.out.println("Lỗi file!");
        }
        // Đọc file
        // try (BufferedReader reader = new BufferedReader(new FileReader(outfile))) {
        //     System.out.println("nội dung file");
        //     String line;
        //     while ((line = reader.readLine()) != null){
        //         System.out.println(line);
        //     }
        //         System.out.println("Đọc  file thành công");
        // } catch (Exception e) {
        //     System.out.println("Lỗi file!");
        // }
        //ghi file bằng PrintWriter
        // try (PrintWriter writer = new PrintWriter(new FileWriter(textfile,true))) {
        //     writer.println("Nguyen Truong Hiep");
        //     writer.println("312440089");
        // } catch (Exception e) {
        //    System.out.println("lỗi file");
        // }
        // Đọc file = Scanner
        try (Scanner sc =  new Scanner(new File("file.txt"))) {
            String line;
            while(sc.hasNextLine()){
                line = sc.nextLine();
                System.out.println(line);
            }
        } catch (Exception e) {
            System.out.println("lỗi file");
        }
    }
}
