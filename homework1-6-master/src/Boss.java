public class Boss extends  GameEnity{
    Weapon weapon=new Weapon();

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
    public String info (){
        return  " Здоровье босса : "+getHealth() +"\nУрон босса: " +getDamage() +"\nТип оружия босса: "+ weapon.getWeaponType()+
                " \nОружие босса: "+weapon.getWeapon() ;
    }
}
