package game.kamal.com.kidsmathforfree;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        final ImageButton play = (ImageButton) findViewById(R.id.imageButton);
        play.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event)
            {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN: {

                        play.setImageDrawable(getResources().getDrawable(R.drawable.play_click2));

                        break;
                    }
                    case MotionEvent.ACTION_UP:{

                        play.setImageDrawable(getResources().getDrawable(R.drawable.play_clicked));
                        Intent intent = new Intent(MainMenuActivity.this, SelectGameActivity.class);
                        startActivity(intent);
                        break;
                    }

                }

                return true;
            }
        });

    }
}
