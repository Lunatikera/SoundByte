/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import at.favre.lib.crypto.bcrypt.BCrypt;

/**
 *
 * @author santi
 */
public class Encriptacion {

    /**
     * Declaracón de variables
     */
    public static final int COST = 12;

    /**
     * Método constructor
     */
    private Encriptacion() {
        throw new IllegalStateException("Utility class");
    }

    /**
     * Mpetodo para encriptar password
     * @param password String a encriptar
     * @return regreesa la contraseña encriptada
     */
    public static String encriptarPassword(String password) {
        return BCrypt.withDefaults().hashToString(COST, password.toCharArray());
    }

    /**
     * Método para encriptar la contraseña
     * @param password contraseña a encriptar
     * @return regresa la contraseña encriptada
     */
    public static String encriptarPassword(char[] password) {
        return BCrypt.withDefaults().hashToString(COST, password);
    }

    /**
     * Método para verificar la contraseña
     * @param password contraseña
     * @param hashedPassword contraseña con hash
     * @return regresa el resultado de la verificación
     */
    public static boolean verificarPasswordConHash(String password, String hashedPassword) {
        BCrypt.Result result = BCrypt.verifyer().verify(password.toCharArray(), hashedPassword);
        return result.verified;
    }
}
