package com.example.deliery;

public class PedidoControl {

    private int _s_codigo;
    private int _p_anno;
    private int _p_mes;
    private int _p_codigo;
    private int _te_codigo;
    private String _te_descripcion;
    private int _s_codigo_emitir;
    private int _pp_codigo;
    private String _pp_descripcion;
    private int _pc_hora_entrega;
    private String _pc_documento;

    private int _c_codigo;
    private int _tdi_codigo;
    private String _tdi_numero;
    private String _c_nombre;
    private String _c_telefono;
    private String _cd_direccion;
    private String _cd_distrito;
    private String _cd_referencia;
    private int _cd_latitud;
    private int _cd_longitud;

    private int _pc_total;
    private String _m_codigo;
    private int _pc_partida;
    private int _pc_entrega;
    private int _pc_llegada;
    private String _pc_observacion;

    public PedidoControl(int _s_codigo, int _p_anno, int _p_mes, int _p_codigo, int _te_codigo,
                         String _te_descripcion, int _s_codigo_emitir, int _pp_codigo, String _pp_descripcion,
                         int _pc_hora_entrega, String _pc_documento, int _c_codigo, int _tdi_codigo,
                         String _tdi_numero, String _c_nombre, String _c_telefono, String _cd_direccion,
                         String _cd_distrito, String _cd_referencia, int _cd_latitud, int _cd_longitud,
                         int _pc_total, String _m_codigo, int _pc_partida, int _pc_entrega, int _pc_llegada, String _pc_observacion) {
        this._s_codigo = _s_codigo;
        this._p_anno = _p_anno;
        this._p_mes = _p_mes;
        this._p_codigo = _p_codigo;
        this._te_codigo = _te_codigo;
        this._te_descripcion = _te_descripcion;
        this._s_codigo_emitir = _s_codigo_emitir;
        this._pp_codigo = _pp_codigo;
        this._pp_descripcion = _pp_descripcion;
        this._pc_hora_entrega = _pc_hora_entrega;
        this._pc_documento = _pc_documento;
        this._c_codigo = _c_codigo;
        this._tdi_codigo = _tdi_codigo;
        this._tdi_numero = _tdi_numero;
        this._c_nombre = _c_nombre;
        this._c_telefono = _c_telefono;
        this._cd_direccion = _cd_direccion;
        this._cd_distrito = _cd_distrito;
        this._cd_referencia = _cd_referencia;
        this._cd_latitud = _cd_latitud;
        this._cd_longitud = _cd_longitud;
        this._pc_total = _pc_total;
        this._m_codigo = _m_codigo;
        this._pc_partida = _pc_partida;
        this._pc_entrega = _pc_entrega;
        this._pc_llegada = _pc_llegada;
        this._pc_observacion = _pc_observacion;
    }

    public int get_s_codigo() {
        return _s_codigo;
    }

    public void set_s_codigo(int _s_codigo) {
        this._s_codigo = _s_codigo;
    }

    public int get_p_anno() {
        return _p_anno;
    }

    public void set_p_anno(int _p_anno) {
        this._p_anno = _p_anno;
    }

    public int get_p_mes() {
        return _p_mes;
    }

    public void set_p_mes(int _p_mes) {
        this._p_mes = _p_mes;
    }

    public int get_p_codigo() {
        return _p_codigo;
    }

    public void set_p_codigo(int _p_codigo) {
        this._p_codigo = _p_codigo;
    }

    public int get_te_codigo() {
        return _te_codigo;
    }

    public void set_te_codigo(int _te_codigo) {
        this._te_codigo = _te_codigo;
    }

    public String get_te_descripcion() {
        return _te_descripcion;
    }

    public void set_te_descripcion(String _te_descripcion) {
        this._te_descripcion = _te_descripcion;
    }

    public int get_s_codigo_emitir() {
        return _s_codigo_emitir;
    }

    public void set_s_codigo_emitir(int _s_codigo_emitir) {
        this._s_codigo_emitir = _s_codigo_emitir;
    }

    public int get_pp_codigo() {
        return _pp_codigo;
    }

    public void set_pp_codigo(int _pp_codigo) {
        this._pp_codigo = _pp_codigo;
    }

    public String get_pp_descripcion() {
        return _pp_descripcion;
    }

    public void set_pp_descripcion(String _pp_descripcion) {
        this._pp_descripcion = _pp_descripcion;
    }

    public int get_pc_hora_entrega() {
        return _pc_hora_entrega;
    }

    public void set_pc_hora_entrega(int _pc_hora_entrega) {
        this._pc_hora_entrega = _pc_hora_entrega;
    }

    public String get_pc_documento() {
        return _pc_documento;
    }

    public void set_pc_documento(String _pc_documento) {
        this._pc_documento = _pc_documento;
    }

    public int get_c_codigo() {
        return _c_codigo;
    }

    public void set_c_codigo(int _c_codigo) {
        this._c_codigo = _c_codigo;
    }

    public int get_tdi_codigo() {
        return _tdi_codigo;
    }

    public void set_tdi_codigo(int _tdi_codigo) {
        this._tdi_codigo = _tdi_codigo;
    }

    public String get_tdi_numero() {
        return _tdi_numero;
    }

    public void set_tdi_numero(String _tdi_numero) {
        this._tdi_numero = _tdi_numero;
    }

    public String get_c_nombre() {
        return _c_nombre;
    }

    public void set_c_nombre(String _c_nombre) {
        this._c_nombre = _c_nombre;
    }

    public String get_c_telefono() {
        return _c_telefono;
    }

    public void set_c_telefono(String _c_telefono) {
        this._c_telefono = _c_telefono;
    }

    public String get_cd_direccion() {
        return _cd_direccion;
<<<<<<< HEAD
    }

    public void set_cd_direccion(String _cd_direccion) {
        this._cd_direccion = _cd_direccion;
    }

    public String get_cd_distrito() {
        return _cd_distrito;
    }

    public void set_cd_distrito(String _cd_distrito) {
        this._cd_distrito = _cd_distrito;
    }

    public String get_cd_referencia() {
        return _cd_referencia;
    }

    public void set_cd_referencia(String _cd_referencia) {
        this._cd_referencia = _cd_referencia;
    }

    public int get_cd_latitud() {
        return _cd_latitud;
    }

    public void set_cd_latitud(int _cd_latitud) {
        this._cd_latitud = _cd_latitud;
    }

    public int get_cd_longitud() {
        return _cd_longitud;
    }

=======
    }

    public void set_cd_direccion(String _cd_direccion) {
        this._cd_direccion = _cd_direccion;
    }

    public String get_cd_distrito() {
        return _cd_distrito;
    }

    public void set_cd_distrito(String _cd_distrito) {
        this._cd_distrito = _cd_distrito;
    }

    public String get_cd_referencia() {
        return _cd_referencia;
    }

    public void set_cd_referencia(String _cd_referencia) {
        this._cd_referencia = _cd_referencia;
    }

    public int get_cd_latitud() {
        return _cd_latitud;
    }

    public void set_cd_latitud(int _cd_latitud) {
        this._cd_latitud = _cd_latitud;
    }

    public int get_cd_longitud() {
        return _cd_longitud;
    }

>>>>>>> 8791b816cabe5cedb111118617145be1688097aa
    public void set_cd_longitud(int _cd_longitud) {
        this._cd_longitud = _cd_longitud;
    }

    public int get_pc_total() {
        return _pc_total;
    }

    public void set_pc_total(int _pc_total) {
        this._pc_total = _pc_total;
    }

    public String get_m_codigo() {
        return _m_codigo;
    }

    public void set_m_codigo(String _m_codigo) {
        this._m_codigo = _m_codigo;
    }

    public int get_pc_partida() {
        return _pc_partida;
    }

    public void set_pc_partida(int _pc_partida) {
        this._pc_partida = _pc_partida;
    }

    public int get_pc_entrega() {
        return _pc_entrega;
    }

    public void set_pc_entrega(int _pc_entrega) {
        this._pc_entrega = _pc_entrega;
    }

    public int get_pc_llegada() {
        return _pc_llegada;
    }

    public void set_pc_llegada(int _pc_llegada) {
        this._pc_llegada = _pc_llegada;
    }

    public String get_pc_observacion() {
        return _pc_observacion;
    }

    public void set_pc_observacion(String _pc_observacion) {
        this._pc_observacion = _pc_observacion;
    }

    public static class PedidoRecycleViewAdaptador {
    }
}
