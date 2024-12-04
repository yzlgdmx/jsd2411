package ooday01;

import java.util.Random;

public class ExtendsTest {
    public static void main(String[] args) {
        // 创建不同职业的对象
        Theft theft = new Theft(1000, 100, 100, 300);
        Wizard wizard = new Wizard(600, 250, 80, 250);
        Warrior warrior = new Warrior(1500, 60, 200, 50, 1.3f);


        // 调用各个职业的方法
        theft.attack(theft.damage);
        wizard.defence(theft.damage);

        warrior.attack(warrior.damage);
        theft.defence(warrior.damage);

        wizard.attack(wizard.damage);
        warrior.defence((wizard.damage + wizard.magicAtk) * 1.1f);
    }
}

// Profession.java

abstract class Profession {
    /**
     * 玩家ID
     */
    public String userID;
    /**
     * 血量
     */
    public float hp;
    /**
     * 蓝量
     */
    public float mp;
    /**
     * 伤害
     */
    public float damage;

    public Profession(float _hp, float _mp, float _damage) {
        hp = _hp;
        mp = _mp;
        damage = _damage;
    }

    Profession() {

    }

    // 抽象方法：必须由子类实现
    public abstract void attack(float dmg);

    public abstract void defence(float dmg);

    // 虚方法：子类可以选择重写
    public void takeDamage(float dmg) {
        System.out.println("造成了 " + dmg + " 伤害");
    }
}

// Theft.java

class Theft extends Profession {
    public float dodgeValue;

    Theft(float _hp, float _mp, float _damage, float _dodgeValue) {
        super(_hp, _mp, _damage);
        dodgeValue = _dodgeValue;
    }

    Theft() {
    }

    @Override
    public void attack(float dmg) {
        System.out.println("盗贼发动了偷袭");
    }

    @Override
    public void defence(float dmg) {
        if (DodgeSystem.isDodge(dodgeValue)) dodge();
        else takeDamage(dmg);
    }

    void dodge() {
        System.out.println("盗贼闪避了攻击");
    }

    @Override
    public void takeDamage(float dmg) {
        System.out.println("盗贼受到了 " + dmg + " 伤害");
    }
}

// Wizard.java

class Wizard extends Profession {
    public float magicAtk;

    Wizard(float _hp, float _mp, float _damage, float _magicAtk) {
        super(_hp, _mp, _damage);
        magicAtk = _magicAtk;
    }

    Wizard() {
    }

    @Override
    public void attack(float dmg) {
        System.out.println("巫师发动了魔法");
    }

    @Override
    public void defence(float dmg) {
        if (dmg < magicAtk * 0.4f) System.out.println("巫师化解了攻击");
        else takeDamage(dmg);
    }

    // 注意：这里没有重写 takeDamage 方法，使用的是父类的默认实现
    @Override
    public void takeDamage(float dmg) {
        System.out.println("法师受到了 " + dmg + " 伤害");
    }

}

// Warrior.java

class Warrior extends Profession {
    /**
     * 格挡伤害量
     */
    public float blockNumeric;
    public float blockValue;

    Warrior(float _hp, float _mp, float _damage, float _blockNumeric, float _blockValue) {
        super(_hp, _mp, _damage);
        blockNumeric = _blockNumeric;
        blockValue = _blockValue;
    }

    Warrior() {
    }

    @Override
    public void attack(float dmg) {
        System.out.println("战士发起了冲锋");
    }

    @Override
    public void defence(float dmg) {
        if (blockNumeric * blockValue > dmg) {
            blockDamage();
            return;
        } else takeDamage(dmg);

    }

    void blockDamage() {
        System.out.println("战士格挡了攻击");
    }

    @Override
    public void takeDamage(float dmg) {

        System.out.println(String.format("战士受到了 %.2f 伤害", dmg -= blockNumeric));
    }
}

class DodgeSystem {

    // 检查攻击是否被闪避
    public static boolean isDodge(float dodgeValue) {
        // 检查闪避值是否在有效范围内
        if (dodgeValue < 1 || dodgeValue > 1000) {
            throw new IllegalArgumentException("闪避值必须在 1 到 1000 之间");
        }

        // 生成 1 到 1000 之间的随机数
        Random random = new Random();
        int randomNumber = random.nextInt(1000) + 1;  // 生成 [1, 1000] 之间的随机数

        // 比较闪避值和随机数
        return dodgeValue >= randomNumber;
    }
}