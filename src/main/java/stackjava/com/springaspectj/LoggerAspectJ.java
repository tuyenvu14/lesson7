package stackjava.com.springaspectj;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;


@Aspect
public class LoggerAspectJ {
    @Before("execution(* stackjava.com.springaspectj.Hello.*(..))")
    public void logBefore(JoinPoint joinPoint) {

        System.out.println("before method: " + joinPoint.getSignature().getName());
    }

    @After("execution(* stackjava.com.springaspectj.Hello.*(..))")
    public void longAfter(JoinPoint joinPoint) {
        System.out.println("before method : " + joinPoint.getSignature().getName());
    }

    @AfterReturning(pointcut = "execution(* stackjava.com.springaspectj.Hello.method2(..))", returning = "result")
    public void longAfterReturning(JoinPoint joinPoint, Object result) {
        System.out.println("after return method : " + joinPoint.getSignature().getName());
        System.out.println("Method return value is : " + result);
    }

    @AfterThrowing(pointcut = "execution(* stackjava.com.springaspectj.Hello.*(..))", throwing = "error")
    public void longAfterThrongwing(JoinPoint joinPoint, Throwable error) {
        System.out.println("exception in method : " + joinPoint.getSignature().getName());
        System.out.println("exception is : " + error);
    }

}

