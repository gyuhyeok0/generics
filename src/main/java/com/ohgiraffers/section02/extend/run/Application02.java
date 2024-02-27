package com.ohgiraffers.section02.extend.run;

import com.ohgiraffers.section02.extend.*;

public class Application02 {
    public static void main(String[] args) {

        /* 수업목표. 와일드카드에 대해 이해 할 수 있다.
            필기.
                와일드카드
                제네릭 클래스 타입의 객체를 메소드의 매개변수로 받을때
                그 객체의 타입 변수를 제한 할 수있다.
                <?> : 제한 없음
                <? extends Type> : 상한제한
                <? super Type> : 하한제한
         */
        WildCardFarm wildCardFarm = new WildCardFarm();

//        wildCardFarm.anyType(new RabbitFarm<>(Mammel)(new Mammal()));
//        wildCardFarm.anyType(new RabbitFarm<>(Reptile)(new Reptile()));

        //어떠한 토끼농장이던 상관없이 매개변수로 사용 가능
        wildCardFarm.anyType(new RabbitFarm<Rabbit>(new Rabbit()));
        wildCardFarm.anyType(new RabbitFarm<Bunny>(new Bunny()));
        wildCardFarm.anyType(new RabbitFarm<DrunkenBunny>(new DrunkenBunny()));
        // BUnny 이거나 Bunny의 후손들만 매개변수로 사용 가능하다.
//        wildCardFarm.extendsType(new RabbitFarm<Rabbit>(new Rabbit()));
        wildCardFarm.extendsType(new RabbitFarm<Bunny>(new Bunny()));
        wildCardFarm.extendsType(new RabbitFarm<DrunkenBunny>(new DrunkenBunny()));

        // Bunny 이거나 Bunny dml 부모들만 매개변수로 사용 가능하다.
        wildCardFarm.superType(new RabbitFarm<Rabbit>(new Rabbit()));
        wildCardFarm.superType(new RabbitFarm<Bunny>(new Bunny()));
//        wildCardFarm.superType(new RabbitFarm<DrunkenBunny>(new DrunkenBunny()));
    }
}