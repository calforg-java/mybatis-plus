package com.baomidou.mybatisplus.core.assist;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSessionFactory;

import com.baomidou.mybatisplus.core.pagination.Page;

/**
 * <p>
 * </p>
 *
 * @author yuxiaobin
 * @since 2018/2/7
 */
public interface ISqlRunner {

    String INSERT = "com.baomidou.mybatisplus.core.mapper.SqlRunner.Insert";
    String DELETE = "com.baomidou.mybatisplus.core.mapper.SqlRunner.Delete";
    String UPDATE = "com.baomidou.mybatisplus.core.mapper.SqlRunner.Update";
    String SELECT_LIST = "com.baomidou.mybatisplus.core.mapper.SqlRunner.SelectList";
    String SELECT_OBJS = "com.baomidou.mybatisplus.core.mapper.SqlRunner.SelectObjs";
    String COUNT = "com.baomidou.mybatisplus.core.mapper.SqlRunner.Count";
    String SQL_SCRIPT = "${sql}";
    String SQL = "sql";

    boolean insert(String sql, Object... args);

    boolean delete(String sql, Object... args);

    boolean update(String sql, Object... args);

    List<Map<String, Object>> selectList(String sql, Object... args);

    List<Object> selectObjs(String sql, Object... args);

    Object selectObj(String sql, Object... args);

    int selectCount(String sql, Object... args);

    Map<String, Object> selectOne(String sql, Object... args);

    Page<Map<String, Object>> selectPage(Page page, String sql, Object... args);
}