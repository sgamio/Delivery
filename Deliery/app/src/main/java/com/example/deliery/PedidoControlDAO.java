package com.example.deliery;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class PedidoControlDAO {

    private DbHelper _dbHelper;

    public PedidoControlDAO(Context c) {
        _dbHelper = new DbHelper(c);
    }

    public void insertar(int _s_codigo, int _p_anno, int _p_mes, int _p_codigo,
                         int _te_codigo, String _te_descripcion, int _s_codigo_emitir,
                         int _pp_codigo, String _pp_descripcion, int _pc_hora_entrega, String _pc_documento,
                         int _c_codigo, int _tdi_codigo, String _tdi_numero, String _c_nombre, String _c_telefono,
                         String _cd_direccion, String _cd_distrito, String _cd_referencia, int _cd_latitud, int _cd_longitud,
                         int _pc_total, String _m_codigo, String _pc_partida, int _pc_entrega, String _pc_llegada,
                         String _pc_observacion) throws DAOException {
        //Log.i("PedidoControlDAO", "insertar( " + Integer.toString(_s_codigo) + ")");
        SQLiteDatabase db = _dbHelper.getWritableDatabase();
        try {
            String[] args = new String[]{Integer.toString(_s_codigo), Integer.toString(_p_anno), Integer.toString(_p_mes), Integer.toString(_p_codigo),
                Integer.toString(_te_codigo), _te_descripcion, Integer.toString(_s_codigo_emitir),
                Integer.toString(_pp_codigo), _pp_descripcion, Integer.toString(_pc_hora_entrega), _pc_documento,
                Integer.toString(_c_codigo), Integer.toString(_tdi_codigo), _tdi_numero, _c_nombre, _c_telefono,
                _cd_direccion, _cd_distrito, _cd_referencia, Integer.toString(_cd_latitud), Integer.toString(_cd_longitud),
                Integer.toString(_pc_total), _m_codigo, _pc_partida, Integer.toString(_pc_entrega), _pc_llegada,
                _pc_observacion};

            db.execSQL("INSERT INTO pedido_control(s_codigo, p_anno, p_mes, p_codigo, " +
                    "te_codigo, te_descripcion, s_codigo_emitir, " +
                    "pp_codigo, pp_descripcion, pc_hora_entrega, pc_documento, " +
                    "c_codigo, tdi_codigo, tdi_numero, c_nombre, c_telefono, " +
                    "cd_direccion, cd_distrito, cd_referencia, cd_latitud, cd_longitud, " +
                    "pc_total, m_codigo, pc_partida, pc_entrega, pc_llegada, " +
                    "pc_observacion) VALUES(?,?,?,?, ?,?,?, ?,?,?,?, ?,?,?,?,?, ?,?,?,?,?, ?,?,?,?,?, ?)", args);

            Log.i("PedidoControlDAO", "Se insertó");
        } catch (Exception e) {
            throw new DAOException("PedidoControlDAO: Error al insertar: " + e.getMessage());
        } finally {
            if (db != null) {
                db.close();
            }
        }
    }

    public ArrayList<PedidoControl> obtener() throws DAOException {
        Log.i("PedidoControlDAO", "obtener()");
        SQLiteDatabase db = _dbHelper.getReadableDatabase();
        ArrayList<PedidoControl> lista = new ArrayList<PedidoControl>();

        try {
            Cursor c = db.rawQuery("select p_anno, p_mes, p_codigo, c_nombre, cd_direccion, cd_distrito, pc_partida, pc_llegada from pedido_control", null);
            if (c.getCount() > 0) {
                c.moveToFirst();
                do {
                    int p_anno = c.getInt(c.getColumnIndex("p_anno"));
                    int p_mes = c.getInt(c.getColumnIndex("p_mes"));
                    int p_codigo = c.getInt(c.getColumnIndex("p_codigo"));
                    String c_nombre = c.getString(c.getColumnIndex("c_nombre"));
                    String cd_direccion = c.getString(c.getColumnIndex("cd_direccion"));
                    String cd_distrito = c.getString(c.getColumnIndex("cd_distrito"));
                    //String cd_distrito = c.getString(c.getColumnIndex("pc_partida"));
                    //String cd_distrito = c.getString(c.getColumnIndex("pc_llegada"));

                    PedidoControl reg = new PedidoControl();

                    reg.set_p_anno(p_anno);
                    reg.set_p_mes(p_mes);
                    reg.set_p_codigo(p_codigo);
                    reg.set_c_nombre(c_nombre);
                    reg.set_cd_direccion(cd_direccion);
                    reg.set_cd_distrito(cd_distrito);

                    lista.add(reg);
                } while (c.moveToNext());
            }
            c.close();
        } catch (Exception e) {
            throw new DAOException("PedidoControlDAO: Error al obtener: " + e.getMessage());
        } finally {
            if (db != null) {
                db.close();
            }
        }
        return lista;
    }

    public void eliminarTodos() throws DAOException {
        Log.i("PedidoControladoDAO", "eliminarTodos()");
        SQLiteDatabase db = _dbHelper.getWritableDatabase();

        try {
            db.execSQL("DELETE FROM pedido_control");
        } catch (Exception e) {
            throw new DAOException("PedidoControlDAO: Error al eliminar todos: " + e.getMessage());
        } finally {
            if (db != null) {
                db.close();
            }
        }
    }

    public void partida() throws DAOException {
        Log.i("PedidoControladoDAO", "Partida()");
        SQLiteDatabase db = _dbHelper.getWritableDatabase();

        //Captura la fecha
        Date fechaActual = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String fechaActualFormato = formatter.format(fechaActual);

        try {
            String[] args = new String[]{""+ fechaActualFormato};
            db.execSQL("UPDATE pedido_control SET pc_partida = ?" , args);
            //db.execSQL("UPDATE pedido_control SET pc_partida = '" + fechaActualFormato + "'");
        } catch (Exception e) {
            throw new DAOException("PedidoControlDAO: Error en la partida: " + e.getMessage());
        } finally {
            if (db != null) {
                db.close();
            }
        }
    }

    public void llegada() throws DAOException {
        Log.i("PedidoControladoDAO", "Llegada()");
        SQLiteDatabase db = _dbHelper.getWritableDatabase();

        //Captura la fecha
        Date fechaActual = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String fechaActualFormato = formatter.format(fechaActual);

        try {
            String[] args = new String[]{""+ fechaActualFormato};
            db.execSQL("UPDATE pedido_control SET pc_llegada = ?" , args);
        } catch (Exception e) {
            throw new DAOException("PedidoControlDAO: Error en la llegada: " + e.getMessage());
        } finally {
            if (db != null) {
                db.close();
            }
        }
    }

}
