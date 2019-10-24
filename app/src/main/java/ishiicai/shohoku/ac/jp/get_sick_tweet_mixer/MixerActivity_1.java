package ishiicai.shohoku.ac.jp.get_sick_tweet_mixer;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MixerActivity_1 extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mixer01_screen);

        //ボタンを押した際に画面を遷移する
        Button button = (Button) findViewById(R.id.button_1);  //activity_transのボタン
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //インテントに、この画面と、遷移する別の画面を指定する
                Intent intent = new Intent(MixerActivity_1.this, MixerActivity_2.class);
                //インテントで指定した別の画面に遷移する
                startActivity(intent);
            }
        });
    }
}
