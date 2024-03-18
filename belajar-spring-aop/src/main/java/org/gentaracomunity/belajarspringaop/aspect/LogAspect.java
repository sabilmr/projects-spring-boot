package org.gentaracomunity.belajarspringaop.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Aspect
@Component
@Slf4j
public class LogAspect {

//    aspectJ adalahsalah satu library yang banyak di gunakan untuk implementasi aspect oriented programming,
//    untungnya spring sudah terintegasi dengan baik dengan aspectJ,
//    sehingga kita tidak perlu  banyak melakukan pengaturan aspectJ secara manual

    @Pointcut("target(org.gentaracomunity.belajarspringaop.service.HelloService)")
    public void helloServiceMethod() {

    }

    @Before("helloServiceMethod()") // before akan dieksekusi ketika terjadi eksekusi di pointcut join point ini
    public void beforeHelloServiceMethod(JoinPoint joinPoint) {
        String className = joinPoint.getTarget().getClass().getName();
        String methodName = joinPoint.getSignature().getName();
        log.info("Before " + className + "." + methodName + "()");
    }

    @Around("")
    public Object aroundHelloServiceMethod(ProceedingJoinPoint joinPoint) throws Throwable {
        String className = joinPoint.getTarget().getClass().getName();
        String methodName = joinPoint.getSignature().getName();
        try {
            log.info("Around Before " + className + "." + methodName + "()");
            return joinPoint.proceed(joinPoint.getArgs());
        } catch (Throwable throwable){
            log.info("Around Error " + className + "." + methodName + "()");
            return throwable;
        } finally {
            log.info("Around finally " + className + "." + methodName + "()");
        }
    }

    @Pointcut("execution(* org.gentaracomunity.belajarspringaop.service.HelloService.*(java.lang.str))")
    public void pointcutHelloServiceStringParam() {

    }
}
