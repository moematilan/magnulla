import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonParser {
    public static void main(String[] args) {
        String jsonString = "{\"name\":\"Alice\",\"age\":30}";
        parse(jsonString);
    }

    public static void parse(String jsonString) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            User user = objectMapper.readValue(jsonString, User.class);
            System.out.println(user);
        } catch (Exception e) {
            System.err.println("Error parsing JSON: " + e.getMessage());
        }
    }
}

class User {
    public String name;
    public int age;

    @Override
    public String toString() {
        return "User{name='" + name + "', age=" + age + '}';
    }
}
