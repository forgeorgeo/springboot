package cn.demo.redis.config;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.serializer.JdkSerializationRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;


@Configuration
public class RedisConfiguration {

       /* @Autowired
        private JedisConnectionFactory jedisConnectionFactory;

        @Bean
        public RedisTemplate<String, Object> jedisTemplate(RedisConnectionFactory factory) {
            RedisTemplate<String, Object> template = new RedisTemplate<String, Object>();
            template.setConnectionFactory(jedisConnectionFactory);
            template.setKeySerializer(new StringRedisSerializer());
            template.setValueSerializer(new JdkSerializationRedisSerializer());
            template.afterPropertiesSet();
            return template;
        }*/
      
/*	@Autowired
    private RedisConnectionFactory redisConnectionFactory;
     
   *//**
     * 默认情况下bean的名称和方法名称相同，你也可以使用name属性来指定。
     * IOC容器中注册了ID为 redisTemplate的 bean。
     * @return
     *//*
    @Bean
    public RedisTemplate<String, String> redisTemplate(){
        StringRedisTemplate redisTemplate = new StringRedisTemplate(redisConnectionFactory);
        return redisTemplate;
    }*/

}
