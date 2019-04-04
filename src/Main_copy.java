import class_work.lesson30.ApiFunctions;
import class_work.lesson30.GifResponse;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Main_copy {

    public static void main(String[] args) {

        //          TestDrive.start();
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://api.giphy.com/v1/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        ApiFunctions service = retrofit.create(ApiFunctions.class);

        service.getGifs("anime", "dc6zaTOxFJmzC", 5).enqueue(new Callback<GifResponse>() {
            @Override
            public void onResponse(Call<GifResponse> call, Response<GifResponse> response) {
             // что-то не то   System.out.println(Arrays.toString(new GifResponse[]{response.body()}));
            }

            @Override
            public void onFailure(Call<GifResponse> call, Throwable throwable) {

            }
        });

    }
}