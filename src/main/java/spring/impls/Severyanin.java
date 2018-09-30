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
public class Severyanin implements Lyricist {

    @Override
    public String generate() {
        return "Это было у моря, где ажурная пена,\r\n" + "Где встречается редко городской экипаж…\r\n"
                + "Королева играла — в башне замка — Шопена,\r\n" + "И, внимая Шопену, полюбил её паж. ";
    }

}
