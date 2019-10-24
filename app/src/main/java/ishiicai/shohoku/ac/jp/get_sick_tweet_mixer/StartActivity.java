package ishiicai.shohoku.ac.jp.get_sick_tweet_mixer;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;

import androidx.appcompat.app.AppCompatActivity;

public class StartActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.start_screen);
    }

    //画面を押し(離し)たときにミキサー画面へ遷移する
    @Override
    public boolean onTouchEvent(MotionEvent T_Event) {
        if (T_Event.getAction() == MotionEvent.ACTION_UP) {
            Intent intent = new Intent(StartActivity.this, MixerActivity_1.class);
            startActivity(intent);
        }
        return true;
    }
}
