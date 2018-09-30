/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spring.impls;

import org.springframework.stereotype.Component;
import spring.interfaces.Lyricist;

/**
 *
 * @author dmalahov
 */
@Component("LyricistBean1")
public class Poushkin implements Lyricist {

    @Override
    public String generate() {
        return "Я помню чудное мгновенье:\r\n" + "Передо мной явилась ты,\r\n" + "Как мимолетное виденье,\r\n"
                + "Как гений чистой красоты.";
    }

}
