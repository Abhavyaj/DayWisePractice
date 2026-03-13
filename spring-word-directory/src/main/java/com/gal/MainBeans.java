package com.gal;
import java.util.Map;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.gal.algo.WordCounter;

public class MainBeans {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =new AnnotationConfigApplicationContext();
        // which package to scan for annotations
        context.scan("com.gal");
        context.refresh();
        // getting WordCounter bean
        WordCounter bean = context.getBean(WordCounter.class);
        System.out.println(bean);
        WordCounter bean2 = context.getBean(WordCounter.class);
        System.out.println(bean2);
        try {
            Map<String,Integer> result = bean.createMapResult();
            for(String file : result.keySet()){
                System.out.println(file + " -> " + result.get(file));
            }

        } catch(Exception e){
            e.printStackTrace();
        }
        // printing all beans inside spring container
        String[] beans = context.getBeanDefinitionNames();
        for(String name : beans){
            System.out.println(name);
        }

    }
}
