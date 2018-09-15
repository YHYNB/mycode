package com.example.dao;

import com.example.models.Phone;
import com.example.models.cangkumodel;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface phoneMapper {
    @Select("select * from phone")
    List<Phone> selectAll();
    @Insert("insert into phone values (#{id},#{name},#{danwei},#{color},#{price},#{number})")
    void addPhone(Phone phone);
    @Delete("delete from phone where id=#{id}")
    void deletePhone(int id);
    @Select("select * from zongcang where cangku=#{type}")
    List<cangkumodel> selectBynumber(String typpe);
    @Insert("insert into phone values (#{id},#{name},#{danwei},#{color},#{price},#{number})")
    void jiliphone(Phone phone);
    @Select("select * from jilu")
    List<Phone> jiluAll();
}
