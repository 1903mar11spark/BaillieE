package com.revature.aspect;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import com.revature.creatures.Animal;

@Aspect //marks class as containing advice, prevents this class's methods
		//from being advised (no autoproxing)
@Component // Spring stereotype marking LogginAspect as a Spring bean
public class LoggingAspect {
	
	private static Logger log = Logger.getRootLogger();
	
	/*
	 * Goals for logging:
	 * 1. INFO log that each method executed
	 * 2. ERROR log when exception is thrown
	 * 3. WARN log when "chase" method is called
	 */

	@AfterReturning(pointcut="within(com.revature.service.*)")
	public void logAfterReturn(JoinPoint jp) {
		log.info(jp.getSignature());
//		log.info(jp.getArgs());
	}
	
	@AfterThrowing(pointcut="within(*)", throwing="t")
	public void logAfterThrow(JoinPoint jp, Throwable t) {
		log.error(jp.getSignature()+" threw "+t.getClass() +" with stacktrace "+t.getStackTrace());
	}
	
	@Before("execution(com.revature.service.CircleOfLifeService.chase(..))")
	public void logWhenChased(JoinPoint jp) {
		Animal a1 = (Animal) jp.getArgs()[0];
		Animal a2 = (Animal) jp.getArgs()[1];
		log.warn(a1 + " is chasing " +a2);
	}
	
	//if we wanted to conrol whether the chase() mehtod even executes
	@Around("execution( *(com.revature.service.CircleOfLifeService.chase(..))")
	public void chase(ProceedingJoinPoint pjp) throws Throwable {
		Animal a1 = (Animal) pjp.getArgs()[0];
		Animal a2 = (Animal) pjp.getArgs()[1];
		if(a1.getSpeed() > a2.getSpeed()) {
			pjp.proceed();
			log.warn(a1 + " is chasing "+a2);
			log.
			}
	}
}
