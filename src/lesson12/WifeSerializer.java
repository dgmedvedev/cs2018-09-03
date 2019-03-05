package lesson12;

import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

import java.lang.reflect.Type;

public class WifeSerializer implements JsonSerializer<Wife> {
    @Override
    public JsonElement serialize(Wife wife, Type type, JsonSerializationContext jsonSerializationContext) {
        if (wife!=null) {

            return new JsonPrimitive(wife.getName() + " " + wife.getAge());

        } else return new JsonPrimitive("нет жены");
    }
}