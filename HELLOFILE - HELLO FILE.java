
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

// Cre ManhNTzz
// Sử dụng Try catch để loại trường hợp không tìm thấy file

public class Main {
    public static void main(String[] args) {
        File file = new File("Hello.txt");
        try {
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
            sc.close();
        } catch (FileNotFoundException e) {

        }
    }
}
