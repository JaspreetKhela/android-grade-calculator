package com.ut.mobileapplicationsforandroiddevices_assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.EditText;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    // Note to Professor Albert Lam: I did not implement the provided template code for the
    // Mobile Applications for Android Devices course since much of that code
    // rendered errors when I used it to create the application. Consequently, I wrote the
    // application in a simplified form as shown below.

    // Create a debugging tag
    private static String TAG = "GradeCalculator";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void getAverage(View view) {
        // Get iOS grade
        EditText iOSGrade = (EditText)findViewById(R.id.editTextNumberDecimal);
        int iOSGradeValue;
        if (iOSGrade.getText().toString().equals("")) {
            iOSGradeValue = 0;
        }
        else {
            iOSGradeValue = Integer.parseInt(iOSGrade.getText().toString());
        }

        // Get Android grade
        EditText androidGrade = (EditText)findViewById(R.id.editTextNumberDecimal2);
        int androidGradeValue;
        if (androidGrade.getText().toString().equals("")) {
            androidGradeValue = 0;
        }
        else {
            androidGradeValue = Integer.parseInt(androidGrade.getText().toString());
        }

        // Get Swift grade
        EditText swiftGrade = (EditText)findViewById(R.id.editTextNumberDecimal3);
        int swiftGradeValue;
        if (swiftGrade.getText().toString().equals("")) {
            swiftGradeValue = 0;
        }
        else {
            swiftGradeValue = Integer.parseInt(swiftGrade.getText().toString());
        }

        // Get Java grade
        EditText javaGrade = (EditText)findViewById(R.id.editTextNumberDecimal4);
        int javaGradeValue;
        if (javaGrade.getText().toString().equals("")) {
            javaGradeValue = 0;
        }
        else {
            javaGradeValue = Integer.parseInt(javaGrade.getText().toString());
        }

        // Log the user's input data
        Log.d(TAG, "iOS Grade Value: " + iOSGradeValue + ", Android Grade Value: " + androidGradeValue + ", Swift Grade Value: " + swiftGradeValue + ", Java Grade Value: " + javaGradeValue);

        // Calculate the average grade
        int averageGrade = (iOSGradeValue + androidGradeValue + swiftGradeValue + javaGradeValue)/4;

        // Log the average grade value
        Log.d(TAG, "Average Grade Value: " + averageGrade);

        // Print the average grade to the layout
        TextView gradeOutput = (TextView)findViewById(R.id.textView7);
        gradeOutput.setText("Average Grade: " + String.valueOf(averageGrade));
    }

    public void getMin(View view) {
        // Get iOS grade
        EditText iOSGrade = (EditText)findViewById(R.id.editTextNumberDecimal);
        int iOSGradeValue;
        if (iOSGrade.getText().toString().equals("")) {
            iOSGradeValue = 0;
        }
        else {
            iOSGradeValue = Integer.parseInt(iOSGrade.getText().toString());
        }

        // Get Android grade
        EditText androidGrade = (EditText)findViewById(R.id.editTextNumberDecimal2);
        int androidGradeValue;
        if (androidGrade.getText().toString().equals("")) {
            androidGradeValue = 0;
        }
        else {
            androidGradeValue = Integer.parseInt(androidGrade.getText().toString());
        }

        // Get Swift grade
        EditText swiftGrade = (EditText)findViewById(R.id.editTextNumberDecimal3);
        int swiftGradeValue;
        if (swiftGrade.getText().toString().equals("")) {
            swiftGradeValue = 0;
        }
        else {
            swiftGradeValue = Integer.parseInt(swiftGrade.getText().toString());
        }

        // Get Java grade
        EditText javaGrade = (EditText)findViewById(R.id.editTextNumberDecimal4);
        int javaGradeValue;
        if (javaGrade.getText().toString().equals("")) {
            javaGradeValue = 0;
        }
        else {
            javaGradeValue = Integer.parseInt(javaGrade.getText().toString());
        }

        // Log the user's input data
        Log.d(TAG, "iOS Grade Value: " + iOSGradeValue + ", Android Grade Value: " + androidGradeValue + ", Swift Grade Value: " + swiftGradeValue + ", Java Grade Value: " + javaGradeValue);

        // Define an array with the provided grade values
        int[] grades = {iOSGradeValue, androidGradeValue, swiftGradeValue, javaGradeValue};

        int minimumGrade = grades[0];

        // Find the minimum grade
        for (int i = 0; i < 4; i++) {
            if (grades[i] <= minimumGrade) {
                minimumGrade = grades[i];
            }
        }

        // Log the minimum grade value
        Log.d(TAG, "Minimum Grade Value: " + minimumGrade);

        // Print the minimum grade to the layout
        TextView gradeOutput = (TextView)findViewById(R.id.textView7);
        gradeOutput.setText("Minimum Grade: " + String.valueOf(minimumGrade));
    }

    public void getMax(View view) {
        // Get iOS grade
        EditText iOSGrade = (EditText)findViewById(R.id.editTextNumberDecimal);
        int iOSGradeValue;
        if (iOSGrade.getText().toString().equals("")) {
            iOSGradeValue = 0;
        }
        else {
            iOSGradeValue = Integer.parseInt(iOSGrade.getText().toString());
        }

        // Get Android grade
        EditText androidGrade = (EditText)findViewById(R.id.editTextNumberDecimal2);
        int androidGradeValue;
        if (androidGrade.getText().toString().equals("")) {
            androidGradeValue = 0;
        }
        else {
            androidGradeValue = Integer.parseInt(androidGrade.getText().toString());
        }

        // Get Swift grade
        EditText swiftGrade = (EditText)findViewById(R.id.editTextNumberDecimal3);
        int swiftGradeValue;
        if (swiftGrade.getText().toString().equals("")) {
            swiftGradeValue = 0;
        }
        else {
            swiftGradeValue = Integer.parseInt(swiftGrade.getText().toString());
        }

        // Get Java grade
        EditText javaGrade = (EditText)findViewById(R.id.editTextNumberDecimal4);
        int javaGradeValue;
        if (javaGrade.getText().toString().equals("")) {
            javaGradeValue = 0;
        }
        else {
            javaGradeValue = Integer.parseInt(javaGrade.getText().toString());
        }

        // Log the user's input data
        Log.d(TAG, "iOS Grade Value: " + iOSGradeValue + ", Android Grade Value: " + androidGradeValue + ", Swift Grade Value: " + swiftGradeValue + ", Java Grade Value: " + javaGradeValue);

        // Define an array with the provided grade values
        int[] grades = {iOSGradeValue, androidGradeValue, swiftGradeValue, javaGradeValue};

        int maximumGrade = grades[0];

        // Find the maximum grade
        for (int i = 0; i < 4; i++) {
            if (grades[i] >= maximumGrade) {
                maximumGrade = grades[i];
            }
        }

        // Log the maximum grade value
        Log.d(TAG, "Maximum Grade Value: " + maximumGrade);

        // Print the minimum grade to the layout
        TextView gradeOutput = (TextView)findViewById(R.id.textView7);
        gradeOutput.setText("Maximum Grade: " + String.valueOf(maximumGrade));
    }
}