package controller;

import javax.annotation.PostConstruct;
import javax.inject.Singleton;

/**
 * Created by ton on 5/16/14.
 */
@Singleton
public class MyController {


    @PostConstruct
    public void metodoInicial() {
        System.out.println(" executou com post-construct");
    }


    public void ultimo() {
        System.out.println(" executou com @predestroy");
    }
}
