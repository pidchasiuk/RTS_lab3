import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button factorization = (Button) findViewById(R.id.factorization);
        Button perceptron = (Button) findViewById(R.id.perceptron);
        Button genetic_alg = (Button) findViewById(R.id.genenetic_alg);

        factorization.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(MainActivity.this, Lab1Factorization.class);
                    startActivity(intent);
                    finish();
                } catch (Exception e){} ;
            }
        });

        perceptron.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(MainActivity.this, Lab2Perceptron.class);
                    startActivity(intent);
                    finish();
                } catch (Exception e) {};
            }
        });

        genetic_alg.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(MainActivity.this, Lab3GeneticAlg.class);
                    startActivity(intent);
                    finish();
                } catch (Exception e) {};
            }
        });

    }
}