package ru.itschool.calculator;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import net.objecthunter.exp4j.ExpressionBuilder;

public class MainActivity extends AppCompatActivity {
    private final String TAG = "MainActivity";
    private String mExpression = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView text = findViewById(R.id.text_res);

        int[] ctlButtonsIds = {
                R.id.button_9, R.id.button_8, R.id.button_7, R.id.button_div,
                R.id.button_4, R.id.button_5, R.id.button_6, R.id.button_mlp,
                R.id.button_1, R.id.button_2, R.id.button_3, R.id.button_sub,
                R.id.button_0, R.id.button_add};
        for (int buttonId : ctlButtonsIds) {
            findViewById(buttonId).setOnClickListener(v -> {
                Button button = (Button) v;
                mExpression += button.getText();
                Log.i(TAG, button.getText() + " clicked, new expression: " + mExpression);
                text.setText(mExpression);
            });
        }

        findViewById(R.id.button_bs).setOnClickListener(v -> {
            if (!mExpression.isEmpty()) {
                mExpression = mExpression.substring(0, mExpression.length() - 1);
            }
            Log.i(TAG, "Backspace clicked, new expression: " + mExpression);
            text.setText(mExpression);
        });

        findViewById(R.id.button_res).setOnClickListener(v -> {
            mExpression = String.valueOf((long) new ExpressionBuilder(mExpression).build().evaluate());
            Log.i(TAG, "Result clicked, result calculated: " + mExpression);
            text.setText(mExpression);
        });
    }
}
