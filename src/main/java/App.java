import models.Cds;

import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;
import static spark.Spark.*;


public class App {
    public static void main(String[] args) {
        staticFileLocation("/public");

        get("/", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
            ArrayList<Cds> cds = Cds.getAll();
            model.put("cds", cds);
            return new ModelAndView(model, "index.hbs");
        }, new HandlebarsTemplateEngine());

        post("/cds/new", (request, response) ->  {
            Map<String, Object> model = new HashMap<String, Object>();
            String content = request.queryParams("content");
            Cds newCds = new Cds(content);
            return new ModelAndView(model, "success.hbs");
        }, new HandlebarsTemplateEngine());



    }
}
