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
public class SimpleMan implements Lyricist {

    @Override
    public String generate() {
        return "Я человек простой, стихов не пишу";
    }

}
