package com.company;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

/**
 * Created by JohnMM2014 on 2/18/16.
 */
public class Player {

    public String name;
    public int health;
    public String weapon;

    public void loseHealth (int damage) {
        this.health = this.health - damage;
        if(this.health <= 0) {
            System.out.println("Player knocked out");
        }
    }

    public int healthRemaining() {
        return this.health;
    }
}
