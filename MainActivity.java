package com.example.carlo.proyectofinal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    private ListView lv1;
    private TextView tv1;


    private String nombre[]={"Gallinazo Rey","Pavon Negro o Crax Rubra","Guacamaya Amarilla","Guacamaya Bandera","Tapir","Venado Cola Blanca","Jaguar","Zorro Cangrejero","Nutria","Saino","Puma","Mono Cara Blanca "," Mono Titi Panameño", " Loro comun"," Taira"," Tucan De Pico Castaño","Tortuga Terrestre De Patas Rojas","Tigrillo", "Gato Solo"," Mono Araña Colorado"," Suirirí Piquirrojo"," Guacamaya Rojo"," Aguila Harpía"," Capibara Ronsoco"};
    private String clase[]={"Ave", "Ave","Ave", "Ave", "Mammalia", " Mammalia", " Mammalia", " Mammalia", " Mammalia"," Mammalia", " Mammalia", " Mammalia", " Mammalia", " Aves", " Mammalia", " Aves", " Sauropsida", " Mammalia"," Mammalia"," Mammalia"," Aves"," Ave"," Ave"," Mammalia"};
    private String orden[]={"Incertae Sedis","Galliformes", "Psittaciformes", "Psittaciformes","Perissodactyla", " Artiodactyla", " Mammalia", " Carnivora", " carnívora ", " Artiodactyla", " Carnivora", " Primate", " Primates", " Psittaciformes", " Carnivora", " Piciformes", " Testudin", " Carnivora", " Carnivora"," Primates", " Anseriformes", " Psittaciforme", " Accipitriforme"," Rodentia"};
    private String familia[]={"Cathartidae","Cracidae", "Psittacidae", "Psittacidae", "Tapiridae", " Cervidae", " Felidae", " Canidae", " Mustelidae"," Tayassuidae", " Feliade", " Cedibae", " Calitrichidae"," Psiittacidae", " Mustelidae", " Ramphastidae", " Testudinidae", " Felidae", " Procyonidae", " Cebidae", " Anatidae", " Psittacidae", " Accipitriforme", " Caviidae"};
    private String genero[]={"Sarcoramphus","Crax", "Ara", "Ara","Tapirus", " Odocoileus"," Panthera", " Cersocyon", " Sanguinus", " Tayassu", " Puma", " Cebus", " Saguinus", " Amazona", " Eira", " Ramphastos", " Chelonoidis", " Leopardus", " Nasua"," Ateles", " Dendrocygna", " Ara", " Harpia", " Hydrochoerus"};
    private String especies[]={"Arcoramphus Papa","Crax Rubra", "Ara ararauna", "Ara ararauna","Tapirus Bairdii", " Odocoileus Virginiaus"," Panthera onca", " Cerdocyon Thous", " Lontra longicaudis", " Tayassu Tajacu", " Puma Con Color", " Cebius Capuchino", " Saguinus Geoffroyi", " Amazona Ochrocephala"," Eira Barbara", " Ramphastos Swainsonii", " Chelonoidis Carbonaria", " Leopardus Wiedii", " Nasua Narica", " Ateles Geoffroy", " Dendrocygna Autumnalis"," Ara Chloropterus", " Harpia Harpyja", " Hydrochoerus Hydrochaeris"};
    private String nombre_comun[]={"Zopilote Rey, Condor Real, Cuervo Real", "Pavon Negro, Hocofaisan, Pavon Norteno", "Guacamaya Azul o Azul amarillo, Papagayo o Paraba Azul Amarillo", "Guacamaya Bandera, Guacamayo Macao, Guacamayo Rojo", "Tapir Centroamericano, Danta, Anteburro, Macho de Monte" , " Venado De Cola Blanca, Ciervo De Cola Blanca, Ciervo de Virginia"," Jaguar, Yaguar, Yaguerete Balam, Barum", " Zorro De Monte, Zorro Sabanero", " Nutria, Lobito De Río", " Saino, Pecarí De Collar, Jabalí", " Leon De Montaña", " Cari Blanco Maicero Capuchino Tanque Manchin"," Titi Tamarindo Panameño,Tamarindo De Nuca Café, Pinche De Morron", " Amazonas Harinoso , Loro Harinoso, amazónico", " Huron Mayor,Cabeza De Viejo", " Tucan Dios Te De", "Tortuga Morrocoya", " Gato Tigre, Caucel, Mracaya", "Coati","Mono Araña De Manos Negras","Güichichi ", " Guacamayo Aliverde", " Harpía Mayor", " Chigüire, Pancho, Chigüiro"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv1 =(TextView)findViewById(R.id.tv1);
        lv1 =(ListView)findViewById(R.id.lv1);
        ArrayAdapter<String> adapter =new ArrayAdapter<String>(this,R.layout.list_item_animal,nombre);
        lv1.setAdapter(adapter);

        lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                tv1.setText("Nombre: "+lv1.getItemAtPosition(position)+"\n"+"Clase: "+clase[position]+
                            "\n"+"Orden: "+orden[position ] + "\n"+"Familia: "+familia[position]+"\n"+"Genero: "+genero[position]+
                            "\n"+"Especies: "+especies[position]+"\n"+"Nombres Comunes: "+nombre_comun[position]);
            }
        });
    }
}
