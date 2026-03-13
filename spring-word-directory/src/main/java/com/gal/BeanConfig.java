package com.gal;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.gal.algo.WordCounter;
import com.gal.algo.FileProvider;
@Configuration
public class BeanConfig {
    @Bean
    public String dirToSearch(){
        return "C:\\Users\\jaisw\\eclipse-workspace\\Capgemini\\src\\basic";
    }
    @Bean
    public FileProvider fileProvider(){
        return new FileProvider(dirToSearch(),".java");
    }
    @Bean
    public WordCounter wordCounter(){
        WordCounter wc = new WordCounter();
        wc.setWordToSearch("System");
        wc.setFileProvider(fileProvider());
        return wc;
    }
}