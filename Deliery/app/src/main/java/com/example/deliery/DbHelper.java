package com.example.deliery;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class DbHelper extends SQLiteOpenHelper {

    public DbHelper(Context context, String name, CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    public DbHelper(Context context) {
        super(context, "delivery.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

         String sql_pedido_control = "CREATE TABLE IF NOT EXISTS pedido_control (" +
                "s_codigo INTEGER NOT NULL, " +
                "p_anno INTEGEER NOT NULL, " +
                "p_mes INTEGEER NOT NULL, " +
                "p_codigo INTEGEER NOT NULL, " +
                "te_codigo INTEGER NOT NULL, " +
                "te_descripcion TEXT NOT NULL, " +
                "s_codigo_emitir INTEGER NOT NULL, " +
                "pp_codigo INTEGRE NOT NULL, " +
                "pp_descripcion TEXT NOT NULL, " +
                "pc_hora_entrega NUMERIC, " +
                "pc_documento TEXT NOT NULL, " +
                "c_codigo INTEGRE NOT NULL, "+
                "tdi_codigo INTEGER NOT NULL, " +
                "tdi_numero INTEGER NOT NULL, " +
                "c_nombre TEXT NOT NULL, " +
                "c_telefono TEXT NOT NULL," +
                "cd_direccion TEXT NOT NULL, " +
                "cd_distrito TEXT NOT NULL, " +
                "cd_referencia TEXT, " +
                "cd_latitud NUMERIC NOT NULL," +
                "cd_longitud NUMERIC NOT NULL," +
                "pc_total INTEGER NOT NULL, " +
                "m_codigo TEXT NOT NULL, " +
                "pc_partida NUMERIC, " +
                "pc_entrega NUMERIC, " +
                "pc_llegada NUMERIC, " +
                "pc_observacion TEXT) ";
        db.execSQL(sql_pedido_control);

        String sql_pedido_pago = "CREATE TABLE IF NOT EXISTS pedido_pago (" +
                "s_codigo INTEGER NOT NULL, " +
                "p_anno INTEGER NOT NULL, " +
                "p_mes INTEGER NOT NULL, " +
                "p_codigo INTEGER NOT NULL, " +
                "pp_item INTEGER NOT NULL, " +
                "tp_codigo TEXT NOT NULL, " +
                "tt_codigo INTEGER, " +
                "tt_descripcion TEXT, " +
                "pp_importe NUMERIC NOT NULL, " +
                "pp_vuelto NUMERIC NOT NULL)";
        db.execSQL(sql_pedido_pago);

        String sql_pedido_control_evento = "CREATE TABLE IF NOT EXISTS pedido_control_evento (" +
                "s_codigo INTEGER NOT NULL, " +
                "p_anno INTEGER NOT NULL, " +
                "p_mes INTEGER NOT NULL, " +
                "p_codigo INTEGER NOT NULL, " +
                "pce_item INTEGER NOT NULL, " +
                "pcee_codigo INTEGER NOT NULL, " +
                "pce_descripcion TEXT)";
        db.execSQL(sql_pedido_control_evento);

        String sql_pedido_control_evento_estado = "CREATE TABLE IF NOT EXISTS pedido_control_evento_estado (" +
                "pree_codigo INTEGER NOT NULL, " +
                "pcee_descripcion TEXT NOT NULL)";
        db.execSQL(sql_pedido_control_evento_estado);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS pedido_control ");
        onCreate(db);

        db.execSQL("DROP TABLE IF EXISTS pedido_pago ");
        onCreate(db);

        db.execSQL("DROP TABLE IF EXISTS pedido_control_evento ");
        onCreate(db);

        db.execSQL("DROP TABLE IF EXISTS pedido_control_evento_estado ");
        onCreate(db);

    }
}
