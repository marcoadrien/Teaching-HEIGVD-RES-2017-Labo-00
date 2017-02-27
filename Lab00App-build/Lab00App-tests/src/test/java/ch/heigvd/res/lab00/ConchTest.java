/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.heigvd.res.lab00;

/**
 *
 * @author Adrien
 */
public class ConchTest {
   
   
    @Test
    public void aConchShouldMakeDuuuuh() {
    IInstrument conch = new Conch();
    String sound = conch.play();
    Assert.assertEquals("duuuuh", sound);
  }
   
}
