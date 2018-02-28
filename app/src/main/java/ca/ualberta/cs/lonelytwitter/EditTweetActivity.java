package ca.ualberta.cs.lonelytwitter;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class EditTweetActivity extends Activity {

    private TextView show;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_tweet);

        Intent passed = getIntent();

        String message = passed.getStringExtra("words");

        show = (TextView) findViewById(R.id.flag);

        show.setText(message);
    }

}
