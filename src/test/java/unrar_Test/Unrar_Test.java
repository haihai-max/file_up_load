package unrar_Test;

import com.haihai.fileupload.file_up_load.com.haihai.unZip.UnZip;
import org.junit.jupiter.api.Test;

import java.io.File;

public class Unrar_Test {

    @Test
    public void unrarTest() throws Exception {
        File sourcefile=new File("C:/Users/A/Desktop/2017051130.zip");
        String destDir="C:/Users/A/Desktop/haha/";
        System.out.println(sourcefile.getName());
        System.out.println(sourcefile.getPath());
        UnZip.deCompress(sourcefile,destDir);
    }
}
