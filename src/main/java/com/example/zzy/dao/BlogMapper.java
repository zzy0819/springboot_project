package com.example.zzy.dao;
import com.example.zzy.pojo.Student;
import java.util.List;
import java.util.Map;

import com.example.zzy.pojo.Blog;

public interface BlogMapper {
    int addBlog(Blog blog);

    List<Blog> queryBlogIf(Map map);

    List<Blog> queryBlogChoose(Map map);

    List<Blog> queryBlogWhere(Map map);


}
