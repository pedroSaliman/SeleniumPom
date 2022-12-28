package Factory;

import org.aeonbits.owner.Config;

@Config.Sources(value = "file:E:/seleniumprojects/gitendtoend/SeleniumPom/src/test/java/resources/FrameWorkConfig.properties")
public interface FrameWorkConfig extends Config {
    String url();
    String fname();
    String lname();
    String theemail();
    String telephone();
    String password();
    String confirm();
    String product();
    String changepassword();
    String anotherproduct();
    String theotheremail();
    String browser();
}
