package com.kaleb.commandpattern;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    private Action action = new FirstCommand();

    private SecondCommand secondCommand = new SecondCommand();

    private FirstCommand firstCommand = new FirstCommand();

    private ThirdCommand thirdCommand = new ThirdCommand();

    private int x = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button swapButton = findViewById(R.id.swapButton);
        swapButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                swapCommand();
            }
        });

        Button toastButton = findViewById(R.id.toast);
        toastButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (action != null) {
                    action.executeAction();
                }
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private void swapCommand() {
        if (x == 1) {
            x = 2;
            action = secondCommand;
        } else if (x == 2){
            x = 0;
            action = firstCommand;
        } else {
            x = 1;
            action = thirdCommand;
        }

    }
}
