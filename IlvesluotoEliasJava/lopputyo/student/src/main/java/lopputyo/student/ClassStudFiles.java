package lopputyo.student;
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;



public class ClassStudFiles {
    public static void muisti (String FirstName, String LastName) throws IOException{


        File fail = new File("info.txt");

        FileWriter fw= new FileWriter(fail ,true);
        fw.write( FirstName + " " + LastName + System.lineSeparator());
        System.out.println("valmista tuli");
        fw.close();

    }
}
