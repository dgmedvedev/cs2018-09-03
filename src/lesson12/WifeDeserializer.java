package lesson12;

import com.google.gson.*;

import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;

public class WifeDeserializer implements JsonDeserializer<Wife> {
    @Override
    public Wife deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
            throws JsonParseException {
        Wife wife = new Wife();
        String data = json.getAsString();
        List<String> parts = Arrays.asList(data.split(" "));

        if (!parts.isEmpty()) {
            wife.setName(parts.get(0));
            wife.setAge(Integer.parseInt(parts.get(1)));
        }

        return wife;
    }
}