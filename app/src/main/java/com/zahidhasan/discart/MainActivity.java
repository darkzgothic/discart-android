package com.zahidhasan.discart;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.facebook.accountkit.AccessToken;
import com.facebook.accountkit.AccountKit;
import com.facebook.accountkit.AccountKitLoginResult;
import com.facebook.accountkit.ui.AccountKitActivity;
import com.facebook.accountkit.ui.AccountKitConfiguration;
import com.facebook.accountkit.ui.LoginType;

public class MainActivity extends AppCompatActivity {

    private final static int REQUEST_CODE = 999;

    private Button phoneLogin, emailLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        phoneLogin = (Button) findViewById(R.id.phoneLogin);
        emailLogin = (Button) findViewById(R.id.emailLogin);

        emailLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startLoginPage(LoginType.EMAIL);
            }
        });
        phoneLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startLoginPage(LoginType.PHONE);
            }
        });

        AccessToken token = AccountKit.getCurrentAccessToken();
        if (token != null){
            startActivity(new Intent(this, UserMainActivity.class));
        }else {
            Toast.makeText(this, "Login", Toast.LENGTH_SHORT).show();

        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == REQUEST_CODE){
            AccountKitLoginResult result = data.getParcelableExtra(AccountKitLoginResult.RESULT_KEY);
            if (result.getError() != null){
                Toast.makeText(this, ""+result.getError().getErrorType().getMessage(), Toast.LENGTH_SHORT).show();
                return;
            }
            else if(result.wasCancelled()){
                Toast.makeText(this, "Canceled", Toast.LENGTH_SHORT).show();
                return;
            }
            else {
                if(result.getAccessToken() != null){
                    Toast.makeText(this, "Success: " + result.getAccessToken().getAccountId(), Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(MainActivity.this, TestActivity.class));
                }
                else {
                    Toast.makeText(this, "Success: " + result.getAuthorizationCode().substring(0, 10), Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(MainActivity.this, TestActivity.class));
                }
            }
        }
    }
    private void startLoginPage(LoginType loginType) {
        if (loginType == LoginType.EMAIL){
            Intent intent = new Intent(this, AccountKitActivity.class);
            AccountKitConfiguration.AccountKitConfigurationBuilder configurationBuilder =
                    new AccountKitConfiguration.AccountKitConfigurationBuilder(LoginType.EMAIL,
                            AccountKitActivity.ResponseType.TOKEN);
            intent.putExtra(AccountKitActivity.ACCOUNT_KIT_ACTIVITY_CONFIGURATION, configurationBuilder.build());
            startActivityForResult(intent, REQUEST_CODE);

        }else if(loginType == LoginType.PHONE){
            Intent intent = new Intent(this, AccountKitActivity.class);
            AccountKitConfiguration.AccountKitConfigurationBuilder configurationBuilder =
                    new AccountKitConfiguration.AccountKitConfigurationBuilder(LoginType.PHONE,
                            AccountKitActivity.ResponseType.TOKEN);
            intent.putExtra(AccountKitActivity.ACCOUNT_KIT_ACTIVITY_CONFIGURATION, configurationBuilder.build());
            startActivityForResult(intent, REQUEST_CODE);
        }
    }
}
