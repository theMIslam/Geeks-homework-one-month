public class Main {
    public static void main(String[] args) {
    warrior warrior = new warrior(500, 90,"");
 magic magic = new magic(460, 75,"");
 medic medic = new medic(450, 0, "");
        Hero[] heroes={ warrior,magic,medic};
        for (int i = 0; i < heroes.length; i++) {
heroes[i].applySuperAbility();
        }
        }
    }
h