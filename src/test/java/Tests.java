import com.iclass.iclassapi.entity.CourseWithBLOBs;
import com.iclass.iclassapi.service.CoursesService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Daniel on 2017/4/14.
 * Function :
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"file:src/main/webapp/WEB-INF/spring-webmvc-servlet.xml"})
public class Tests {
    @Resource
    private CoursesService coursesService;

    @Test
    public void testCoursesService(){
        List<CourseWithBLOBs> list =coursesService.getCoursesByTeacherId(1);
        for(CourseWithBLOBs courseWithBLOBs : list){
            System.out.println(courseWithBLOBs.getCourseName());
        }
    }

}
