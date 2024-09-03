package com.heima.model.admin.pojos;
import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.annotation.IdType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
/**
 * 管理员用户信息表(AdUser)表实体类
 *
 * @author makejava
 * @since 2024-08-14 10:10:56
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("ad_user")
public class AdUser implements Serializable {
        private static final long serialVersionUID = 1L;
        
        //主键
        @TableId(value = "id", type = IdType.AUTO)
        private Integer id;
        //登录用户名
        private String name;
        //登录密码
        private String password;
        //盐
        private String salt;
        //昵称
        private String nickname;
        //头像
        private String image;
        //手机号
        private String phone;
        //状态 0 暂时不可用  1 永久不可用 9 正常可用
        private Short status;
        //邮箱
        private String email;
        //最后一次登录时间
        private Date loginTime;
        //创建时间
        private Date createdTime;
}
