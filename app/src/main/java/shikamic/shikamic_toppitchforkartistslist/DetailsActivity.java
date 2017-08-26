package shikamic.shikamic_toppitchforkartistslist;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsActivity extends Activity {

    private static final String TAG = "DetailsActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        Log.d(TAG, "onCreate");
    }

    @Override
    protected void onStart() {
        Log.d(TAG, "onStart");

        super.onStart();

        Intent intent = getIntent();
        if(intent != null) {
            ImageView icon = (ImageView) findViewById(R.id.image);
            TextView artistName = (TextView) findViewById(R.id.text1);
            TextView albumName = (TextView) findViewById(R.id.text2);
            TextView reviewerName = (TextView) findViewById(R.id.text3);
            TextView genre = (TextView) findViewById(R.id.text4);
            TextView date = (TextView) findViewById(R.id.text5);
            TextView shortDescription = (TextView) findViewById(R.id.text6);
            TextView longDescription = (TextView) findViewById(R.id.text7);

            icon.setImageResource(intent.getIntExtra("albumCover", -1));
            artistName.setText(intent.getCharSequenceExtra("artistName"));
            albumName.setText(intent.getCharSequenceExtra("albumName"));
            reviewerName.setText(intent.getCharSequenceExtra("reviewerName"));
            genre.setText(intent.getCharSequenceExtra("genre"));
            date.setText(intent.getCharSequenceExtra("date"));
            shortDescription.setText(intent.getCharSequenceExtra("shortDescription"));
            longDescription.setText(intent.getCharSequenceExtra("longDescription"));



        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_details, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}