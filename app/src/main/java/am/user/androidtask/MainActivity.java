package am.user.androidtask;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageView1 = findViewById(R.id.im1);
        ImageView imageView2 = findViewById(R.id.im2);

        Picasso.get()
                .load("https://socialpro.miguelvasquez.net/public/avatar/large_johndoe_18gu2qv.jpg")
                .placeholder(R.drawable.ic_launcher_foreground)
                .into(imageView2);


        Picasso.get()
                .load("http://pureimg.com/public/uploads/large/381502405953y0x6mlzumv8pawzqjakpuomfpumicphteefom5eotxsbesxiihkbhuo9zqlozmlkcn9s8uiwktsd8nhbupcxm1jvtvzulp7w6ubt.jpg")
                .placeholder(R.drawable.ic_launcher_foreground)
                .into(imageView1);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return super.onOptionsItemSelected(item);
    }
}
