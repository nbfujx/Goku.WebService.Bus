package com.goku.webservice.mapper;


import com.goku.webservice.model.*;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

/**
 * Created by nbfujx on 2017-11-01.
 */
@Repository
@CacheNamespace(implementation = org.mybatis.caches.redis.RedisCache.class)
public interface checkMapper {

     @Select("select * from goku_userinfo where usercode=#{usercode,jdbcType=VARCHAR} and useflag='Y'")
     gokuUserinfo GetUserinfo(@Param("usercode") String usercode);

     @Select("select * from goku_authority where userid=#{userid,jdbcType=VARCHAR} and bscode=#{bscode,jdbcType=VARCHAR}  and tranno=#{tranno,jdbcType=VARCHAR}")
     gokuAuthority GetAuthority(@Param("userid") String userid,@Param("bscode") String bscode,@Param("tranno") String tranno);

     @Insert(" insert into goku_tranlog (uuid,userid, bscode, tranno, " +
             "      createdate, successflag,requestxml, " +
             "      responsexml)" +
             "    values (#{uuid,jdbcType=VARCHAR},#{userid,jdbcType=VARCHAR}, #{bscode,jdbcType=VARCHAR}, #{tranno,jdbcType=VARCHAR}, " +
             "      #{createdate,jdbcType=TIMESTAMP}, #{successflag,jdbcType=VARCHAR},#{requestxml,jdbcType=LONGVARBINARY}, " +
             "      #{responsexml,jdbcType=LONGVARBINARY})")
     @SelectKey(statement=" SELECT replace(uuid(),'-','')  AS uuid",keyProperty="uuid", resultType=String.class, before=true)
     int SaveTranlog(gokuTranlogWithBLOBs gokutranlog);

     @Select("select * from goku_iplist where ipaddress=#{ipaddress,jdbcType=VARCHAR}")
     gokuIpList GetIpLimt(@Param("ipaddress") String ipaddress);

     @Select("select * from goku_bussiness where  bscode=#{bscode,jdbcType=VARCHAR}  and tranno=#{tranno,jdbcType=VARCHAR} and useflag='Y'")
     gokuBussiness GetBussiness(@Param("bscode") String bscode, @Param("tranno") String tranno);

}
