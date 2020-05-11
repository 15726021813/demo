package com.example.demo.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "userinfo")
public class Userinfo implements Serializable {
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @TableField(value = "useremail")
    private String useremail;

    @TableField(value = "username")
    private String username;

    @TableField(value = "password")
    private String password;

    public static final String COL_ID = "id";

    public static final String COL_USEREMAIL = "useremail";

    public static final String COL_USERNAME = "username";

    public static final String COL_PASSWORD = "password";
}