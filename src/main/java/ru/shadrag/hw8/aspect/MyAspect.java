package ru.shadrag.hw8.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;

@Aspect
@Component
public class MyAspect {

    @After(value = "@annotation(ru.shadrag.hw8.annotation.UserActivityChecked)")
    public void userActivityCheck(JoinPoint joinPoint)  {
        try(FileWriter writer = new FileWriter("src/main/java/ru/shadrag/hw8/logs/log.txt", true))
        {
            String text = "Был вызван метод: " + joinPoint.getSignature() + " | " + new Date() + "\n";
            writer.write(text);
            writer.flush();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }


}
