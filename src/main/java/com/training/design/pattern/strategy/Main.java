package com.training.design.pattern.strategy;

import com.training.design.pattern.strategy.attack.MissileStrategy;
import com.training.design.pattern.strategy.attack.PunchStrategy;
import com.training.design.pattern.strategy.moving.FlyingStrategy;
import com.training.design.pattern.strategy.moving.WalkingStrategy;
import com.training.design.pattern.strategy.robot.Atom;
import com.training.design.pattern.strategy.robot.Robot;
import com.training.design.pattern.strategy.robot.TaeKwonV;

/**
 * Strategy pattern.
 *
 * 행위를 클래스로 캡슐화해 동적으로 행위를 자유롭게 바꿀 수 있게 해주는 패턴.
 *
 * */
public class Main {
    public static void main(String[] args) {
        Robot taeKwonV = new TaeKwonV("TaeKwonV");
        Robot atom = new Atom("Atom");

        /* 수정된 부분: 전략 변경 방법 */
        taeKwonV.setMovingStrategy(new WalkingStrategy());
        taeKwonV.setAttackStrategy(new MissileStrategy());
        atom.setMovingStrategy(new FlyingStrategy());
        atom.setAttackStrategy(new PunchStrategy());

        /* 아래부터는 동일 */
        System.out.println("My name is " + taeKwonV.getName());
        taeKwonV.move();
        taeKwonV.attack();

        System.out.println("\nMy name is " + atom.getName());
        atom.move();
        atom.attack();
    }
}
