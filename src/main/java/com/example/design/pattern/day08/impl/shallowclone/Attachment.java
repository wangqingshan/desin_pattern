package com.example.design.pattern.day08.impl.shallowclone;

import java.io.Serializable;

/**
 * author 90
 * description 深度复制，要实现序列化
 * date 2019/3/17
 */
public class Attachment implements Serializable {
    /**
     * 附加名
     * @return
     */
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String downAttachement(){
        System.out.println("下载附件："+name);
        return null;
    }

}
