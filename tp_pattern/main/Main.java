/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp_pattern.main;

import java.util.ArrayList;

import tp_pattern.dao.DevDao;
import tp_pattern.dao.LangDao;
import tp_pattern.dao.SocieteDao;
import tp_pattern.obj.Developpeur;
import tp_pattern.obj.Langage;
import tp_pattern.obj.Societe;

/**
 *
 * @author LENOVO
 */
public class Main {
    public static void main(String[] args){

               		 
           SocieteDao sdao = new SocieteDao();
           
           //getAll
           ArrayList<Societe> societes =  sdao.getAll();
           for(Societe societe : societes) {
        	   societe.toStringSoc();
           }
           
           
           //saveOne
           sdao.saveOne(new Societe("6","RimSoft"));
           
           
           
           
           DevDao ddao = new DevDao();
           
           //getOne
           
          Developpeur dev =  ddao.getOne(new Developpeur("3", "Sajida"));
          
          dev.toStringDev();
          
          
          LangDao ldao = new LangDao();
          
          ldao.updateOne(new Langage("1","java"));
          
    }
}
