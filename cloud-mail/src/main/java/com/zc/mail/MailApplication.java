package com.zc.mail;


import com.zc.server.pojo.MailConstants;
import org.springframework.amqp.core.Queue;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;


/**
 * Mail启动器
 *
 * @Author MoYu
 * @Date 2021/5/18 17:21
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class MailApplication {

    public static void main(String[] args) {
        SpringApplication.run(MailApplication.class, args);
    }

    @Bean
    public Queue queue(){
        return new Queue(MailConstants.MAIL_QUEUQE_NAME);
    }

}

