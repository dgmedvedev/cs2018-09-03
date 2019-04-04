package class_work.lesson30;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiFunctions {
    @GET("gifs/search")
    Call<GifResponse>getGifs(
            @Query("q")String q,
            @Query("api_key")String key,
            @Query("limit")int limit);
}
