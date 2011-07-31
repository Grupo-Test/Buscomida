package edu.cibertec.buscomida.util.resources;

public class ConstantesConfig {
	//CONSTANTES DE NOMBRES DE LAS TABLAS DE LA BASE DE DATOS
	private static String TABLA_CATEGORIA="categoria";
	private static String TABLA_DISTRITO="distrito";
	private static String TABLA_PLATO="plato";
	private static String TABLA_RANGOPRECIO="rangoprecio";
	private static String TABLA_RESTAURANTE="restaurante";
	private static String TABLA_SUCURSAL="sucursal";
	private static String TABLA_USUARIO="usuario";
	private static String TABLA_VOTO = "voto";
	private  static String RUTA_UPLOAD_PLATOS = "d:\\fotos\\platos\\";
	private  static String RUTA_UPLOAD_RESTAURANTES = "d:\\fotos\\restaurantes\\";
	
	//CONSTANTE DE VERIFICACION DE TRANSACCIONES.
	private static int TRANSACCION_INSERT=0;
	private static int TRANSACCION_UPDATE=0;
	private static int TRANSACCION_DELETE=0;

	
	public static String getRUTA_UPLOAD_RESTAURANTES() {
		return RUTA_UPLOAD_RESTAURANTES;
	}

	public static void setRUTA_UPLOAD_RESTAURANTES(String rUTA_UPLOAD_RESTAURANTES) {
		RUTA_UPLOAD_RESTAURANTES = rUTA_UPLOAD_RESTAURANTES;
	}

	public static String getRUTA_UPLOAD_PLATOS() {
		return RUTA_UPLOAD_PLATOS;
	}

	public static void setRUTA_UPLOAD_PLATOS(String rUTA_UPLOAD_PLATOS) {
		RUTA_UPLOAD_PLATOS = rUTA_UPLOAD_PLATOS;
	}

	public static int getTRANSACCION_INSERT() {
		return TRANSACCION_INSERT;
	}

	public static void setTRANSACCION_INSERT(int tRANSACCION_INSERT) {
		TRANSACCION_INSERT = tRANSACCION_INSERT;
	}

	public static int getTRANSACCION_UPDATE() {
		return TRANSACCION_UPDATE;
	}

	public static void setTRANSACCION_UPDATE(int tRANSACCION_UPDATE) {
		TRANSACCION_UPDATE = tRANSACCION_UPDATE;
	}

	public static int getTRANSACCION_DELETE() {
		return TRANSACCION_DELETE;
	}

	public static void setTRANSACCION_DELETE(int tRANSACCION_DELETE) {
		TRANSACCION_DELETE = tRANSACCION_DELETE;
	}

	public static String getTABLA_CATEGORIA() {
		return TABLA_CATEGORIA;
	}

	public void setTABLA_CATEGORIA(String tABLA_CATEGORIA) {
		TABLA_CATEGORIA = tABLA_CATEGORIA;
	}

	public static String getTABLA_DISTRITO() {
		return TABLA_DISTRITO;
	}

	public void setTABLA_DISTRITO(String tABLA_DISTRITO) {
		TABLA_DISTRITO = tABLA_DISTRITO;
	}

	public static String getTABLA_PLATO() {
		return TABLA_PLATO;
	}

	public void setTABLA_PLATO(String tABLA_PLATO) {
		TABLA_PLATO = tABLA_PLATO;
	}

	public static String getTABLA_RANGOPRECIO() {
		return TABLA_RANGOPRECIO;
	}

	public void setTABLA_RANGOPRECIO(String tABLA_RANGOPRECIO) {
		TABLA_RANGOPRECIO = tABLA_RANGOPRECIO;
	}

	public static String getTABLA_RESTAURANTE() {
		return TABLA_RESTAURANTE;
	}

	public void setTABLA_RESTAURANTE(String tABLA_RESTAURANTE) {
		TABLA_RESTAURANTE = tABLA_RESTAURANTE;
	}

	public static String getTABLA_SUCURSAL() {
		return TABLA_SUCURSAL;
	}

	public void setTABLA_SUCURSAL(String tABLA_SUCURSAL) {
		TABLA_SUCURSAL = tABLA_SUCURSAL;
	}

	public static String getTABLA_USUARIO() {
		return TABLA_USUARIO;
	}

	public void setTABLA_USUARIO(String tABLA_USUARIO) {
		TABLA_USUARIO = tABLA_USUARIO;
	}

	public static String getTABLA_VOTO() {
		return TABLA_VOTO;
	}

	public void setTABLA_VOTO(String tABLA_VOTO) {
		TABLA_VOTO = tABLA_VOTO;
	}

	
	
}
