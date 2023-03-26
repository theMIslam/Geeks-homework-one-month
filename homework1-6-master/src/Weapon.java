public class Weapon {
        private WeaponType weapon;
        private  String WeaponType;

        public String getWeaponType() {
            return WeaponType;
        }

        public WeaponType getWeapon() {
            return weapon;
        }

        public void setWeapon(WeaponType weapon) {
            this.weapon = weapon;
        }

        public void setWeaponType(String weaponType) {
            this.WeaponType = weaponType;
        }
    }

