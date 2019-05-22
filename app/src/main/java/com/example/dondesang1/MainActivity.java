package com.example.dondesang1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.RequestQueue;
import com.example.dondesang1.Request.MyRequest;

public class MainActivity extends infoProfil  {

    private Button btn_login;
    private Button btn_register;
    private Button btn_pswd;
    private EditText pseudo, mdp;
    private RequestQueue queue;
    private MyRequest request;
    private SessionManager SessionManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*getSupportActionBar().setTitle("BlooDonation");
        getSupportActionBar().hide();*/
        //INITIALISATION
        btn_login = (Button) findViewById(R.id.btn_login);
        btn_pswd = (Button) findViewById(R.id.btn_pswd);
        btn_register = (Button) findViewById(R.id.btn_register);
        pseudo = (EditText) findViewById(R.id.pseudo);
        mdp = (EditText) findViewById(R.id.mdp);

        queue = VolleySingleton.getInstance(this).getRequestQueue();
        request = new MyRequest(this, queue);
        SessionManager = new SessionManager(this);

        /*if(SessionManager.isLogged()){
            Intent intent= new Intent(this, ProfilDonneur.class);
            startActivity(intent);
            finish();
        }*/

        btn_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Redirection vers la page inscription
                Intent intent = new Intent(getApplicationContext(), Inscription.class);
                startActivity(intent);
            }
        });
    }}

       /* btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //récupérer les données
                String lepseudo= pseudo.getText().toString().trim();
                String lemdp= mdp.getText().toString().trim();
                if(lepseudo.length()>0 && lemdp.length()>0) {

                    request.connection(lepseudo, lemdp, new MyRequest.LoginCallBack() {
                        @Override
                        public void OnSuccess(String id, String pseudo) {
                          /*  SessionManager.insertUser(id, pseudo);
                            Intent intent= new Intent(getApplicationContext(), ProfilDonneur.class);
                            startActivity(intent);
                            finish();

                        }

                        @Override
                        public void onError(String message) {
                            Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
                        }



                }
                else{
                    Toast.makeText(getApplicationContext(), "Veuillez remplir tous les champs", Toast.LENGTH_SHORT).show();
                }
            }

        });
    }



}*/
