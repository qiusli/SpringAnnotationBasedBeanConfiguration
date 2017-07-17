package mainApps;

import com.tutorialspoint.HelloWorld;
import com.tutorialspoint.HelloWorldConfig;
import com.tutorialspoint.TextEditor;
import com.tutorialspoint.TextEditorConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Qiushi on 7/16/2017.
 */
public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(HelloWorldConfig.class);
        HelloWorld helloWorld = context.getBean(HelloWorld.class);
        helloWorld.setMessage("Hello World");
        helloWorld.getMessage();

        ApplicationContext context1 = new AnnotationConfigApplicationContext(TextEditorConfig.class);
        TextEditor textEditor = context1.getBean(TextEditor.class);
        textEditor.checkSpell();
    }
}
