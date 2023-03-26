public class Main {
    public static void main(String[] args) {
                Boss boss=new Boss();
                boss.getWeapon().setWeapon(WeaponType.CATANA);
                boss.setDamage(50);
                boss.setHealth(400);
                boss.getWeapon().setWeaponType(" Холодное");
                System.out.println(boss.info());
                System.out.println("________________________");
                Skilleton skilleton1=new Skilleton();
                Skilleton skilleton2=new Skilleton();
                skilleton1.setDamage(33);
                skilleton1.setHealth(300);
                skilleton1.setUmberOfArrows(333);
                skilleton1.getWeapon().setWeapon(WeaponType.AK47);
                skilleton1.getWeapon().setWeaponType("огнестрелное ");
                skilleton2.setDamage(13);
                skilleton2.setHealth(290);
                skilleton2.setUmberOfArrows(111);
                skilleton2.getWeapon().setWeapon(WeaponType.MKA);
                skilleton2.getWeapon().setWeaponType("огнестрелное :");

                System.out.println(skilleton1.info());
                System.out.println("___________________________________");
                System.out.println(skilleton2.info());
            }
        }

