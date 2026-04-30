package Class_Object;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface Info {
    String author();

    int version() default 1;
}

@Info(author = "John Doe", version = 2)
class App {
    void run() {
        System.out.println("Running the application...");
    }
}

public class Annotation {
    public static void main(String[] args) {
        App app = new App();
        app.run();

        // Accessing annotation information
        // Info info = app.getClass().getAnnotation(Info.class);
        // if (info != null) {
        // System.out.println("Author: " + info.author());
        // System.out.println("Date: " + info.date());
        // System.out.println("Version: " + info.version());
        // }
    }
}
