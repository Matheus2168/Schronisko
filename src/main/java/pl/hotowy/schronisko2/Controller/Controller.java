package pl.hotowy.schronisko2.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pl.hotowy.schronisko2.db.Database;
import pl.hotowy.schronisko2.model.Pet;
import pl.hotowy.schronisko2.model.Type;

import java.util.ArrayList;
import java.util.List;

@org.springframework.stereotype.Controller
public class Controller {

    private Database database;

    @Autowired
    public Controller(Database database) {
        this.database = database;
    }

    @RequestMapping("/")
    public String index(Model model){
        model.addAttribute("database",database.getDatabase());
        model.addAttribute("types", Type.values());
        return "index";
    }


    @RequestMapping("/pet")
    public String pet(Model model,@RequestParam(value = "name", required = false) String petName){
        Pet petToShow = null;
        for (Pet pet : database.getDatabase()) {
            if (pet.getName().equals(petName)){
                petToShow = pet;
            }
        }
        model.addAttribute("pet",petToShow);
        System.out.println(petToShow);
        return "/pet";
    }

    @RequestMapping("/sort")
    public String sort(@RequestParam(value = "type") Type type, Model model){
        List<Pet> database = this.database.getDatabase();
        List<Pet> result = new ArrayList<>();
        for (Pet pet : database) {
            if (pet.getType() == type){
                result.add(pet);
            }
        }
        model.addAttribute("database",result);
        model.addAttribute("types", Type.values());
        return "index";
    }

    @RequestMapping("/resetSort")
    public String resetSort(Model model){
        model.addAttribute("database",database.getDatabase());
        model.addAttribute("types", Type.values());
        return "index";
    }
}
