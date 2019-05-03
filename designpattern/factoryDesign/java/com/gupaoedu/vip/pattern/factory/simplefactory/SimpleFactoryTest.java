package com.gupaoedu.vip.pattern.factory.simplefactory;

import com.gupaoedu.vip.pattern.factory.ICourse;
import com.gupaoedu.vip.pattern.factory.JavaCourse;
import com.gupaoedu.vip.pattern.factory.factorymethod.ICourseFactory;
import org.slf4j.LoggerFactory;

import java.util.Calendar;

/**
 * 小作坊式的工厂模型
 * Created by Tom.
 */
public class SimpleFactoryTest {

    public static void main(String[] args) {

//        ICourse course = new JavaCourse();
//        course.record();

//   简单工厂类
//        CourseFactory fc = new CourseFactory();
//        ICourse ic = fc.create("java");
//        ic.record();

        //传入字符串类名包名  简单工厂类
//        CourseFactory fc =  new CourseFactory();
//        ICourse ic = fc.create("com.gupaoedu.vip.pattern.factory.JavaCourse");
//        ic.record();


        //传入字符串类名    简单工厂类
//        CourseFactory fc =  new CourseFactory();
//        ICourse ic = fc.create(JavaCourse.class);
//        ic.record();




//        ICourseFactory factory = new ICourseFactory();
//        ICourse course = factory.create("com.gupaoedu.vip.pattern.factory.JavaCourse");
//        course.record();

//        CourseFactory factory = new CourseFactory();
//        ICourse course = factory.create(JavaCourse.class);
//        course.record();

    }
}
