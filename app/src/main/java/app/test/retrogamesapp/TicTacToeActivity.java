package app.test.retrogamesapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

public class TicTacToeActivity extends CatalogActivity implements View.OnClickListener {

    private TextView playerOneScore, playerTwoScore, playerStatus;
    private Button[]buttons=new Button[9];

    private Button resetGame;
    private Button revenge;
    private Button toCatalog;

    private int playerOneScoreCount, playerTwoScoreCount, rountCount, playerOneScoreCountLong, playerTwoScoreCountLong;
    boolean activePlayer;
    boolean revengeFlag;
    boolean roundEnd;
    boolean canGo;


    //p1=>0
    //p2=>1
    //empty=>2
    int[]gameState={2,2,2,2,2,2,2,2,2};

    int[][]winningPositions={
            {0,1,2},{3,4,5},{6,7,8},
            {0,3,6},{1,4,7},{2,5,8},
            {0,4,8},{2,4,6}
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Window w =getWindow();
        w.getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
        | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);

        setContentView(R.layout.activity_tic_tac_toe);

        playerOneScore=(TextView) findViewById(R.id.playerOneScore);
        playerTwoScore=(TextView) findViewById(R.id.playerTwoScore);
        playerStatus=(TextView) findViewById(R.id.playerStatus);

        resetGame=(Button) findViewById(R.id.resetGame);
        revenge=(Button) findViewById(R.id.revenge);
        toCatalog=(Button) findViewById(R.id.toCatalog);

        for(int i=0;i< buttons.length;i++){
            String buttonID="btn_"+i;
            int resourceID=getResources().getIdentifier(buttonID,"id",getPackageName());
            buttons[i]=(Button) findViewById(resourceID);
            buttons[i].setOnClickListener(TicTacToeActivity.this);
        }

        rountCount=0;
        playerOneScoreCount=0;
        playerTwoScoreCount=0;
        playerOneScoreCountLong=0;
        playerTwoScoreCountLong=0;
        activePlayer=true;
        revengeFlag=true;
        roundEnd=false;
        canGo=true;
        playerStatus.setText("");
    }


    @Override
    public void onClick(View v) {

        toCatalog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TicTacToeActivity.this, CatalogActivity.class));
                finish();
            }
        });


        //если клетка не пустая
        if(!((Button)v).getText().toString().equals("")){
            return;
        }
        String buttonID=v.getResources().getResourceEntryName(v.getId());//btn_2
        int gameStatePointer=Integer.parseInt(buttonID.substring(buttonID.length()-1,buttonID.length()));//2

        if(activePlayer && canGo==true){
            ((Button)v).setText("X");
            ((Button)v).setTextColor(Color.parseColor("#810955"));
            gameState[gameStatePointer]=0;
        }
        else if (!activePlayer && canGo==true){
            ((Button)v).setText("0");
            ((Button)v).setTextColor(Color.parseColor("#FF5F00"));
            gameState[gameStatePointer]=1;
        }
        rountCount++;

        if(checkWinner()){
            if(activePlayer  && canGo==true){
                playerOneScoreCountLong++;
                playerOneScoreCount++;
                ((Button)v).setText("X");
                ((Button)v).setTextColor(Color.parseColor("#810955"));
                updatePlayerScore();
                roundEnd=true;
                canGo=false;

            }
            else if (!activePlayer  && canGo==true){
                playerTwoScoreCountLong++;
                playerTwoScoreCount++;
                ((Button)v).setText("0");
                ((Button)v).setTextColor(Color.parseColor("#FF5F00"));
                updatePlayerScore();
                roundEnd=true;
                canGo=false;
            }
        }
        else if(rountCount==9){
            roundEnd=true;
            canGo=false;
            playerStatus.setText("Ничья");
        }
        else{
            activePlayer=!activePlayer;
        }

        if(playerOneScoreCount>playerTwoScoreCount && roundEnd==true){
            playerStatus.setText("Победил космонавт!");
        }
        else if(playerTwoScoreCount>playerOneScoreCount && roundEnd==true){
            playerStatus.setText("Победил пришелец!");
        }
        else{
            playerStatus.setText("");
        }

        resetGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playAgain();
                playerOneScoreCount=0;
                playerTwoScoreCount=0;
                playerOneScoreCountLong=0;
                playerTwoScoreCountLong=0;
                playerStatus.setText("");
                updatePlayerScore();
                revengeFlag=false;
                roundEnd=false;
                canGo=true;
            }
        });

        revenge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                revengeFlag=true;
                roundEnd=false;
                canGo=true;
                playerOneScoreCount=0;
                playerTwoScoreCount=0;
                playerStatus.setText("");
                playAgain();
            }
        });


    }

    public boolean checkWinner(){
        boolean winnerResult=false;
        for(int [] winningPosition:winningPositions){
            if(gameState[winningPosition[0]]==gameState[winningPosition[1]] &&
                    gameState[winningPosition[1]]==gameState[winningPosition[2]] &&
                    gameState[winningPosition[0]]!=2){
                winnerResult=true;
            }
        }
        return winnerResult;
    }

    public void updatePlayerScore(){
        playerOneScore.setText(Integer.toString(playerOneScoreCountLong));
        playerTwoScore.setText(Integer.toString(playerTwoScoreCountLong));
    }

    public void playAgain(){
        activePlayer=true;
        canGo=true;
        rountCount=0;


        for(int i=0;i<buttons.length;i++){
            gameState[i]=2;
            buttons[i].setText("");
        }

    }

}