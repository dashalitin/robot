package com.example.robot;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    float robotPrice = 35_000;
    float salary = 1700;
    float account = 700;
    float percentOfBank = 9;
    float[] monthPay = new float[315];
    private TextView countOut;
    private TextView manyMonthOut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        countOut = findViewById(R.id.countOut);
        manyMonthOut = findViewById(R.id.manyMonthOut);

        countOut.setText(int countMonth(percentOfBank, salary, robotPrice, account, monthPay));
        String monthPayList = "";
        for(float list : monthPay) {
            if (list > 0) {
                monthPayList += Float.toString(List) + ", ";
            } else {
                break;
            }

    }
    public int countMonth(float percentOfBankYear, float salary, float robotPrice, float account, float[] arrayPayments) {
        float percentOfBankMonth = percentOfBankYear / 12;
        float mortgageCost = (salary + (salary * percentOfBankMonth) / 100);
        float total = robotPrice - account;
        int count = 0;

        while (total > 0) {
            count++;
            total = total - mortgageCost;

            if (total > mortgageCost) {
                arrayPayments[count - 1] = mortgageCost;
            } else {
                arrayPayments[count - 1] = total;
            }
        }

        return count;
    }