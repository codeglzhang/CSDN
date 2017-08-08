package com.JPAdemo.JPAdemo.modle;

import org.springframework.web.bind.annotation.RequestMapping;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by dell on 2017/8/8.
 */
@Entity
public class DateTest3 {
    @Id
    @GeneratedValue
    private Integer id;

    //存取日期+时间
    @Temporal(TemporalType.TIMESTAMP)
    private Date date1;
    //存取时间
    @Temporal(TemporalType.TIME)
    private Date date2;
    //存取日期
    @Temporal(TemporalType.DATE)
    private Date date3;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDate1() {
        return date1;
    }

    public void setDate1(Date date1) {
        this.date1 = date1;
    }

    public Date getDate2() {
        return date2;
    }

    public void setDate2(Date date2) {
        this.date2 = date2;
    }

    public Date getDate3() {
        return date3;
    }

    public void setDate3(Date date3) {
        this.date3 = date3;
    }
}
