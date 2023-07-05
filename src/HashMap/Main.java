package HashMap;

import java.sql.SQLOutput;
import java.util.HashMap;
class Main {
    public static void main(String[] args) {
        //HashMap implements the Map interface (needs import).
        //HashMap is similar to ArrayList, but with key-value pairs.
        //Stores objects, need to use Wrapper class.
        //ex: (name, email), (username, userID), (country, capital).

        HashMap<String, String> countries = new HashMap();

        //Add a key, and value.
        countries.put("USA", "Washington DC");
        countries.put("India", "New Delhi");
        countries.put("Poland", "Warsaw");
        countries.put("Japan", "Tokyo");

        //Will print key/value pairs.
        //System.out.println(countries);

        //Will remove USA.
        countries.remove("USA");
        System.out.println(countries);

        //Will print value for key Poland.
        System.out.println(countries.get("Poland"));

        //Will clean the HashMap;
        //countries.clear();
        //System.out.println(countries);

        //System.out.println(countries.size());

        //Will replace old value to new value.
        //countries.replace("USA", "Detroit");

        //Will check for given key.
        System.out.println(countries.containsKey("England"));

        //Will check for given value.
        System.out.println(countries.containsValue("Tokyo"));

        System.out.println("---------------------------------");
        for(String i: countries.keySet()) {
            System.out.print(i + ": " + countries.get(i));
            System.out.println();
        }
    }
}
