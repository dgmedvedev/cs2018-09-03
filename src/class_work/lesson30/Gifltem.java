package class_work.lesson30;

import com.google.gson.annotations.SerializedName;

public class Gifltem {
    String type;
    String id;
    String url;
    @SerializedName("import_datetime")
    String importDateTime;
}
