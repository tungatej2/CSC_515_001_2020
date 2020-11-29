import com.example.android.retrofit.MainActivity;

public interface ApiService {

    @GET('https://jsonplaceholder.typicode.com/todos/1')
    Call<MainActivity.WordListAdapter> getWords();


}
