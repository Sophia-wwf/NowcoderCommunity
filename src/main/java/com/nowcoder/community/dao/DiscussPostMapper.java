package com.nowcoder.community.dao;

import com.nowcoder.community.entity.DiscussPost;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface DiscussPostMapper {

    // 将来会开发一个个人主页的功能，需要用到 userid
    // 当 userid==0，就不把这个条件拼到 sql 里；否则就把它拼到 sql 里(考虑个人主页的情况) --> 动态 sql
    // 还需要考虑未来分页的可能:
    // offset: 每页起始行的行号；
    // limit: 每页最多多少条数据
    List<DiscussPost> selectDiscussPosts(int userId, int offset, int limit);

    // 查询表中一共有多少条数据，查询帖子的行数
    // @Param 可以用来给参数其别名，如果这个方法中需要动态的参数，并且这个方法有且只有一个条件，这时候必须加 @Param 注解
    int selectDiscussPostRows(@Param("userId") int userId);
}
