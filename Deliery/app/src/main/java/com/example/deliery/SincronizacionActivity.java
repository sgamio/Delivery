package com.example.deliery;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Toast;


import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;


public class SincronizacionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sincronizacion);
    }

    public void p_Sincroniza(View view) {
        Log.i("Sincronizador", "Ingreso...!!!");
        //EditText criterio = (EditText) findViewById(R.id.criterio);

        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder()
                .url("http://condeleron.atwebpages.com/index.php/avisos")
                .build();

        client.newCall(request).enqueue(new Callback() {

            @Override
            public void onFailure(Call call, IOException e) {
                e.printStackTrace();
            }

            @Override
            public void onResponse(Call call, final Response response) throws IOException {
                if (!response.isSuccessful()) {
                    throw new IOException("Unexpected code " + response);
                } else {
                    String cadenaJson = response.body().string();
                    Log.i("====>", cadenaJson);

                    Gson gson = new Gson();
                    Type stringStringMap = new TypeToken<ArrayList<Map<String, Object>>>() {
                    }.getType();

                    final ArrayList<Map<String, Object>> retorno = gson.fromJson(cadenaJson, stringStringMap);

                    final String[] matriz = new String[retorno.size()];
                    int i = 0;
                    Log.i("====>", "Armando Listado...!!!");

                    PedidoControlDAO dao = new PedidoControlDAO(getBaseContext());

                    //dao.eliminarTodos();
                    int _s_codigo = 1;
                    int _p_anno = 19;
                    int _p_mes = 6;
                    int _p_codigo = 1;
                    int _te_codigo = 1;
                    String _te_descripcion = "Normal";
                    int _s_codigo_emitir = 71;
                    int _pp_codigo = 1;
                    String _pp_descripcion = "";
                    int _pc_hora_entrega = 10;
                    String _pc_documento = "BO/B071-00002351";
                    int _c_codigo = 740001;
                    int _tdi_codigo = 1;
                    String _tdi_numero= "09869614";
                    String _c_nombre="Gamio Pino Sandro";
                    String _c_telefono = "2478961";
                    String _cd_direccion = "Calle la Luna 242 - Urb. San Roque";
                    String _cd_distrito = "Santiago de Surco";
                    String _cd_referencia = "Esquina de Alfredo Icaza con Marte";
                    int _cd_latitud=0;
                    int _cd_longitud=0;
                    int _pc_total = 150;
                    String _m_codigo = "GPI001";
                    int _pc_partida = 0;
                    int _pc_entrega = 0;
                    int _pc_llegada = 0;

                    String _pc_observacion = "";
                    for (Map<String, Object> x : retorno) {
                        //matriz[i++] = (String) (x.get("id_aviso") + " - " + x.get("titulo") + " - Fecha: " + x.get("fecha_inicio"));
                        matriz[i++] = (String) ("[ "+ Integer.toString(_p_anno) + " - " + Integer.toString(_p_mes) + "- " + x.get("id_aviso") + " ]  Doc: "
                                + _pc_documento + " S/ " + Integer.toString(_pc_total));

                        //_p_codigo++;

                        Log.i("PedidoControlDAO", "insertar( " + x.get("id_aviso") + ")");
                        _p_codigo = Integer.parseInt(x.get("id_aviso").toString());

                        //Grabar el pedido
                        try {
                            Log.i("PedidoControlDAO", "insertar( " + Integer.toString(_p_codigo) + ")");

                            dao.insertar(_s_codigo, _p_anno, _p_mes, _p_codigo,
                                _te_codigo, _te_descripcion, _s_codigo_emitir,
                                _pp_codigo, _pp_descripcion, _pc_hora_entrega, _pc_documento,
                                _c_codigo, _tdi_codigo, _tdi_numero, _c_nombre, _c_telefono,
                                _cd_direccion, _cd_distrito, _cd_referencia, _cd_latitud, _cd_longitud,
                                _pc_total, _m_codigo, _pc_partida, _pc_entrega, _pc_llegada,
                                _pc_observacion);

                            runOnUiThread(new Runnable() {
                                @Override
                                public void run() {
                                    Toast toast= Toast.makeText(getApplicationContext(), "Se insertó correctamente", Toast.LENGTH_SHORT);
                                    toast.setGravity(Gravity.CENTER|Gravity.CENTER_HORIZONTAL, 0, 0);
                                    toast.show();
                                }
                            });
                        } catch (DAOException e) {
                            Log.i("PedidoControl", "====> " + e.getMessage());
                        }

                    }
                    Log.i("====>", "Armando Listado (Final)...!!!");
                    final ListView lstProductos = (ListView) findViewById(R.id.ListView_pedidos);

                    runOnUiThread(new Runnable() {
                        public void run() {

                            ArrayAdapter<String> adaptador = new ArrayAdapter<String>(
                                    SincronizacionActivity.this,
                                    android.R.layout.simple_list_item_1,
                                    matriz);
                            lstProductos.setAdapter(adaptador);

                        }
                    });
                }
            }
        });
        Log.i("====>", "Se realizo la sincronizacion con exito...!!!");
        Toast.makeText(this, "Se realizo la sincronizacion con exito...!!!", Toast.LENGTH_SHORT).show();

    }
}
