package com.example.appandroidstudio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class login extends AppCompatActivity {

    private EditText etUserLogin, etPasswordLogin;

    //Perfil 1
    private String user1 = "profesorIES";
    private String user2 = "123";

    //Perfil 2
    private String usuarioAlumno = "alumnoIES";
    private String contrasenaAlumno = "abc";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);



    }

    public void verificar(View v){

        String usuarioIn = etUserLogin.getText().toString();
        String contrasenaIn = etPasswordLogin.getText().toString();

        if (usuarioIn.isEmpty()) {
            mostrarToast(this, "No has metido ningún usuario");
        } else if ((contrasenaIn.isEmpty())) {
            mostrarToast(this, "La contraseña no puede estar vacía");
        } else if (usuarioIn.equals(user1) && contrasenaIn.equals(user2)){
            cambiarActivity(Profesor_Activity.class);
        } else if (usuarioIn.equals(usuarioAlumno) && contrasenaIn.equals(contrasenaAlumno)){
            cambiarActivity(AlumnoActivity.class);
        } else {
            mostrarToast(this, "Usuario o Contraseña Incorrectos");
        }
    }

}