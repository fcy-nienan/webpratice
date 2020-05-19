package com.fcy.ComponentScan.Filter;

import org.springframework.core.io.Resource;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.ClassMetadata;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

public class IncludeFilter implements TypeFilter {
    private String filterName="com.fcy.ComponentScan.Filter.IncludeFilter";
    public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory) throws IOException {
        ClassMetadata classMetadata = metadataReader.getClassMetadata();
        AnnotationMetadata annotationMetadata = metadataReader.getAnnotationMetadata();
        Resource resource = metadataReader.getResource();
//        System.out.println("class:"+classMetadata.getClassName());
//        System.out.println("annotation:"+annotationMetadata.getClassName());
//        System.out.println("resource:"+resource.getFilename());
        return true;
    }
}
