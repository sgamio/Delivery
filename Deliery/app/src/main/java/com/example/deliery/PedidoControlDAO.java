package com.example.deliery;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
public class PedidoControlDAO {

    private DbHelper _dbHelper;

    public PedidoControlDAO(Context c) {
        _dbHelper = new DbHelper(c);
    }

    public void insertar(int _s_codigo, int _p_anno, int _p_mes, int _p_codigo,
                         int _te_codigo, String _te_descripcion, int _s_codigo_emitir,
                         int _pp_codigo, String _pp_descripcion, int _pc_hora_entrega,
                         String _pc_documento, int _c_codigo, int _cd_item, int _pc_total,
                         String _m_codigo, int _pc_partida, int _pc_entrega, int _pc_llegada,
                         String _pc_observacion) throws DAOException {
        //Log.i("PedidoControlDAO", "insertar( " + Integer.toString(_s_codigo) + ")");
        SQLiteDatabase db = _dbHelper.getWritableDatabase();
        try {
            String[] args = new String[]{Integer.toString(_s_codigo), Integer.toString(_p_anno), Integer.toString(_p_mes), Integer.toString(_p_codigo),
            Integer.toString(_te_codigo), _te_descripcion, Integer.toString(_s_codigo_emitir),
            Integer.toString(_pp_codigo), _pp_descripcion, Integer.toString(_pc_hora_entrega),
            _pc_documento, Integer.toString(_c_codigo), Integer.toString(_cd_item), Integer.toString(_pc_total),
            _m_codigo, Integer.toString(_pc_partida), Integer.toString(_pc_entrega), Integer.toString(_pc_llegada),
            _pc_observacion};
            db.execSQL("INSERT INTO pedido_control(s_codigo, p_anno, p_mes, p_codigo," +
                    "te_codigo, te_descripcion, s_codigo_emitir," +
                    "pp_codigo, pp_descripcion, pc_hora_entrega," +
                    "pc_documento, c_codigo, cd_item, pc_total," +
                    "m_codigo, pc_partida, pc_entrega, pc_llegada," +
                    "pc_observacion) VALUES(?,?,?,?,?,?,?,?,?,? ,?,?,?,?,?,?,?,?,?)", args);
            Log.i("PedidoControlDAO", "Se insertó");
        } catch (Exception e) {
            throw new DAOException("PedidoControlDAO: Error al insertar: " + e.getMessage());
        } finally {
            if (db != null) {
                db.close();
            }
        }
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

}
