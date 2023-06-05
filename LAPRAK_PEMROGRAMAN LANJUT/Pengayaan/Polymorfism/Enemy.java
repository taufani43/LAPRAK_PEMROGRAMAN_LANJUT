package Pengayaan.Polymorfism;

class Enemy extends Character {
    protected int step;

    @Override
    public void move() {
        System.out.println("Enemy attacks!");
    }
    
    public void move(int step) {
        System.out.println("Enemy defends!");
    }
}
