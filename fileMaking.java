import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class fileMaking {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        
       
        for(int i=1;i<=10;i++){
            String path = "/Users/tinkusharma/FileI:0Project.java/FileFolder/abc-"+i+".txt";
            File file = new File(path);
            file.createNewFile();
        }
    }
    
}
