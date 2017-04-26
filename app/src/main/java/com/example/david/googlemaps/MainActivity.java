package com.example.david.googlemaps;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = (Button)findViewById(R.id.btn_connectToMap);

                /* déclenchement du bouton VOIR LISTE */
        btn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View actuelView)
            {
                // lancement d'une google map
                Intent intent = new Intent(MainActivity.this, MapsActivity.class);
                startActivity(intent);
            }

        });

    }
}
