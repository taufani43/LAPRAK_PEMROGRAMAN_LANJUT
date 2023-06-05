package Pengayaan.Polymorfism;

public class App {
    public static void main(String[] args) {
        // Static polymorphism pada class Hero
        Hero hero = new Hero();
        hero.move(); 
        hero.move("Right"); 

        // Static polymorphism pada class Enemy
        Enemy enemy = new Enemy();
        enemy.move();
        enemy.move(5); 

        // Dynamic polymorphism - referensi dari class Character ke objek Hero
        Character character1 = new Hero();
        character1.move(); 

        // Dynamic polymorphism - referensi dari class Character ke objek Enemy
        Character character2 = new Enemy();
        character2.move(); 

        // Dynamic polymorphism - referensi dari class Character ke objek Witch
        Character character3 = new Witch();
        character3.move();

        // Dynamic polymorphism - referensi dari class Character ke objek Fighter
        Character character4 = (Fighter) character3; 
        character4.move(); 
    }
}

