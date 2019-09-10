package com.example.myapplication;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Locale;

public class ExecuteButtonCallback implements View.OnClickListener {

    @Override
    public void onClick(View view) {
        View parent = (View) view.getParent();

        if (view.getId() == R.id.execute) {
            EditText one = parent.findViewById(R.id.one);
            EditText two = parent.findViewById(R.id.two);

            Integer oneArg = Integer.valueOf(one.getText().toString());
            Integer twoArg = Integer.valueOf(two.getText().toString());

            TextView console = parent.findViewById(R.id.console);

            console.setText(String.format(Locale.ENGLISH, "oneArg + twoArg = %d", oneArg + twoArg));

        }
    }
}
