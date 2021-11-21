package bridge.java.converter;

import bridge.java.converter.converters.CSVConverter;
import bridge.java.converter.converters.Converter;
import bridge.java.converter.converters.JsonConverter;
import bridge.java.converter.employees.ITGuy;
import bridge.java.converter.employees.ProjectManager;

public class Program {
    public static void main(String[] args) {

        Converter csvConverter = new CSVConverter();
        Converter jsonConverter = new JsonConverter();

        ITGuy it = new ITGuy("Maurice Moss", 32, 4000d);
        ProjectManager pm = new ProjectManager("Jen Barber", 40, 6000d);

        System.out.println(csvConverter.getEmployeeFormated(it));
        System.out.println(jsonConverter.getEmployeeFormated(it));
        System.out.println(csvConverter.getEmployeeFormated(pm));
        System.out.println(jsonConverter.getEmployeeFormated(pm));
    }
}
