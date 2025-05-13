package hello.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(

        basePackages = "hello.core.member",
        basePackageClasses = AutoAppConfig.class,
        //요즘은 패키지 위치를 지정하지 않고 설정 정보 클래스의 위치를 최상단에 둔다(ex)com.hello
        excludeFilters= @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class)
)
public class AutoAppConfig {

}
