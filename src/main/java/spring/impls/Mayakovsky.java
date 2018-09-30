/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spring.impls;

import spring.interfaces.Lyricist;

/**
 *
 * @author dmalahov
 */
public class Mayakovsky implements Lyricist {

    @Override
    public String generate() {
        return "А вы\r\n" + "ноктюрн сыграть\r\n" + "могли бы\r\n" + "на флейте водосточных труб?";
    }

}
