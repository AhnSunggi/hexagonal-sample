package io.pleaze.sample.common;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.stereotype.Component;

/**
 * 추후 MSA 전환 시 FeignClient를 적용할 부분을 명시적으로 표기하기 위한 어노테이션
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Component
public @interface Client {

  Method method();

  String url();

  enum Method {
    GET, POST, PUT, DELETE
  }
}


