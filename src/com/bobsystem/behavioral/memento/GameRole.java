package com.bobsystem.behavioral.memento;

/**
 * 游戏角色
 */
public class GameRole {

    private int vitality; // 生命力
    private int attack;  // 攻击力
    private int defense; // 防御力

    public GameRole() {
    }

    public GameRole(int vitality, int attack, int defense) {

        this.vitality = vitality;
        this.attack = attack;
        this.defense = defense;
    }

    //region 备忘录模式 相关机制

    /** 保存角色状态 */
    public GameRole duplicate() {

        return new GameRole(this.vitality, this.attack, this.defense);
    }

    /** 恢复角色状态 */
    public void recovery(GameRole role) {

        this.vitality = role.getVitality();
        this.attack = role.getAtk();
        this.defense = role.getDefense();
    }

    //endregion

    /** 初始化状态 */
    public void initial() {

        this.defense = this.vitality = this.attack = 100;
    }

    /** 战斗结束后状态 */
    public void pkOver() {

        this.defense = 0;
        this.vitality = 0;
        this.attack = 0;
    }

    /** 显示角色状态 */
    public void show() {

        System.out.println(this);
    }

    @Override
    public String toString() {

        return String.format("生命力：%d，攻击力：%d，防御力：%d",
            this.vitality, this.attack, this.defense);
    }

    //region getter setter

    public int getVitality() {
        return vitality;
    }

    public void setVitality(int vitality) {
        this.vitality = vitality;
    }

    public int getAtk() {
        return attack;
    }

    public void setAtk(int atk) {
        this.attack = atk;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    //endregion
}
