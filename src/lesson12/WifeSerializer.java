package lesson12;

import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

import java.lang.reflect.Type;
import java.util.LinkedList;
import java.util.List;

public class WifeSerializer implements JsonSerializer<Wife> {
    @Override
    public JsonElement serialize(Wife wife, Type type, JsonSerializationContext jsonSerializationContext) {
        List<String> list = new LinkedList<String>();
        if(wife==null){
            return null;
        }else
        return new JsonPrimitive(wife.getName()+" "+wife.getAge());
    }
}
