package com.nn.start.util;

import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PropertiesLoaderUtils;

import java.io.IOException;
import java.util.Properties;

public class ResourceHelper {



   public static Properties getFileProperties(String proFileName) throws IOException {

       String fileName =proFileName;
       if(!proFileName.endsWith(".properties")){
           fileName =fileName +".properties";
       }


       fileName =    ResourceHelper.class.getClassLoader().getResource(fileName).getPath();
           fileName=java.net.URLDecoder.decode(fileName,"UTF-8");

       Resource resource = new FileSystemResource(fileName);
       Properties props  = PropertiesLoaderUtils.loadProperties(resource);
        return props;
   }


}
