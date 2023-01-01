package Factory;

import lombok.SneakyThrows;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.FileInputStream;
import java.util.Base64;

public class Screen {

     public WebDriver driver;

    @SneakyThrows
    public  String takeScreenshoot(){


        File source= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        String path=System.getProperty("user.dir")+"/screen/image.png";
        FileUtils.copyFile(source,new File(path));
       byte[] imagebytes= IOUtils.toByteArray(new FileInputStream(path));
       String base= Base64.getEncoder().encodeToString(imagebytes);
       return base;
    }
}
