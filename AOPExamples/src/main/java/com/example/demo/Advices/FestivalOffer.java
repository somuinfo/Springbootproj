package com.example.demo.Advices;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import lombok.extern.slf4j.Slf4j;

@Aspect
@Slf4j
public class FestivalOffer {
	
	@Before("execution(* com.example.demo.Domain.*.*(..))")
	public void PongalOffer(JoinPoint jp)
	{
		log.info("Pongal offer called on " + JoinPoint.METHOD_CALL);
	}

	@Around("execution(* com.example.demo.Domain.*.*(..))")
	public Object PongalOffer(ProceedingJoinPoint jp) throws Throwable
	{
		Object obj = jp.proceed();
		
		if(obj instanceof Number) {
			double d = (double)obj;
			obj = d + 0.5;
		}
		log.info("Around Pongal offer called on " + JoinPoint.METHOD_CALL);
		return obj;
	}

	

}
