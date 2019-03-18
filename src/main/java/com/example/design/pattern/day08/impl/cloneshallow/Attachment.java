package com.example.design.pattern.day08.impl.cloneshallow;

/**
 * author 90
 * description 附件类
 * date 2019/3/16
 */
public class Attachment {
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
