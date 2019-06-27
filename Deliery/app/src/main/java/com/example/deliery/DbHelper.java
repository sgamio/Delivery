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
        // null porque se va a usar el SQLiteCursor
        super(context, "delivery.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "CREATE TABLE IF NOT EXISTS pedido_comtrol (" +
                "s_codigo INTEGER NOT NULL, " +
                "p_anno INTEGEER NOT NULL, " +
                "p_mes INTEGEER NOT NULL, " +
                "p_codigo INTEGEER NOT NULL, " +
                "te_codigo INTEGER NOT NULL, " +
                "te_descripcion TEXT NOT NULL, " +
                "s_codigo_emitir INTEGER NOT NULL, " +
                "pp_codigo INTEGRE NOT NULL, " +
                "pp_descripcion TEXT NOT NULL,  " +
                "pc_hora_entrega NUMERIC NULL, " +
                "pc_documento TEXT NOT NULL, " +
                "c_codigo INTEGRE NOT NULL, "+
                "cd_item INTEGRE NOT NULL, "+
                "pc_total INTEGER NOT NULL, " +
                "m_codigo TEXT NOT NULL, " + 
                "pc_partida NUMERIC NULL, " +
                "pc_entrega NUMERIC NULL, " +
                "pc_llegada NUMERIC NULL, " +
                "pc_observacion TEXT NULL) ";
        db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS pedido_control ");
        onCreate(db);
    }
}
