import controller.MyController;
import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;

/**
 * Created by ton on 5/16/14.
 */
public class Start {

    public static void main(String[] args) {

        Weld weld = new Weld();


        WeldContainer container = weld.initialize();


        container.instance().select(MyController.class).get();

        weld.shutdown();
        System.out.println(" Shuttind down");
    }
}
