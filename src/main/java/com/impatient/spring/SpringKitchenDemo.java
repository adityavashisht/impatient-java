package com.impatient.spring;



import com.lessons.spring.ChildBean;
import com.lessons.spring.CollectionListBean;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import java.util.List;

/**
 * Created by vashishta on 8/16/16.
 */
public class SpringKitchenDemo {


    public static void main(String [] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"/main-config.xml"});

        ChildBean childBean = (ChildBean) context.getBean("childBean");

        System.out.println(childBean.getName());

        DishMaker dishMaker = (DishMaker) context.getBean("dishMaker");

        Mixer mixer = dishMaker.getMixer();

        System.out.println(mixer);
        //dishMaker.makeDish()

        CollectionListBean  collectionListBean = (CollectionListBean) context.getBean("collectionListBean");

        List<String> names = collectionListBean.getNames();

        for(String name:names) {
            System.out.println(name);
        }



    }
}
