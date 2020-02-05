/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unogame;

/**
 *
 * @author kauro
 */
public class Card {
     public enum Color {
        RED, YELLOW, GREEN, BLUE
    };//using enum avoiding String to make loose coupling

    public enum Value {
        ZERO, ONE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, SKIP, REVERSE, DRAWTWO, DRAWFOUR, WILDCARD
    };
    private final Color color;
    private final Value value;

    public Card(Color s, Value gVal) {
        color = s;
        value = gVal;
    }

    public Value getValue() {
        return this.value;
    }

    public Color getColor() {
        return this.color;
    }
}
