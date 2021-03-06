package cn.zzy.mywebsite.Data.Mapper;

import cn.zzy.mywebsite.Data.Entity.ArticleInfo;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface ArticleInfoMapper extends IMapperHandle<ArticleInfo> {

    @Override
    @Insert("insert into articleinfo (title,time,articleID,tag) values(#{title},#{time},#{articleID},#{tag})")
    @Options(useGeneratedKeys = true, keyProperty = "id", keyColumn = "id")
    void Add(ArticleInfo articleInfo);

    @Override
    @Delete("delete from articleinfo where id=#{id}")
    void Delete(int id);

    @Override
    @Update("update articleinfo set title=#{title},time=#{time},articleID=#{articleID},tag=#{tag} where id=#{id} ")
    void Update(ArticleInfo articleInfo);

    @Override
    @Select("select * from articleinfo where id=#{id}")
    ArticleInfo Find(int id);

    @Override
    @Select("select * from articleinfo")
    List<ArticleInfo> FindAll();

    @Select("select * from articleinfo order by time desc limit #{count}")
    List<ArticleInfo> FindCountWithTimeDesc(int count);

    @Select("select * from articleinfo limit #{count}")
    List<ArticleInfo> FindCountWithTime(int count);
}
