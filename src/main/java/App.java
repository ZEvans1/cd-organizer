import java.util.HashMap;
import spark.ModelAndView;
//import spark.template.handelbars.HandelbarsTemplateEngine;
import static spark.Spark.*;


public class App {
    public static void main(String[] args) {
        staticFileLocation("/public");

    }
}
