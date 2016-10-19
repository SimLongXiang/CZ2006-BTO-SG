package com.gjenterprise.canxer.btosg.Boundary;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.content.Intent;

import com.gjenterprise.canxer.btosg.R;

/**
 * Created by Canxer on 8/10/2016.
 */
public class RepaymentQueryUI  extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_repaymentquery);
    }
    public void viewGrant(View view) {
        // Do something in response to button
        startActivity(new Intent(RepaymentQueryUI.this, GrantQueryUI.class));
    }
    public void viewRepayment(View view) {
        // Do something in response to button
        startActivity(new Intent(RepaymentQueryUI.this, RepaymentQueryUI.class));
    }
    public void viewFlats(View view) {
        // Do something in response to button
        startActivity(new Intent(RepaymentQueryUI.this, ViewFlatQueryUI.class));
    }
}
