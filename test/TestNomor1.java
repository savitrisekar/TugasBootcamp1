/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Test;
import static org.junit.Assert.*;
import tugas1.Nomor1;

/**
 *
 * @author KHAIRUL MUNA
 */
public class TestNomor1 {
    Nomor1 nomor1;
    
    public TestNomor1() {
    }
    
     @Test
     public void test1() {
         Nomor1 obj = new Nomor1();
         assertEquals(625.0, obj.pangkat(5.0, 4.0), 0);
         assertEquals(0.125, obj.pangkat(2.0, -3.0), 0);
         assertEquals(81.0, obj.pangkat(9.0, 2.0), 0);
         
         assertEquals(5, obj.kombinasi(5, 4));
         assertEquals(35, obj.kombinasi(7, 3));
         assertEquals(84, obj.kombinasi(9, 3));
     }
}
