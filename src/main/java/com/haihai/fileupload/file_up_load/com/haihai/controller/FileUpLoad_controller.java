package com.haihai.fileupload.file_up_load.com.haihai.controller;

import com.haihai.fileupload.file_up_load.com.haihai.unZip.UnZip;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.Map;

@Controller
public class FileUpLoad_controller {

    @RequestMapping("/Test")
    public String fileUpLoad(@RequestParam("file")MultipartFile file,Map<String, Object> map) throws Exception {

        String fileName=file.getOriginalFilename();
        //String fileNameSuffix=fileName.substring(fileName.lastIndexOf(".") + 1);
        //long fileSize=file.getSize();//字节数
        String filePath="C:/Users/A/Desktop/haha/";
        File fileSaving = new File(filePath + fileName);

        try {
            file.transferTo(fileSaving);
        } catch (IOException e) {
            e.printStackTrace();
        }

        //System.out.println(fileSize);
        //System.out.println(fileNameSuffix);
        System.out.println(fileName);
        File file1=new File(filePath + fileName);
        UnZip.deCompress(file1,filePath);
        map.put("filename",fileName);

        return "success";
    }
}
