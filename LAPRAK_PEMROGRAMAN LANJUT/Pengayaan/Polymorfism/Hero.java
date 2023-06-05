package Pengayaan.Polymorfism;

class Hero extends Character {
    protected String direction;

    @Override
    public void move() {
        System.out.println("Hero attacks!");
    }
    
    public void move(String direction) {
        System.out.println("Hero memakai special attack!");
    }
}
