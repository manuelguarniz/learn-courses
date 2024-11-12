package com.futurelabs.annotationexample;

import com.sun.jdi.InterfaceType;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@Retention(RetentionPolicy.RUNTIME)
@interface HTMLTitle {
    String title();
}

class ExportFile {
    @HTMLTitle(title = "Titulo")
    private String title;
    @HTMLTitle(title = "Fecha Export")
    private LocalDate exportDate;

    public ExportFile() { }
    public ExportFile(String title, LocalDate exportDate) {
        this.title = title;
        this.exportDate = exportDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getExportDate() {
        return exportDate;
    }

    public void setExportDate(LocalDate exportDate) {
        this.exportDate = exportDate;
    }

    public static String getHeaders() throws NoSuchFieldException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<ExportFile> exportDefinition = ExportFile.class;
        StringBuilder titleBuilder = new StringBuilder();

        Object instance = exportDefinition.getDeclaredConstructor().newInstance();
        Method[] methods = exportDefinition.getDeclaredMethods();
        Field[] attrs = exportDefinition.getDeclaredFields();

        for (Method method : methods) {
            if (method.getName().startsWith("setTitle") && method.getParameterTypes().length == 1) {
                method.setAccessible(true);
                method.invoke(instance, "Manuel");

                Field field = instance.getClass().getDeclaredField(method.getName());
            }
        }
        Method get = exportDefinition.getDeclaredMethod("getTitle");
        System.out.println(get.invoke(instance));

        int maxSeparators = attrs.length;
        for (Field field : attrs) {
            maxSeparators--;
            if (field.isAnnotationPresent(HTMLTitle.class)) {
                HTMLTitle annotation = field.getAnnotation(HTMLTitle.class);
                titleBuilder.append(annotation.title());
            }
            titleBuilder.append(maxSeparators == 0 ? "" : ",");
        }

        return titleBuilder.toString();
    }
}

public class Main {
    public static void main(String[] args) throws NoSuchFieldException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        ExportFile obj1 = new ExportFile("Titulo 1", LocalDate.now());
        ExportFile obj2 = new ExportFile("Titulo 2", LocalDate.now());
        ExportFile obj3 = new ExportFile("Titulo 3", LocalDate.now());

        List<ExportFile> list = Arrays.asList(obj1, obj2, obj3);
        System.out.println(ExportFile.getHeaders());
        for (ExportFile obj : list) {
            System.out.println(obj.getTitle() + "," + obj.getExportDate());
        }
    }
}
