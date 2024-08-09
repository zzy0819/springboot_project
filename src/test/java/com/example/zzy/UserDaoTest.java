package com.example.zzy;

import com.example.zzy.dao.BlogMapper;
import com.example.zzy.dao.StudentMapper;
import com.example.zzy.dao.UserMapper;
import com.example.zzy.pojo.Blog;
import com.example.zzy.pojo.Student;
import com.example.zzy.pojo.User;
import com.example.zzy.utils.IDUtil;
import com.example.zzy.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class UserDaoTest {
    @Test
    public void selectUser() {
        SqlSession session = MybatisUtils.getSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        List<User> users = mapper.selectUser();
        for (User user: users){
            System.out.println(user);
        }
        session.close();
    }
    @Test
    public void selectById(){
        SqlSession session = MybatisUtils.getSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        User  one_user = mapper.getUserById(1);
        System.out.println("查询出来的一个用户为" + one_user);
    }
    @Test
    public void insertUser(){
        SqlSession session = MybatisUtils.getSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        mapper.insertUser(new User(99,"张子扬",1,"man",1232));
        session.commit();
    }

    @Test
    public void upDateUser(){
        SqlSession session = MybatisUtils.getSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        mapper.upDateUser("张子扬");
        session.commit();
    }

    @Test
    public void deleteUser(){
        SqlSession session = MybatisUtils.getSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        mapper.deleteUser("张子扬", "man");
        session.commit();
    }

    @Test
    public void getUserByLimit(){
        SqlSession session = MybatisUtils.getSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("startIndex", 0);
        map.put("pageSize", 2);
        List<User> userList = mapper.getUserByLimit(map);
        System.out.println(userList);
        session.close();
    }

    @Test
    public void getTeacher(){
        SqlSession session = MybatisUtils.getSession();
        StudentMapper studentMapper = session.getMapper(StudentMapper.class);
        List<Student> student = studentMapper.getStudent();
        for (Student student1 : student) {
            System.out.println(student1);
        }
    }

    @Test
    public void getTeacher2(){
        SqlSession session = MybatisUtils.getSession();
        StudentMapper studentMapper = session.getMapper(StudentMapper.class);
        List<Student> student = studentMapper.getStudent();
        for(Student student2 : student){
            System.out.println(student2);
        }
    }

    @Test
    public void getBlog(){
        SqlSession session = MybatisUtils.getSession();
        BlogMapper mapper = session.getMapper(BlogMapper.class);
        Blog blog = new Blog();
        blog.setId(IDUtil.genId());
        blog.setTitle("Mybatis如此简单");
        blog.setAuthor("狂神说");
        blog.setCreateTime(new Date());
        blog.setViews(9999);
        mapper.addBlog(blog);
        blog.setId(IDUtil.genId());
        blog.setTitle("Java如此简单");
        mapper.addBlog(blog);
        blog.setId(IDUtil.genId());
        blog.setTitle("Spring如此简单");
        mapper.addBlog(blog);
        blog.setId(IDUtil.genId());
        blog.setTitle("微服务如此简单");
        mapper.addBlog(blog);
        session.commit();
        session.close();
    }

    @Test
    public void testQueryBlogIf(){
        SqlSession session = MybatisUtils.getSession();
        BlogMapper mapper = session.getMapper(BlogMapper.class);
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("title","Mybatis如此简单");
        map.put("author","狂神说");
        List<Blog> blogs  = mapper.queryBlogIf(map);
        for (Blog blog : blogs) {
            System.out.println(blog);
        }
        session.close();
    }
    @Test
    public void testQueryBlogChoose(){
        SqlSession session = MybatisUtils.getSession();
        BlogMapper mapper = session.getMapper(BlogMapper.class);
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("title","Mybatis如此简单");
        map.put("id","1");
        List<Blog> blogs  = mapper.queryBlogIf(map);
        for (Blog blog : blogs) {
            System.out.println(blog);
        }
        session.close();
    }

    @Test
    public void testQueryBlogWhere(){
        SqlSession session = MybatisUtils.getSession();
        BlogMapper mapper = session.getMapper(BlogMapper.class);
        HashMap<String, String> map = new HashMap<String, String>();
//        map.put("title","Mybatis如此简单");
        map.put("views","66");
        List<Blog> blogs  = mapper.queryBlogWhere(map);
        for (Blog blog : blogs) {
            System.out.println(blog);
        }
        session.close();
    }


}



