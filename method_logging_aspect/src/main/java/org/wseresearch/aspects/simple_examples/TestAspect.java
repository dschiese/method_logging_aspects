package org.wseresearch.aspects.simple_examples;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class TestAspect {

    @Pointcut("execution(* *(..))")
    public void anyMethodExecution() {
        // Pointcut to match the execution of any method
    }

    // Is executed before the called method is executed, however, the pass variables (i.e. the input arguments) are already available
    @Before("anyMethodExecution()")
    public void beforeMethodExecution(JoinPoint joinPoint) {
        Object[] args = joinPoint.getArgs();
        System.out.println("The method " + joinPoint.getSignature().getName() + " is called with the following arguments: " + args.toString());
    }

    @AfterReturning(value = "anyMethodExecution()", returning = "result")
    public void afterMethodExecution(JoinPoint joinPoint, Object result) {
        System.out.println("The method " + joinPoint.getSignature().getName() + " is returning the following result: " + result.toString());
    }
    
}
