package app.test.retrogamesapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainQuizActivity extends AppCompatActivity {

    private String selectedTopicName="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Window w =getWindow();
        w.getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);

        setContentView(R.layout.activity_main_quiz);

        final LinearLayout firstLayout = findViewById(R.id.firstLayout);
        final LinearLayout secondLayout = findViewById(R.id.secondLayout);
        final LinearLayout thirdLayout = findViewById(R.id.thirdLayout);
        final LinearLayout fourthLayout = findViewById(R.id.fourthLayout);

        final Button startBtn = findViewById(R.id.startQuizBtn);
        final Button toCatalogFromQuiz = findViewById(R.id.toCatalogFromQuiz);

        firstLayout.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                selectedTopicName="Космонавты";

                firstLayout.setBackgroundResource(R.drawable.round_back_green20);

                secondLayout.setBackgroundResource(R.drawable.round_back_white10);
                thirdLayout.setBackgroundResource(R.drawable.round_back_white10);
                fourthLayout.setBackgroundResource(R.drawable.round_back_white10);
            }
        });

        secondLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectedTopicName="История";

                secondLayout.setBackgroundResource(R.drawable.round_back_green20);

                firstLayout.setBackgroundResource(R.drawable.round_back_white10);
                thirdLayout.setBackgroundResource(R.drawable.round_back_white10);
                fourthLayout.setBackgroundResource(R.drawable.round_back_white10);
            }
        });

        thirdLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectedTopicName="Созвездия";

                thirdLayout.setBackgroundResource(R.drawable.round_back_green20);

                firstLayout.setBackgroundResource(R.drawable.round_back_white10);
                secondLayout.setBackgroundResource(R.drawable.round_back_white10);
                fourthLayout.setBackgroundResource(R.drawable.round_back_white10);
            }
        });

        fourthLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectedTopicName="Общее";

                fourthLayout.setBackgroundResource(R.drawable.round_back_green20);

                firstLayout.setBackgroundResource(R.drawable.round_back_white10);
                secondLayout.setBackgroundResource(R.drawable.round_back_white10);
                thirdLayout.setBackgroundResource(R.drawable.round_back_white10);
            }
        });

        startBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(selectedTopicName.isEmpty()){
                    Toast.makeText(MainQuizActivity.this,"Выберите тему", Toast.LENGTH_SHORT).show();
                }
                else{
                    Intent intent = new Intent(MainQuizActivity.this,QuizActivity.class);
                    intent.putExtra("selectedTopic", selectedTopicName);
                    startActivity(intent);
                }
            }
        });


        toCatalogFromQuiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainQuizActivity.this,CatalogActivity.class);
                startActivity(intent);
            }
        });


    }
}