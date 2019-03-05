package lesson12;

import com.google.gson.*;

import java.lang.reflect.Type;

public class PersonSerializer implements JsonSerializer<Person> {
    @Override
    public JsonElement serialize(Person person, Type type, JsonSerializationContext context) {
        JsonObject result = new JsonObject();

        result.addProperty("name", person.getName());
        result.addProperty("age", person.getAge());
        result.addProperty("isStudent", person.getIsStudent());
//        result.addProperty("pet", person.getPet());

        result.add("wife", context.serialize(person.getWife()));

        return result;
    }
}