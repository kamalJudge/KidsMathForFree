package game.kamal.com.kidsmathforfree;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageButton;

public class SelectGameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_game);
     //   final ImageButton mix = (ImageButton) findViewById(R.id.imageButtonMix);
        final ImageButton addition = (ImageButton) findViewById(R.id.imageButtonAddition);
        final ImageButton subtraction = (ImageButton) findViewById(R.id.imageButtonSubtraction);
        final ImageButton multipy = (ImageButton) findViewById(R.id.imageButtonMulti);
        final ImageButton mix = (ImageButton) findViewById(R.id.imageButtonMixNew);

        addition.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event)
            {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN: {

                   //     play.setImageDrawable(getResources().getDrawable(R.drawable.play_click2));

                        break;
                    }
                    case MotionEvent.ACTION_UP:{

//                        play.setImageDrawable(getResources().getDrawable(R.drawable.play_clicked));
                        Intent intent = new Intent(SelectGameActivity.this, GamePlayScreenActivity.class);
                        intent.putExtra("gameSelected","+");
                        intent.putExtra("start",0);
                        intent.putExtra("end",10);
                        startActivity(intent);
                        break;
                    }

                }

                return true;
            }
        });

        subtraction.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event)
            {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN: {

                      //  play.setImageDrawable(getResources().getDrawable(R.drawable.play_click2));

                        break;
                    }
                    case MotionEvent.ACTION_UP:{

//                        play.setImageDrawable(getResources().getDrawable(R.drawable.play_clicked));
                        Intent intent = new Intent(SelectGameActivity.this, GamePlayScreenActivity.class);
                        intent.putExtra("gameSelected","-");
                        intent.putExtra("start",0);
                        intent.putExtra("end",10);
                        startActivity(intent);
                        break;
                    }

                }

                return true;
            }
        });

        multipy.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event)
            {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN: {

                       // play.setImageDrawable(getResources().getDrawable(R.drawable.play_click2));

                        break;
                    }
                    case MotionEvent.ACTION_UP:{

//                        play.setImageDrawable(getResources().getDrawable(R.drawable.play_clicked));
                        Intent intent = new Intent(SelectGameActivity.this, GamePlayScreenActivity.class);
                        intent.putExtra("gameSelected","*");
                        intent.putExtra("start",0);
                        intent.putExtra("end",10);
                        startActivity(intent);
                    }

                }

                return true;
            }
        });

        mix.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event)
            {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN: {

                     //   play.setImageDrawable(getResources().getDrawable(R.drawable.play_click2));

                        break;
                    }
                    case MotionEvent.ACTION_UP:{

//                        play.setImageDrawable(getResources().getDrawable(R.drawable.play_clicked));
                        Intent intent = new Intent(SelectGameActivity.this, GamePlayScreenActivity.class);
                        intent.putExtra("gameSelected","mix");
                        intent.putExtra("start",0);
                        intent.putExtra("end",10);
                        startActivity(intent);
                        break;
                    }

                }

                return true;
            }
        });

    }
}
