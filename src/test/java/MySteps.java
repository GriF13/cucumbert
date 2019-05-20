import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.List;

import cucumber.api.PendingException;
import cucumber.api.java.ru.*;



public class MySteps {
    Main main = new Main();
    @Допустим("^подан файл \"([^\"]*)\"$")
    public void подан_файл(String arg1) throws Throwable {
        System.out.println("Подан файл "+arg1);
        FileClass.ggetp(arg1);
        main.actions();
        // Write code here that turns the phrase above into concrete actions
    }
    @Тогда("^проверка корректности$")
    public void проверка_корректности() throws Throwable {
        if ( main.check == 0 ) System.out.println("Результат корректен");
        if (main.check == 1) System.out.println("Результат некорректен");
    }


}
