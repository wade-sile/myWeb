package com.test;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Man implements BeanNameAware, ApplicationContextAware, InitializingBean, DisposableBean {
    private String name;

    public Man() {
        System.out.println("��һ����ʵ������");
    }

    public void setName(String name) {
        System.out.println("�ڶ�������������");
        this.name = name;
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("������������bean������Ҳ����spring�����е����ƣ�Ҳ����idֵ" + name);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("���Ĳ����˽⹤����ϢApplicationContext");
    }
    //���岽ִ�г�ʼ��֮ǰִ�еķ���


    public void afterPropertiesSet() throws Exception {
        System.out.println("���������������ú�ִ�еķ���");
    }

    public void setup() {
        System.out.println("���߲���ִ���Լ����õĳ�ʼ������");
    }
    //�ڰ˲�ִ�г�ʼ��֮��ִ�еķ���
    public void run() {
        System.out.println("�ھŲ���ִ�������ҵ�񷽷�");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("��ʮ����ִ��spring�����ٷ���");
    }

    public void destory() {
        System.out.println("��ʮһ����ִ���Լ����õ����ٷ���");
    }
}