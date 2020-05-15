package com.example.demo.po;

import java.util.Date;
import lombok.Data;

@Data
public class UserPO {
    private long id;
    private String name;
    private int status;
    private Date createTime;
    private Date updateTime;
}
