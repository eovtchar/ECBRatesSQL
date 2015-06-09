package ee.eovchar.ecbratessql;

import java.util.ArrayList;
import java.util.HashMap;

public class Cube extends HashMap<String, String> {

    public static final String CURRENCY = "currency";
    public static final String RATE = "rate";

    Cube(String currency, String rate){
        super();
        super.put(CURRENCY, currency);
        super.put(RATE, rate);

    }

}