package com.zahidhasan.discart;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.facebook.accountkit.Account;
import com.facebook.accountkit.AccountKit;
import com.facebook.accountkit.AccountKitCallback;
import com.facebook.accountkit.AccountKitError;

public class TestActivity extends AppCompatActivity {

    private TextView id, phone;
    private Button logout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        logout = (Button)findViewById(R.id.logout);
        id = (TextView)findViewById(R.id.id);
        phone = (TextView)findViewById(R.id.phone);

        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AccountKit.logOut();
                finish();
            }
        });

        AccountKit.getCurrentAccount(new AccountKitCallback<Account>() {
            @Override
            public void onSuccess(Account account) {
                id.setText(account.getId());
                phone.setText(String.valueOf(account.getPhoneNumber()));
            }

            @Override
            public void onError(AccountKitError accountKitError) {

            }
        });
    }
}
