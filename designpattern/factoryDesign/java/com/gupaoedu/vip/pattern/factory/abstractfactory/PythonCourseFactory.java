package com.gupaoedu.vip.pattern.factory.abstractfactory;

import com.gupaoedu.vip.pattern.factory.ICourse;

/**
 * Created by Tom.
 */
public class PythonCourseFactory implements CourseFactory {

    @Override
    public ICourse createCourse() {
        return null;
    }

    public INote createNote() {
        return new PythonNote();
    }

    public IVideo createVideo() {
        return new PythonVideo();
    }
}
