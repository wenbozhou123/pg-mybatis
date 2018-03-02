package com.student;


import java.io.IOException;
import java.io.Reader;
import java.util.List;

import com.dao.StudentDao;
import com.pojo.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class StudentTest {

    public static void main(String[] args) throws IOException {

        Reader reader = Resources.getResourceAsReader("configuration.xml");
        SqlSessionFactoryBuilder ssfBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory = ssfBuilder.build(reader);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        StudentDao studentDao = sqlSession.getMapper(StudentDao.class);

        Student st1 =new Student();
        st1.setId("001");
        st1.setsname("liming");
        st1.setAge(18);
        st1.setSex("m");

        Student st2 =new Student();
        st2.setId("002");
        st2.setsname("小红");
        st2.setAge(20);
        st2.setSex("f");

        /*add student*/
        Integer sRet1 = studentDao.addStudent(st1);
        Integer sRet2 = studentDao.addStudent(st2);

        System.out.println("sRet1:"+sRet1);
        System.out.println("st1::"+st1);
        System.out.println("sRet1:"+sRet2);
        System.out.println("st2::"+st2);

        /*find student*/
        Student find_stu = studentDao.findStudent(st2.getId());
        System.out.println("find_stu:"+find_stu);

        find_stu.setsname("小丽");
        boolean uRet = studentDao.updateStudent(find_stu);
        System.out.println("updateStudent uRet:"+uRet);


        Student find_stu_2 = studentDao.findStudent(st2.getId());
        System.out.println("find_stu_2:"+find_stu_2);

        /*count student*/
        int count = studentDao.countStudent();
        System.out.println("countStudent, count"+count);

        List<Student> list = studentDao.listStudent();
        System.out.println("listAdmin, list:" + list);

        sqlSession.commit();
        sqlSession.close();


    }
}
