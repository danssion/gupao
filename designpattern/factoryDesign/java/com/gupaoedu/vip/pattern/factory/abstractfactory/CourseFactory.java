package com.gupaoedu.vip.pattern.factory.abstractfactory;

import com.gupaoedu.vip.pattern.factory.ICourse;

/**
 * 抽象工厂是用户的主入口
 * 在Spring中应用得最为广泛的一种设计模式
 * 易于扩展
 * Created by Tom.
 */
public interface CourseFactory {
    ICourse createCourse();

    INote createNote();

    IVideo createVideo();

}
